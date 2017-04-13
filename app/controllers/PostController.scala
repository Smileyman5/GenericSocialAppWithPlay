package controllers

import javax.ejb.Singleton

import com.avaje.ebean.Model.Finder
import com.google.gson.{JsonArray, JsonObject, JsonParser, JsonPrimitive}
import models.{Friends, Friendship, PostModel}
import play.api.mvc.Controller

/**
  * Created by alex on 4/13/2017.
  */
@Singleton
class PostController extends Controller {
  var find = new Finder[String, PostModel](classOf[PostModel])
  var friendFind = new Finder[Friendship, Friends](classOf[Friends])

  def post = ContextAction { implicit request =>
    val obj = request.body.asText
    var json = new JsonObject
    if (obj.isDefined)
    {
      json = new JsonParser().parse(obj.get).asInstanceOf[JsonObject]
      val postM = new PostModel(json.get("username").getAsString, json.get("message").getAsString)
      postM.save()
      json.add("id", new JsonPrimitive(postM.id))
    }
    Ok(json.toString)
  }

  def getAllPostsByName(username: String) = ContextAction {
    val posts = new JsonArray
    val list = find.where().eq("username", username).findList
    for (user <- list.size() - 1 to 0 by -1)
    {
      val post = new JsonObject()
      post.add("username", new JsonPrimitive(list.get(user).username))
      post.add("message", new JsonPrimitive(list.get(user).messageBody))
      posts.add(post)
    }

    val friends = friendFind.where.eq("username", username).eq("status", "Confirmed").findList
    for (index <- 0 until friends.size)
    {
      val list = find.where().eq("username", friends.get(index).friendship.friend).findList
      for (i <- 0 until list.size)
      {
        val post = new JsonObject()
        post.add("username", new JsonPrimitive(list.get(i).username))
        post.add("message", new JsonPrimitive(list.get(i).messageBody))
        posts.add(post)
      }
    }

    Ok(posts.toString)
  }

  def getPostsByName(username: String) = ContextAction {
    val posts = new JsonArray
    val list = find.where().eq("username", username).findList
    for (user <- 0 until list.size)
    {
      val post = new JsonObject()
      post.add(list.get(user).username, new JsonPrimitive(list.get(user).messageBody))
      posts.add(post)
    }
    Ok(posts.toString)
  }

  def getPostById(id: Long) = ContextAction {
    val post = new JsonObject()
    val list = find.byId(id.toString)
    post.add(list.username, new JsonPrimitive(list.messageBody))
    Ok(post.toString)
  }

  def getPostsByFriends(username: String) = ContextAction {
    val posts = new JsonArray()
    val friends = friendFind.where.eq("username", username).eq("status", "Confirmed").findList
    for (index <- 0 until friends.size)
    {
      val list = find.where().eq("username", friends.get(index).friendship.friend).findList
      for (i <- 0 until list.size)
        {
          println(list.get(i))
          posts.add(list.get(i).messageBody)
        }
    }

    Ok(posts.toString)
  }
}
