package controllers

import javax.ejb.Singleton
import com.avaje.ebean.Model.Finder
import models.{User, UserModel}
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc.Controller

/**
  * Created by alex on 3/26/2017.
  */
@Singleton
class RegisterController extends Controller {
  var find = new Finder[String, User](classOf[User])

  def userForm = Form(mapping("Username" -> nonEmptyText(2),
                                  "Password" -> nonEmptyText(2),
                                  "RePassword" -> nonEmptyText(2))
                                  (UserModel.apply)(UserModel.unapply))
  def displayPage = ContextAction {
    Ok(views.html.register(userForm, ""))
  }

  def register = ContextAction { implicit request =>
    userForm.bindFromRequest().fold(
        formWithErrors => { PartialContent(views.html.register(formWithErrors, "")) },
        user => {
          val form = Map("Username" -> user.username)
          if (user.password != user.repassword)
            NotAcceptable(views.html.register(userForm.bind(form), "Passwords do not match"))
          else if (find.byId(user.username) != null)
            NotAcceptable(views.html.register(userForm.bind(form), "Username already taken. :/"))
          else
          {
            User.createUser(user.username, user.password)
            Ok(views.html.profile(user.username))
          }
      })
  }
}