
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

    <head>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
        <style>
        body """),format.raw/*10.14*/("""{"""),format.raw/*10.15*/("""
            """),format.raw/*11.13*/("""display: flex;
            min-height: 100vh;
            flex-direction: column;
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""

        """),format.raw/*16.9*/("""main """),format.raw/*16.14*/("""{"""),format.raw/*16.15*/("""
            """),format.raw/*17.13*/("""flex: 1 0 auto;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""

        """),format.raw/*20.9*/("""body """),format.raw/*20.14*/("""{"""),format.raw/*20.15*/("""
            """),format.raw/*21.13*/("""background: #fff;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""

        """),format.raw/*24.9*/(""".input-field input[type=date]:focus + label,
        .input-field input[type=text]:focus + label,
        .input-field input[type=email]:focus + label,
        .input-field input[type=password]:focus + label """),format.raw/*27.57*/("""{"""),format.raw/*27.58*/("""
            """),format.raw/*28.13*/("""color: #e91e63;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""

        """),format.raw/*31.9*/(""".input-field input[type=date]:focus,
        .input-field input[type=text]:focus,
        .input-field input[type=email]:focus,
        .input-field input[type=password]:focus """),format.raw/*34.49*/("""{"""),format.raw/*34.50*/("""
            """),format.raw/*35.13*/("""border-bottom: 2px solid #e91e63;
            box-shadow: none;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
        """),format.raw/*38.9*/("""</style>
        <script>
                function login() """),format.raw/*40.34*/("""{"""),format.raw/*40.35*/("""
                    """),format.raw/*41.21*/("""if (document.getElementById("username").value.length > 1 && document.getElementById("password").value.length > 1) """),format.raw/*41.135*/("""{"""),format.raw/*41.136*/("""
                        """),format.raw/*42.25*/("""let req = new XMLHttpRequest();
                        req.onreadystatechange = function () """),format.raw/*43.62*/("""{"""),format.raw/*43.63*/("""
                            """),format.raw/*44.29*/("""if (req.readyState == 4 && req.status == 200) """),format.raw/*44.75*/("""{"""),format.raw/*44.76*/("""
                                """),format.raw/*45.33*/("""var res = JSON.parse(req.responseText);
                                if (res.criteria) """),format.raw/*46.51*/("""{"""),format.raw/*46.52*/("""
                                    """),format.raw/*47.37*/("""document.getElementById('message').innerHTML = "<p style='color: red'>Some fields are not filled</p><br><br>";
                                """),format.raw/*48.33*/("""}"""),format.raw/*48.34*/("""
                                """),format.raw/*49.33*/("""else if (res.failed) """),format.raw/*49.54*/("""{"""),format.raw/*49.55*/("""
                                    """),format.raw/*50.37*/("""document.getElementById('message').innerHTML = "<p style='color: red'>Username/Password is incorrect</font><br><br>";
                                """),format.raw/*51.33*/("""}"""),format.raw/*51.34*/("""
                                """),format.raw/*52.33*/("""else if (res.loggedin) """),format.raw/*52.56*/("""{"""),format.raw/*52.57*/("""
                                    """),format.raw/*53.37*/("""updateStats();
                                """),format.raw/*54.33*/("""}"""),format.raw/*54.34*/("""
                                """),format.raw/*55.33*/("""document.getElementById('password').value = ""
                            """),format.raw/*56.29*/("""}"""),format.raw/*56.30*/("""
                        """),format.raw/*57.25*/("""}"""),format.raw/*57.26*/(""";
                        req.open("POST", "http://localhost:9000/login/" + document.getElementById("username").value + "/" + document.getElementById("password").value, true);
                        req.send(null);
                    """),format.raw/*60.21*/("""}"""),format.raw/*60.22*/("""
                """),format.raw/*61.17*/("""}"""),format.raw/*61.18*/("""

                """),format.raw/*63.17*/("""function updateStats() """),format.raw/*63.40*/("""{"""),format.raw/*63.41*/("""
                    """),format.raw/*64.21*/("""let req = new XMLHttpRequest();
                    req.onreadystatechange = function() """),format.raw/*65.57*/("""{"""),format.raw/*65.58*/("""
                        """),format.raw/*66.25*/("""if (req.readyState == 4 && req.status == 200) """),format.raw/*66.71*/("""{"""),format.raw/*66.72*/("""
                            """),format.raw/*67.29*/("""sessionStorage.setItem('username', document.getElementById("username").value);
                            window.location.href = "http://localhost:9000/profile";
                        """),format.raw/*69.25*/("""}"""),format.raw/*69.26*/("""
                    """),format.raw/*70.21*/("""}"""),format.raw/*70.22*/(""";
                    req.open("POST", "http://localhost:9000/stats/" + document.getElementById("username").value, true);
                    req.send(null);
                """),format.raw/*73.17*/("""}"""),format.raw/*73.18*/("""
        """),format.raw/*74.9*/("""</script>
    </head>

    <body>
        <div class="section"></div>
        <main>
            <h5 class="indigo-text center">Login to Generic Social App</h5>
            <div class="section"></div>

            <div class="container center">
                <div class="z-depth-1 grey lighten-4 row" style="display: inline-block; padding: 32px 48px 0px 48px; border: 1px solid #EEE;">
                    <div class='row'>
                        <div id="message" class='col s12'>
                        </div>
                    </div>
                    <form action="javascript:login()">
                    <div class='row'>
                        <div class='input-field col s12'>
                            <input class='validate' type='text' name='username' id='username' minlength="2" required/>
                            <label for='username'>Enter your username</label>
                        </div>
                    </div>

                    <div class='row'>
                        <div class='input-field col s12'>
                            <input class='validate' type='password' name='password' id='password' minlength="2" required/>
                            <label for='password'>Enter your password</label>
                        </div>
                        <label style='float: right;'>
                            <a class='pink-text' href='#!'><b>Forgot Password?</b></a>
                        </label>
                    </div>

                    <br />
                    <div class='row'>
                        <button type='submit' name='btn_login' class='col s12 btn btn-large waves-effect indigo'>Login</button>
                    </div>
                    </form>
                </div>
            </div>
            <section class="center">
                <a class='blue-text' href='register'><strong>Create Account</strong></a>
            </section>
        </main>

        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
    </body>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 11:32:19 EDT 2017
                  SOURCE: C:/Users/alex/Coding/CSC435/SocialAppRepo/PlayGSA/app/views/login.scala.html
                  HASH: 104a3a9c8365e313922169d3a47e54ef9369a305
                  MATRIX: 738->1|834->3|864->7|1205->320|1234->321|1276->335|1396->428|1425->429|1464->441|1497->446|1526->447|1568->461|1620->486|1649->487|1688->499|1721->504|1750->505|1792->519|1846->546|1875->547|1914->559|2153->770|2182->771|2224->785|2276->810|2305->811|2344->823|2551->1002|2580->1003|2622->1017|2723->1091|2752->1092|2789->1102|2878->1163|2907->1164|2957->1186|3100->1300|3130->1301|3184->1327|3306->1421|3335->1422|3393->1452|3467->1498|3496->1499|3558->1533|3677->1624|3706->1625|3772->1663|3944->1807|3973->1808|4035->1842|4084->1863|4113->1864|4179->1902|4358->2053|4387->2054|4449->2088|4500->2111|4529->2112|4595->2150|4671->2198|4700->2199|4762->2233|4866->2309|4895->2310|4949->2336|4978->2337|5245->2576|5274->2577|5320->2595|5349->2596|5397->2616|5448->2639|5477->2640|5527->2662|5644->2751|5673->2752|5727->2778|5801->2824|5830->2825|5888->2855|6105->3044|6134->3045|6184->3067|6213->3068|6418->3245|6447->3246|6484->3256
                  LINES: 27->1|32->1|34->3|41->10|41->10|42->11|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|53->22|53->22|55->24|58->27|58->27|59->28|60->29|60->29|62->31|65->34|65->34|66->35|68->37|68->37|69->38|71->40|71->40|72->41|72->41|72->41|73->42|74->43|74->43|75->44|75->44|75->44|76->45|77->46|77->46|78->47|79->48|79->48|80->49|80->49|80->49|81->50|82->51|82->51|83->52|83->52|83->52|84->53|85->54|85->54|86->55|87->56|87->56|88->57|88->57|91->60|91->60|92->61|92->61|94->63|94->63|94->63|95->64|96->65|96->65|97->66|97->66|97->66|98->67|100->69|100->69|101->70|101->70|104->73|104->73|105->74
                  -- GENERATED --
              */
          