
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.api.data.Form[UserModel],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.api.data.Form[UserModel], message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*6.2*/header/*6.8*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.12*/("""
    """),format.raw/*7.5*/("""<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
    <style>
    body """),format.raw/*10.10*/("""{"""),format.raw/*10.11*/("""
        """),format.raw/*11.9*/("""display: flex;
        min-height: 100vh;
        flex-direction: column;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""

    """),format.raw/*16.5*/("""main """),format.raw/*16.10*/("""{"""),format.raw/*16.11*/("""
        """),format.raw/*17.9*/("""flex: 1 0 auto;
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""

    """),format.raw/*20.5*/("""body """),format.raw/*20.10*/("""{"""),format.raw/*20.11*/("""
        """),format.raw/*21.9*/("""background: #fff;
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/("""

    """),format.raw/*24.5*/(""".input-field input[type=date]:focus + label,
    .input-field input[type=text]:focus + label,
    .input-field input[type=email]:focus + label,
    .input-field input[type=password]:focus + label """),format.raw/*27.53*/("""{"""),format.raw/*27.54*/("""
        """),format.raw/*28.9*/("""color: #e91e63;
    """),format.raw/*29.5*/("""}"""),format.raw/*29.6*/("""

    """),format.raw/*31.5*/(""".input-field input[type=date]:focus,
    .input-field input[type=text]:focus,
    .input-field input[type=email]:focus,
    .input-field input[type=password]:focus """),format.raw/*34.45*/("""{"""),format.raw/*34.46*/("""
        """),format.raw/*35.9*/("""border-bottom: 2px solid #e91e63;
        box-shadow: none;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
    """),format.raw/*38.5*/("""</style>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
""")))};implicit def /*4.2*/implicitField/*4.15*/ = {{ FieldConstructor(support.plainFieldConstructor.apply) }};
Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*4.76*/("""

"""),format.raw/*41.2*/("""
"""),_display_(/*42.2*/main("Welcome to the GSA!", header)/*42.37*/ {_display_(Seq[Any](format.raw/*42.39*/("""
    """),format.raw/*43.5*/("""<div class="section"></div>
    <main>
        <h3 class="indigo-text center">Register Account</h3>
        <div class="section"></div>

        <div class="container center">
            <div class="z-depth-1 grey lighten-4 row" style="display: inline-block; padding: 32px 48px 0px 48px; border: 1px solid #EEE;">
                """),_display_(/*50.18*/form(action=routes.RegisterController.register())/*50.67*/ {_display_(Seq[Any](format.raw/*50.69*/("""
                    """),_display_(/*51.22*/if(message != "")/*51.39*/{_display_(Seq[Any](format.raw/*51.40*/("""
                        """),format.raw/*52.25*/("""<p style='color: red'>"""),_display_(/*52.48*/message),format.raw/*52.55*/("""</p>
                    """)))}),format.raw/*53.22*/("""

                    """),format.raw/*55.21*/("""<div class="row">
                        <div class='input-field col s12'>
                            """),_display_(/*57.30*/inputText(userForm("Username"))),format.raw/*57.61*/("""
                        """),format.raw/*58.25*/("""</div>
                    </div>
                    <div class="row">
                        <div class='input-field col s12'>
                            """),_display_(/*62.30*/inputPassword(userForm("Password"))),format.raw/*62.65*/("""
                        """),format.raw/*63.25*/("""</div>
                    </div>
                    <div class="row">
                        <div class='input-field col s12'>
                            """),_display_(/*67.30*/inputPassword(userForm("RePassword"), '_label -> "Retype Password")),format.raw/*67.97*/("""
                        """),format.raw/*68.25*/("""</div>
                    </div>
                    <div class='row'>
                        <button type='submit' name='btn_login' class='col s12 btn btn-large waves-effect indigo'>Register</button>
                    </div>
                """)))}),format.raw/*73.18*/("""
            """),format.raw/*74.13*/("""</div>
        </div>
        <section class="center">
            <a class='blue-text' href=""""),_display_(/*77.41*/routes/*77.47*/.LoginController.displayPage),format.raw/*77.75*/(""""><strong>Login</strong></a>
        </section>
        <p>Already have friends here? Search <a href=""""),_display_(/*79.56*/routes/*79.62*/.SearchController.displayPage),format.raw/*79.91*/("""">here</a>.</p>
    </main>
""")))}),format.raw/*81.2*/("""
"""))
      }
    }
  }

  def render(userForm:play.api.data.Form[UserModel],message:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,message)

  def f:((play.api.data.Form[UserModel],String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,message) => apply(userForm,message)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 04:09:03 EDT 2017
                  SOURCE: C:/Users/alex/Coding/CSC435/SocialAppRepo/PlayGSA/app/views/register.scala.html
                  HASH: 36fb3f0c192bf4cfc0c6c51d03a4f1f37c55e168
                  MATRIX: 781->1|932->161|945->167|1025->171|1057->177|1329->421|1358->422|1395->432|1503->513|1531->514|1566->522|1599->527|1628->528|1665->538|1713->559|1741->560|1776->568|1809->573|1838->574|1875->584|1925->607|1953->608|1988->616|2215->815|2244->816|2281->826|2329->847|2357->848|2392->856|2587->1023|2616->1024|2653->1034|2746->1100|2774->1101|2807->1107|3099->82|3120->95|3211->59|3242->156|3273->1368|3302->1371|3346->1406|3386->1408|3419->1414|3785->1753|3843->1802|3883->1804|3933->1827|3959->1844|3998->1845|4052->1871|4102->1894|4130->1901|4188->1928|4240->1952|4374->2059|4426->2090|4480->2116|4670->2279|4726->2314|4780->2340|4970->2503|5058->2570|5112->2596|5395->2848|5437->2862|5562->2960|5577->2966|5626->2994|5758->3099|5773->3105|5823->3134|5884->3165
                  LINES: 27->1|31->6|31->6|33->6|34->7|37->10|37->10|38->11|41->14|41->14|43->16|43->16|43->16|44->17|45->18|45->18|47->20|47->20|47->20|48->21|49->22|49->22|51->24|54->27|54->27|55->28|56->29|56->29|58->31|61->34|61->34|62->35|64->37|64->37|65->38|68->4|68->4|69->1|71->4|73->41|74->42|74->42|74->42|75->43|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|87->55|89->57|89->57|90->58|94->62|94->62|95->63|99->67|99->67|100->68|105->73|106->74|109->77|109->77|109->77|111->79|111->79|111->79|113->81
                  -- GENERATED --
              */
          