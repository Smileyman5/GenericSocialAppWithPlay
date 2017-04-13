
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Profile</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
    <script>
        window.onload = function WindowLoad(event) """),format.raw/*11.52*/("""{"""),format.raw/*11.53*/("""
            """),format.raw/*12.13*/("""getPosts()
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/(""";

        function getPosts() """),format.raw/*15.29*/("""{"""),format.raw/*15.30*/("""
            """),format.raw/*16.13*/("""let req = new XMLHttpRequest();
            req.onreadystatechange = function() """),format.raw/*17.49*/("""{"""),format.raw/*17.50*/("""
                """),format.raw/*18.17*/("""if (req.readyState == 4 && req.status == 200) """),format.raw/*18.63*/("""{"""),format.raw/*18.64*/("""
                    """),format.raw/*19.21*/("""let res = JSON.parse(req.responseText);
                    console.log(res);
                    console.log(res[0]);
                    document.getElementById('profilePosts').innerHTML = "<br/><br/><div class='container'>" +
                            "   <div class='row'>\n";
                    for (index in res)
                        document.getElementById('profilePosts').innerHTML += "   <div class='col s6 m4 z-depth-2'>" +
                                "           <h5 class='center'>" + res[index].username + "</h5>\n" +
                                "           <p class='center'>" + res[index].message + "</p>\n" +
                                "   </div>\n";

                    document.getElementById('profilePosts').innerHTML += "   </div>\n" +
                            "</div>\n";

                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/("""
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/(""";
            req.open("GET", "http://localhost:9000/posts/all/"""),_display_(/*35.63*/username),format.raw/*35.71*/("""", true);
            req.send(null);
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""

        """),format.raw/*39.9*/("""function search(name, item) """),format.raw/*39.37*/("""{"""),format.raw/*39.38*/("""
            """),format.raw/*40.13*/("""let req = new XMLHttpRequest();
            req.onreadystatechange = function() """),format.raw/*41.49*/("""{"""),format.raw/*41.50*/("""
                """),format.raw/*42.17*/("""if (req.readyState == 4 && req.status == 200) """),format.raw/*42.63*/("""{"""),format.raw/*42.64*/("""
                    """),format.raw/*43.21*/("""let res = JSON.parse(req.responseText);
                    document.getElementsByClassName("search-results").item(item).innerHTML = "";
                    for (index in res)
                        document.getElementsByClassName("search-results").item(item).innerHTML += "<a style='z-index: 5' href='#!'>" + res[index] + "</a>\n"
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/("""
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/(""";
            req.open("GET", "http://localhost:9000/restful/search/" + name, true);
            req.send(null);
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""

        """),format.raw/*53.9*/("""function post() """),format.raw/*53.25*/("""{"""),format.raw/*53.26*/("""
            """),format.raw/*54.13*/("""let msg = document.getElementById('icon_prefix2').value;
            if (msg.length > 0) """),format.raw/*55.33*/("""{"""),format.raw/*55.34*/("""
                """),format.raw/*56.17*/("""let req = new XMLHttpRequest();
                req.onreadystatechange = function () """),format.raw/*57.54*/("""{"""),format.raw/*57.55*/("""
                    """),format.raw/*58.21*/("""if (req.readyState == 4 && req.status == 200) """),format.raw/*58.67*/("""{"""),format.raw/*58.68*/("""
                        """),format.raw/*59.25*/("""let res = JSON.parse(req.responseText);
                        getPosts()
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/("""
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/(""";
                req.open("POST", "http://localhost:9000/post", true);
                let obj = """),format.raw/*64.27*/("""{"""),format.raw/*64.28*/("""
                    """),format.raw/*65.21*/(""""username": """"),_display_(/*65.35*/username),format.raw/*65.43*/("""",
                    "message": msg
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/(""";
                req.send(JSON.stringify(obj));
                document.getElementById('icon_prefix2').value = ""
            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/("""
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/("""
    """),format.raw/*72.5*/("""</script>
</head>
<body>
    <div class="navbar-fixed">
        <nav class="nav-extended">
            <div class="nav-wrapper blue">
                <ul id="slide-out" class="right side-nav">
                    <li class="logo center">
                        <img src="https://www.drupal.org/files/profile_default.jpg" alt="" class="circle" width="64" height="64">
                    </li>
                    <li class="search">
                        <form action="javascript:search(document.getElementById('search1').getElementsByClassName('black-text')[0].value, 0)" autocomplete="off">
                            <div id="search1" class="search-wrapper">
                                <input id="search" class="black-text">
                                <div class="search-results"></div>
                            </div>
                        </form>
                    </li>
                    <li><a href=""""),_display_(/*90.35*/routes/*90.41*/.ProfileController.displayPage),format.raw/*90.71*/("""">Profile</a></li>
                    <li><a href=""""),_display_(/*91.35*/routes/*91.41*/.FriendController.displayPage(username)),format.raw/*91.80*/("""">Friends</a></li>
                    """),format.raw/*92.105*/("""
                    """),format.raw/*93.21*/("""<li><a class="red-text" href=""""),_display_(/*93.52*/routes/*93.58*/.LoginController.displayPage),format.raw/*93.86*/("""">Logout</a></li>
                </ul>
                <ul class="right hide-on-med-and-down">
                    <li>
                        <form action="javascript:search(document.getElementById('search2').getElementsByClassName('mainSearchBar')[0].value, 1)" autocomplete="off">
                            <div id="search2" class="input-field" style="height: 64px">
                                <input id="search" type="search" class="mainSearchBar"/>
                                <label for="search"><i class="material-icons">search</i></label>
                                <div class="search-results blue"></div>
                            </div>
                        </form>
                    </li>
                    <li><a href=""""),_display_(/*105.35*/routes/*105.41*/.FriendController.displayPage(username)),format.raw/*105.80*/("""">Friends</a></li>
                    """),format.raw/*106.105*/("""
                    """),format.raw/*107.21*/("""<li><a class="red-text" href=""""),_display_(/*107.52*/routes/*107.58*/.LoginController.displayPage),format.raw/*107.86*/("""">Logout</a></li>
                </ul>
                <a href="#" data-activates="slide-out" class="button-collapse right"><i class="material-icons">menu</i></a>

                <a href=""""),_display_(/*111.27*/routes/*111.33*/.ProfileController.displayPage()),format.raw/*111.65*/("""" class="brand-logo left">Hello, """),_display_(/*111.99*/username),format.raw/*111.107*/("""!</a>

            </div>
        </nav>
    </div>

    <!-- Main Content Start -->

    <div class="row">
        <form class="col s12">
            <div class="row">
                <div class="input-field col s12">
                    <a href="javascript:post()" class="btn-floating halfway-fab waves-effect waves-light blue" style="float: right"><i class="material-icons prefix">send</i></a>
                    <textarea id="icon_prefix2" class="materialize-textarea" style="overflow: hidden; padding-right: .5em;"></textarea>
                    <label for="icon_prefix2">Message</label>
                </div>
            </div>
        </form>
    </div>

    <div id="profilePosts"></div>

    <!--  Main Content End  -->

    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
    <script>
        $(document).ready(function () """),format.raw/*138.39*/("""{"""),format.raw/*138.40*/("""
            """),format.raw/*139.13*/("""$('.button-collapse').sideNav();
        """),format.raw/*140.9*/("""}"""),format.raw/*140.10*/(""")

        $('#textarea1').trigger('autoresize');
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Thu Apr 13 14:08:51 EDT 2017
                  SOURCE: C:/Users/alex/Coding/CSC435/SocialAppRepo/PlayGSA/app/views/profile.scala.html
                  HASH: b007954422ee090e6dd229354dfbfd35df2172d3
                  MATRIX: 749->1|862->19|892->23|1350->453|1379->454|1421->468|1468->488|1497->489|1558->522|1587->523|1629->537|1738->618|1767->619|1813->637|1887->683|1916->684|1966->706|2841->1553|2870->1554|2912->1568|2941->1569|3033->1634|3062->1642|3137->1690|3166->1691|3205->1703|3261->1731|3290->1732|3332->1746|3441->1827|3470->1828|3516->1846|3590->1892|3619->1893|3669->1915|4050->2268|4079->2269|4121->2283|4150->2284|4301->2408|4330->2409|4369->2421|4413->2437|4442->2438|4484->2452|4602->2542|4631->2543|4677->2561|4791->2647|4820->2648|4870->2670|4944->2716|4973->2717|5027->2743|5152->2840|5181->2841|5227->2859|5256->2860|5384->2960|5413->2961|5463->2983|5504->2997|5533->3005|5617->3061|5646->3062|5805->3193|5834->3194|5871->3204|5900->3205|5933->3211|6909->4160|6924->4166|6975->4196|7056->4250|7071->4256|7131->4295|7200->4419|7250->4441|7308->4472|7323->4478|7372->4506|8171->5277|8187->5283|8248->5322|8318->5446|8369->5468|8428->5499|8444->5505|8494->5533|8717->5728|8733->5734|8787->5766|8849->5800|8880->5808|9968->6867|9998->6868|10041->6882|10111->6924|10141->6925
                  LINES: 27->1|32->1|34->3|42->11|42->11|43->12|44->13|44->13|46->15|46->15|47->16|48->17|48->17|49->18|49->18|49->18|50->19|64->33|64->33|65->34|65->34|66->35|66->35|68->37|68->37|70->39|70->39|70->39|71->40|72->41|72->41|73->42|73->42|73->42|74->43|78->47|78->47|79->48|79->48|82->51|82->51|84->53|84->53|84->53|85->54|86->55|86->55|87->56|88->57|88->57|89->58|89->58|89->58|90->59|92->61|92->61|93->62|93->62|95->64|95->64|96->65|96->65|96->65|98->67|98->67|101->70|101->70|102->71|102->71|103->72|121->90|121->90|121->90|122->91|122->91|122->91|123->92|124->93|124->93|124->93|124->93|136->105|136->105|136->105|137->106|138->107|138->107|138->107|138->107|142->111|142->111|142->111|142->111|142->111|169->138|169->138|170->139|171->140|171->140
                  -- GENERATED --
              */
          