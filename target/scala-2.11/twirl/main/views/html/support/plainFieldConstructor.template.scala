
package views.html.support

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object plainFieldConstructor_Scope0 {
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

class plainFieldConstructor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<label for='"""),_display_(/*3.14*/elements/*3.22*/.id),format.raw/*3.25*/("""'>"""),_display_(/*3.28*/elements/*3.36*/.label),format.raw/*3.42*/("""</label>
"""),_display_(/*4.2*/elements/*4.10*/.input),format.raw/*4.16*/("""
"""),_display_(/*5.2*/if(elements.hasErrors)/*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<p style="color: red">*"""),_display_(/*6.29*/elements/*6.37*/.errors),format.raw/*6.44*/("""</p>
""")))}))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}

/**/
object plainFieldConstructor extends plainFieldConstructor_Scope0.plainFieldConstructor
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 11:03:20 EDT 2017
                  SOURCE: C:/Users/alex/Coding/CSC435/SocialAppRepo/PlayGSA/app/views/support/plainFieldConstructor.scala.html
                  HASH: 02d923ccba025366e460c787ecae4e75eb04c299
                  MATRIX: 799->1|926->33|956->37|995->50|1011->58|1034->61|1063->64|1079->72|1105->78|1141->89|1157->97|1183->103|1211->106|1241->128|1279->129|1311->135|1361->159|1377->167|1404->174
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|37->6
                  -- GENERATED --
              */
          