package controllers

import java.util
import javax.inject._

import play.libs.Json
import play.api.mvc._
import play.db.Database
import play.twirl.api.Html

import scala.collection.mutable.ListBuffer

/**
  * Created by alex on 3/26/2017.
  */
@Singleton
class FriendRecController @Inject() (db : Database) extends Controller {

  def getHtml(name : String) = ContextAction { implicit request =>
    var htmlCode: Html = Html("")
    if (name != "") {
      val stmt = db.getConnection().createStatement()
      val result = stmt.executeQuery("Select * from friends where username='" + name + "'")
      val builder = StringBuilder.newBuilder

      val friends = new ListBuffer[String]()
      while (result.next)
        friends += result.getString("friend")

      builder.append("<ul>")
      for (friend <- friends)
      {
        val res = stmt.executeQuery("Select * from friends where username='" + friend + "'")
        while (res.next)
        {
           val rec = res.getString("friend")
          if (rec != name)
             builder.append("<li>").append(rec).append("</li>")
        }
      }
      builder.append("</ul>")
      htmlCode = Html(builder.toString())
    }
    Ok(views.html.search(htmlCode))
  }

  def getJson(name : String) = ContextAction { implicit request =>
    val jsonArray = Json.newArray()
    val jsonCode = Json.newObject()

    if (name != "") {
      val stmt = db.getConnection().createStatement()
      val result = stmt.executeQuery("Select * from friends where username='" + name + "'")

      val friends = new ListBuffer[String]()
      while (result.next)
        friends += result.getString("friend")

      val doubles = new util.ArrayList[String]()
      for (friend <- friends)
      {
        val res = stmt.executeQuery("Select * from friends where username='" + friend + "'")
        while (res.next)
        {
          val rec = res.getString("friend")
          if (rec != name && !doubles.contains(rec) && !friends.contains(rec))
            jsonArray.add(rec)
          doubles.add(rec)
        }
      }
      if (jsonArray.size() == 0)
      {
        val result = stmt.executeQuery("Select * from users")
        while (result.next)
          if (result.getString("username") != name && !friends.contains(result.getString("username")))
            jsonArray.add(result.getString("username"))
      }

      jsonCode.set(name, jsonArray)
    }
    Ok(jsonCode.toString)
  }
}