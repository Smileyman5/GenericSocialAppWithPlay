
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object friends_Scope0 {
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

class friends extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/headParts/*3.11*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.15*/("""
    """),format.raw/*4.5*/("""<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">

    <style>
        .tabs .indicator """),format.raw/*9.26*/("""{"""),format.raw/*9.27*/("""
            """),format.raw/*10.13*/("""background-color: white;
            height: 5px;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
    """),format.raw/*13.5*/("""</style>
    <script>
        window.onload = function WindowLoad(event) """),format.raw/*15.52*/("""{"""),format.raw/*15.53*/("""
            """),format.raw/*16.13*/("""getProfile();
            getRecs();
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/(""";

        function getRecs() """),format.raw/*20.28*/("""{"""),format.raw/*20.29*/("""
            """),format.raw/*21.13*/("""let req = new XMLHttpRequest();
            req.onreadystatechange = function() """),format.raw/*22.49*/("""{"""),format.raw/*22.50*/("""
                """),format.raw/*23.17*/("""if (req.readyState == 4 && req.status == 200) """),format.raw/*23.63*/("""{"""),format.raw/*23.64*/("""
                    """),format.raw/*24.21*/("""let msg = JSON.parse(req.responseText);
                    let res = msg['"""),_display_(/*25.37*/username),format.raw/*25.45*/("""'];
                    document.getElementById('friendRec').innerHTML = "<br/><br/><div class='container'>" +
                            "   <div class='row'>\n";
                    for (index in res)
                        document.getElementById('friendRec').innerHTML += "   <div class='col s12 m4 z-depth-2'>" +
                                "       <div class='icon-block'>" +
                                "           <h2 class='center'><img src=\"https://www.drupal.org/files/profile_default.jpg\" alt=\"\" class=\"circle\" width='42' height='42'></h2>\n" +
                                "           <h5 class='center'>" + res[index] + "</h5>\n" +
                                "           <p class='center'>" +
                                "               <a onclick=\"updateFriends('" + res[index] + "', 'POST')\" class=\"btn-floating halfway-fab waves-effect waves-light blue\"><i class=\"material-icons\">add</i></a>" +
                                "           </p>\n" +
                                "       </div>\n" +
                                "   </div>\n";

                    document.getElementById('friendRec').innerHTML += "   </div>\n" +
                                                                            "</div>\n";
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/("""
            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/(""";
            req.open("GET", "http://localhost:9000/restful/recommend/"""),_display_(/*43.71*/username),format.raw/*43.79*/("""", true);
            req.send(null);
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/("""

        """),format.raw/*47.9*/("""function search(name, item) """),format.raw/*47.37*/("""{"""),format.raw/*47.38*/("""
            """),format.raw/*48.13*/("""let req = new XMLHttpRequest();
            req.onreadystatechange = function() """),format.raw/*49.49*/("""{"""),format.raw/*49.50*/("""
                """),format.raw/*50.17*/("""if (req.readyState == 4 && req.status == 200) """),format.raw/*50.63*/("""{"""),format.raw/*50.64*/("""
                    """),format.raw/*51.21*/("""let res = JSON.parse(req.responseText);
                    document.getElementsByClassName("search-results").item(item).innerHTML = "";
                    for (index in res)
                        document.getElementsByClassName("search-results").item(item).innerHTML += "<a style='z-index: 5' href='#!'>" + res[index] + "</a>\n"
                """),format.raw/*55.17*/("""}"""),format.raw/*55.18*/("""
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/(""";
            req.open("GET", "http://localhost:9000/restful/search/" + name, true);
            req.send(null);
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""

        """),format.raw/*61.9*/("""function getProfile(s) """),format.raw/*61.32*/("""{"""),format.raw/*61.33*/("""
            """),format.raw/*62.13*/("""let req = new XMLHttpRequest();
            req.onreadystatechange = function() """),format.raw/*63.49*/("""{"""),format.raw/*63.50*/("""
                """),format.raw/*64.17*/("""if (req.readyState == 4 && req.status == 200) """),format.raw/*64.63*/("""{"""),format.raw/*64.64*/("""
                    """),format.raw/*65.21*/("""let res = JSON.parse(req.responseText);
                    document.getElementById('friend').innerHTML = (res.conFriends.length != 0) ? res.conFriends : "<p class='center blue-text' style='font-size: 24px'>No Friends Yet :/</p>";
                    document.getElementById('request').innerHTML = (res.penFriends.length != 0) ? res.penFriends : "<p class='center blue-text' style='font-size: 24px'>No Friend Requests Yet :/</p>";
                    document.getElementById('pending').innerHTML = (res.reqFriends.length != 0) ? res.reqFriends : "<p class='center blue-text' style='font-size: 24px'>No Friend Requests Sent :/</p>";
                    if (res.message !== null && res.message !== undefined)
                        document.getElementsByClassName('search-results').innerHTML = res.message;
                """),format.raw/*71.17*/("""}"""),format.raw/*71.18*/("""
            """),format.raw/*72.13*/("""}"""),format.raw/*72.14*/(""";
            req.open("GET", "http://localhost:9000/restful/profile?username="
                    + '"""),_display_(/*74.25*/username),format.raw/*74.33*/("""' + "&name="
                    + s, true);
            req.send(null);
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/("""

        """),format.raw/*79.9*/("""function updateFriends(user, request) """),format.raw/*79.47*/("""{"""),format.raw/*79.48*/("""
            """),format.raw/*80.13*/("""let req = new XMLHttpRequest();
            req.onreadystatechange = function() """),format.raw/*81.49*/("""{"""),format.raw/*81.50*/("""
                """),format.raw/*82.17*/("""if (req.readyState == 4 && req.status == 200) """),format.raw/*82.63*/("""{"""),format.raw/*82.64*/("""
                    """),format.raw/*83.21*/("""getProfile("");
                    getRecs();
                """),format.raw/*85.17*/("""}"""),format.raw/*85.18*/("""
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/(""";
            req.open(request, "http://localhost:9000/friends/"
                    + '"""),_display_(/*88.25*/username),format.raw/*88.33*/("""'
                    + "/" + user, true);
            req.send(null);
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/("""

    """),format.raw/*93.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*94.2*/("""

"""),_display_(/*96.2*/main("Friends", headParts)/*96.28*/ {_display_(Seq[Any](format.raw/*96.30*/("""
    """),format.raw/*97.5*/("""<div class="navbar-fixed">
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
                    <li><a href=""""),_display_(/*112.35*/routes/*112.41*/.ProfileController.displayPage),format.raw/*112.71*/("""">Profile</a></li>
                    <li><a href=""""),_display_(/*113.35*/routes/*113.41*/.FriendController.displayPage(username)),format.raw/*113.80*/("""">Friends</a></li>
                    """),format.raw/*114.105*/("""
                    """),format.raw/*115.21*/("""<li><a class="red-text" href=""""),_display_(/*115.52*/routes/*115.58*/.LoginController.displayPage),format.raw/*115.86*/("""">Logout</a></li>
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
                    <li><a href="#!">Friends</a></li>
                    """),format.raw/*128.105*/("""
                    """),format.raw/*129.21*/("""<li><a class="red-text" href=""""),_display_(/*129.52*/routes/*129.58*/.LoginController.displayPage),format.raw/*129.86*/("""">Logout</a></li>
                </ul>
                <a href="#" data-activates="slide-out" class="button-collapse right"><i class="material-icons">menu</i></a>

                <a href=""""),_display_(/*133.27*/routes/*133.33*/.ProfileController.displayPage()),format.raw/*133.65*/("""" class="brand-logo left">Hello, """),_display_(/*133.99*/username),format.raw/*133.107*/("""!</a>

            </div>
            <div class="nav-content">
                <ul class="tabs tabs-transparent blue">
                    <li class="tab"><a class="white-text" href="#friend">Friends</a></li>
                    <li class="tab"><a class="active white-text" href="#request">Pending Requests</a></li>
                    <li class="tab"><a class="white-text" href="#pending">Requests Sent</a></li>
                </ul>
            </div>
        </nav>
    </div>

    <br/><br/>

    <div id="friend" class="col s12"></div>
    <div id="request" class="col s12"></div>
    <div id="pending" class="col s12"></div>


    <!-- Main Content Start -->

    <br/><br/><br/>
    <div class="divider"></div>
    <div class="row">
        <div class="center z-depth-2 white-text blue lighten-1" style="font-size: 24px">Recommendations</div>
        <div id="friendRec"></div>
    </div>

    <!--  Main Content End  -->

    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
    <script>
            $(document).ready(function () """),format.raw/*167.43*/("""{"""),format.raw/*167.44*/("""
                """),format.raw/*168.17*/("""$('.button-collapse').sideNav();
            """),format.raw/*169.13*/("""}"""),format.raw/*169.14*/(""")
    </script>
""")))}))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


}

/**/
object friends extends friends_Scope0.friends
              /*
                  -- GENERATED --
                  DATE: Thu Apr 13 03:23:16 EDT 2017
                  SOURCE: C:/Users/alex/Coding/CSC435/SocialAppRepo/PlayGSA/app/views/friends.scala.html
                  HASH: 13efd532d2551d2be6de6fdd7217177a5233479a
                  MATRIX: 749->1|845->24|862->33|942->37|974->43|1341->383|1369->384|1411->398|1498->458|1527->459|1560->465|1663->540|1692->541|1734->555|1808->602|1837->603|1897->635|1926->636|1968->650|2077->731|2106->732|2152->750|2226->796|2255->797|2305->819|2409->896|2438->904|3772->2210|3801->2211|3843->2225|3872->2226|3972->2299|4001->2307|4076->2355|4105->2356|4144->2368|4200->2396|4229->2397|4271->2411|4380->2492|4409->2493|4455->2511|4529->2557|4558->2558|4608->2580|4989->2933|5018->2934|5060->2948|5089->2949|5240->3073|5269->3074|5308->3086|5359->3109|5388->3110|5430->3124|5539->3205|5568->3206|5614->3224|5688->3270|5717->3271|5767->3293|6623->4121|6652->4122|6694->4136|6723->4137|6856->4243|6885->4251|6996->4335|7025->4336|7064->4348|7130->4386|7159->4387|7201->4401|7310->4482|7339->4483|7385->4501|7459->4547|7488->4548|7538->4570|7631->4635|7660->4636|7702->4650|7731->4651|7849->4742|7878->4750|7987->4832|8016->4833|8051->4841|8102->19|8133->4853|8164->4858|8199->4884|8239->4886|8272->4892|9217->5809|9233->5815|9285->5845|9367->5899|9383->5905|9444->5944|9514->6068|9565->6090|9624->6121|9640->6127|9690->6155|10532->7051|10583->7073|10642->7104|10658->7110|10708->7138|10931->7333|10947->7339|11001->7371|11063->7405|11094->7413|12391->8681|12421->8682|12468->8700|12543->8746|12573->8747
                  LINES: 27->1|31->3|31->3|33->3|34->4|39->9|39->9|40->10|42->12|42->12|43->13|45->15|45->15|46->16|48->18|48->18|50->20|50->20|51->21|52->22|52->22|53->23|53->23|53->23|54->24|55->25|55->25|71->41|71->41|72->42|72->42|73->43|73->43|75->45|75->45|77->47|77->47|77->47|78->48|79->49|79->49|80->50|80->50|80->50|81->51|85->55|85->55|86->56|86->56|89->59|89->59|91->61|91->61|91->61|92->62|93->63|93->63|94->64|94->64|94->64|95->65|101->71|101->71|102->72|102->72|104->74|104->74|107->77|107->77|109->79|109->79|109->79|110->80|111->81|111->81|112->82|112->82|112->82|113->83|115->85|115->85|116->86|116->86|118->88|118->88|121->91|121->91|123->93|125->1|127->94|129->96|129->96|129->96|130->97|145->112|145->112|145->112|146->113|146->113|146->113|147->114|148->115|148->115|148->115|148->115|161->128|162->129|162->129|162->129|162->129|166->133|166->133|166->133|166->133|166->133|200->167|200->167|201->168|202->169|202->169
                  -- GENERATED --
              */
          