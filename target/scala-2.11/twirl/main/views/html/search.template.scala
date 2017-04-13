
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message : Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("GSA Search")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<h1>Search Page</h1>
    """),_display_(/*5.6*/helper/*5.12*/.form(action = routes.SearchController.displayPage)/*5.63*/ {_display_(Seq[Any](format.raw/*5.65*/("""
    """),format.raw/*6.5*/("""  Search for a name: <input type="text" name="name"><br>
      <input type="submit" value="Search">
    """)))}),format.raw/*8.6*/("""
    """),format.raw/*9.5*/("""<p>Still need to register? Go <a href=""""),_display_(/*9.45*/routes/*9.51*/.RegisterController.register),format.raw/*9.79*/("""">here</a>.</p>
    """),_display_(/*10.6*/message),format.raw/*10.13*/("""
""")))}))
      }
    }
  }

  def render(message:Html): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Wed Apr 05 22:26:53 EDT 2017
                  SOURCE: C:/Users/alex/Coding/CSC435/SocialAppRepo/PlayGSA/app/views/search.scala.html
                  HASH: 5f7f3a05c7630b549d7144168ebb3c4168350531
                  MATRIX: 745->1|856->17|886->22|912->40|951->42|983->48|1035->75|1049->81|1108->132|1147->134|1179->140|1315->247|1347->253|1413->293|1427->299|1475->327|1523->349|1551->356
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|36->5|37->6|39->8|40->9|40->9|40->9|40->9|41->10|41->10
                  -- GENERATED --
              */
          