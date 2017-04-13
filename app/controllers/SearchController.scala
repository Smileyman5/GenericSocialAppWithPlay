package controllers

import javax.inject.{Inject, Singleton}

import com.google.gson.{JsonArray, JsonObject, JsonPrimitive}
import play.api.mvc.Controller
import play.db.Database
import play.twirl.api.Html

/**
  * Created by alex on 3/26/2017.
  */
@Singleton
class SearchController @Inject() (db : Database) extends Controller {
  "Hi".hashCode
  def displayPage = ContextAction { implicit request =>
    val name = request.getQueryString("name")
    var htmlCode: Html = Html("")
    if (name.isDefined) {
      val stmt = db.getConnection().createStatement()
      val result = stmt.executeQuery("Select username from users")
      val builder = StringBuilder.newBuilder
      builder.append("<ul>")
      while (result.next()) {
        if (result.getString("username").toLowerCase.contains(name.get.toLowerCase) || name.get.contains(result.getString("username").toLowerCase()))
          builder.append("<li>").append(result.getString("username")).append("</li>")
      }
      builder.append("</ul>")
      htmlCode = Html(builder.toString())
    }
    Ok(views.html.search(htmlCode))
  }

  def getJson(name: String) = ContextAction { implicit request =>
    val arr = new JsonArray()
    val stmt = db.getConnection().createStatement()
    val result = stmt.executeQuery("Select username from users")
    while (result.next()) {
      if (result.getString("username").toLowerCase.contains(name.toLowerCase) || name.contains(result.getString("username").toLowerCase()))
        arr.add(new JsonPrimitive(result.getString("username")))
    }
    Ok(arr.toString)
  }

}
