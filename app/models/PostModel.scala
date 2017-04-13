package models

import javax.persistence.{Entity, Id, Table}

import com.avaje.ebean.Model
import play.data.validation.Constraints

/**
  * Created by alex on 4/13/2017.
  */
@Entity
@Table(name = "Posts")
class PostModel(user: String, msg: String) extends Model {

  @Id
  val id: Long = 0

  @Constraints.Required
  val username : String = user

  @Constraints.Required
  val messageBody: String = msg

  val likes : Int = 0

  var find = new Model.Finder[String, PostModel](classOf[PostModel])

  def getUsername: String = username

  def getMessageBody: String = messageBody

  def getLikes: Int = likes
}
