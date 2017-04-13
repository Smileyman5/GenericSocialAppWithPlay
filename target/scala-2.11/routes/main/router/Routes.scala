
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alex/Coding/CSC435/SocialAppRepo/PlayGSA/conf/routes
// @DATE:Thu Apr 13 13:16:57 EDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  LoginController_8: controllers.LoginController,
  // @LINE:11
  StatController_3: controllers.StatController,
  // @LINE:14
  ProfileController_2: controllers.ProfileController,
  // @LINE:21
  FriendController_1: controllers.FriendController,
  // @LINE:30
  PostController_5: controllers.PostController,
  // @LINE:41
  SearchController_0: controllers.SearchController,
  // @LINE:46
  RegisterController_4: controllers.RegisterController,
  // @LINE:51
  FriendRecController_7: controllers.FriendRecController,
  // @LINE:56
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    LoginController_8: controllers.LoginController,
    // @LINE:11
    StatController_3: controllers.StatController,
    // @LINE:14
    ProfileController_2: controllers.ProfileController,
    // @LINE:21
    FriendController_1: controllers.FriendController,
    // @LINE:30
    PostController_5: controllers.PostController,
    // @LINE:41
    SearchController_0: controllers.SearchController,
    // @LINE:46
    RegisterController_4: controllers.RegisterController,
    // @LINE:51
    FriendRecController_7: controllers.FriendRecController,
    // @LINE:56
    Assets_6: controllers.Assets
  ) = this(errorHandler, LoginController_8, StatController_3, ProfileController_2, FriendController_1, PostController_5, SearchController_0, RegisterController_4, FriendRecController_7, Assets_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_8, StatController_3, ProfileController_2, FriendController_1, PostController_5, SearchController_0, RegisterController_4, FriendRecController_7, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginController.displayPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/""" + "$" + """username<[^/]+>/""" + "$" + """password<[^/]+>""", """controllers.LoginController.login(username:String, password:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stats/""" + "$" + """username<[^/]+>""", """controllers.StatController.updateStats(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.displayPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restful/profile""", """controllers.ProfileController.getProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restful/json/profile/""" + "$" + """username<[^/]+>""", """controllers.ProfileController.getProfileJson(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """friends/""" + "$" + """username<[^/]+>""", """controllers.FriendController.displayPage(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """friends/""" + "$" + """username<[^/]+>/""" + "$" + """name<[^/]+>""", """controllers.FriendController.addFriend(username:String, name:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """friends/""" + "$" + """username<[^/]+>/""" + "$" + """name<[^/]+>""", """controllers.FriendController.acceptRequest(username:String, name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """friends/""" + "$" + """username<[^/]+>/""" + "$" + """name<[^/]+>""", """controllers.FriendController.deleteRequest(username:String, name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post""", """controllers.PostController.post"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/""" + "$" + """username<[^/]+>""", """controllers.PostController.getPostsByName(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/ids/""" + "$" + """id<[^/]+>""", """controllers.PostController.getPostById(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/friends/""" + "$" + """username<[^/]+>""", """controllers.PostController.getPostsByFriends(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/all/""" + "$" + """username<[^/]+>""", """controllers.PostController.getAllPostsByName(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.displayPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restful/search/""" + "$" + """name<[^/]+>""", """controllers.SearchController.getJson(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.RegisterController.displayPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.RegisterController.register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recommend/""" + "$" + """name<[^/]+>""", """controllers.FriendRecController.getHtml(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restful/recommend/""" + "$" + """name<[^/]+>""", """controllers.FriendRecController.getJson(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_LoginController_displayPage0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_displayPage0_invoker = createInvoker(
    LoginController_8.displayPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "displayPage",
      Nil,
      "GET",
      """ Login using a username and password
 GET is type of command				controllers.SomeController.method_called""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LoginController_login1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_login1_invoker = createInvoker(
    LoginController_8.login(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """login/""" + "$" + """username<[^/]+>/""" + "$" + """password<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_StatController_updateStats2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stats/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatController_updateStats2_invoker = createInvoker(
    StatController_3.updateStats(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatController",
      "updateStats",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """stats/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ProfileController_displayPage3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_displayPage3_invoker = createInvoker(
    ProfileController_2.displayPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "displayPage",
      Nil,
      "GET",
      """ Profile""",
      this.prefix + """profile"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ProfileController_getProfile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restful/profile")))
  )
  private[this] lazy val controllers_ProfileController_getProfile4_invoker = createInvoker(
    ProfileController_2.getProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "getProfile",
      Nil,
      "GET",
      """""",
      this.prefix + """restful/profile"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ProfileController_getProfileJson5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restful/json/profile/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_getProfileJson5_invoker = createInvoker(
    ProfileController_2.getProfileJson(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "getProfileJson",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """restful/json/profile/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_FriendController_displayPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("friends/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FriendController_displayPage6_invoker = createInvoker(
    FriendController_1.displayPage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FriendController",
      "displayPage",
      Seq(classOf[String]),
      "GET",
      """ Friends""",
      this.prefix + """friends/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_FriendController_addFriend7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("friends/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FriendController_addFriend7_invoker = createInvoker(
    FriendController_1.addFriend(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FriendController",
      "addFriend",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """friends/""" + "$" + """username<[^/]+>/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_FriendController_acceptRequest8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("friends/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FriendController_acceptRequest8_invoker = createInvoker(
    FriendController_1.acceptRequest(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FriendController",
      "acceptRequest",
      Seq(classOf[String], classOf[String]),
      "PUT",
      """""",
      this.prefix + """friends/""" + "$" + """username<[^/]+>/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_FriendController_deleteRequest9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("friends/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FriendController_deleteRequest9_invoker = createInvoker(
    FriendController_1.deleteRequest(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FriendController",
      "deleteRequest",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      """""",
      this.prefix + """friends/""" + "$" + """username<[^/]+>/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_PostController_post10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post")))
  )
  private[this] lazy val controllers_PostController_post10_invoker = createInvoker(
    PostController_5.post,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "post",
      Nil,
      "POST",
      """ Posts""",
      this.prefix + """post"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_PostController_getPostsByName11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getPostsByName11_invoker = createInvoker(
    PostController_5.getPostsByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getPostsByName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_PostController_getPostById12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/ids/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getPostById12_invoker = createInvoker(
    PostController_5.getPostById(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getPostById",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """posts/ids/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_PostController_getPostsByFriends13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/friends/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getPostsByFriends13_invoker = createInvoker(
    PostController_5.getPostsByFriends(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getPostsByFriends",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/friends/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_PostController_getAllPostsByName14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/all/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getAllPostsByName14_invoker = createInvoker(
    PostController_5.getAllPostsByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getAllPostsByName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/all/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_SearchController_displayPage15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_displayPage15_invoker = createInvoker(
    SearchController_0.displayPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "displayPage",
      Nil,
      "GET",
      """ Search""",
      this.prefix + """search"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_SearchController_getJson16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restful/search/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SearchController_getJson16_invoker = createInvoker(
    SearchController_0.getJson(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "getJson",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """restful/search/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_RegisterController_displayPage17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegisterController_displayPage17_invoker = createInvoker(
    RegisterController_4.displayPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegisterController",
      "displayPage",
      Nil,
      "GET",
      """ Register""",
      this.prefix + """register"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_RegisterController_register18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegisterController_register18_invoker = createInvoker(
    RegisterController_4.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegisterController",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_FriendRecController_getHtml19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recommend/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FriendRecController_getHtml19_invoker = createInvoker(
    FriendRecController_7.getHtml(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FriendRecController",
      "getHtml",
      Seq(classOf[String]),
      "GET",
      """ FriendRecommendator""",
      this.prefix + """recommend/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_FriendRecController_getJson20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restful/recommend/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FriendRecController_getJson20_invoker = createInvoker(
    FriendRecController_7.getJson(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FriendRecController",
      "getJson",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """restful/recommend/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_LoginController_displayPage0_route(params) =>
      call { 
        controllers_LoginController_displayPage0_invoker.call(LoginController_8.displayPage)
      }
  
    // @LINE:9
    case controllers_LoginController_login1_route(params) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("password", None)) { (username, password) =>
        controllers_LoginController_login1_invoker.call(LoginController_8.login(username, password))
      }
  
    // @LINE:11
    case controllers_StatController_updateStats2_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_StatController_updateStats2_invoker.call(StatController_3.updateStats(username))
      }
  
    // @LINE:14
    case controllers_ProfileController_displayPage3_route(params) =>
      call { 
        controllers_ProfileController_displayPage3_invoker.call(ProfileController_2.displayPage)
      }
  
    // @LINE:16
    case controllers_ProfileController_getProfile4_route(params) =>
      call { 
        controllers_ProfileController_getProfile4_invoker.call(ProfileController_2.getProfile)
      }
  
    // @LINE:18
    case controllers_ProfileController_getProfileJson5_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ProfileController_getProfileJson5_invoker.call(ProfileController_2.getProfileJson(username))
      }
  
    // @LINE:21
    case controllers_FriendController_displayPage6_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_FriendController_displayPage6_invoker.call(FriendController_1.displayPage(username))
      }
  
    // @LINE:23
    case controllers_FriendController_addFriend7_route(params) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("name", None)) { (username, name) =>
        controllers_FriendController_addFriend7_invoker.call(FriendController_1.addFriend(username, name))
      }
  
    // @LINE:25
    case controllers_FriendController_acceptRequest8_route(params) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("name", None)) { (username, name) =>
        controllers_FriendController_acceptRequest8_invoker.call(FriendController_1.acceptRequest(username, name))
      }
  
    // @LINE:27
    case controllers_FriendController_deleteRequest9_route(params) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("name", None)) { (username, name) =>
        controllers_FriendController_deleteRequest9_invoker.call(FriendController_1.deleteRequest(username, name))
      }
  
    // @LINE:30
    case controllers_PostController_post10_route(params) =>
      call { 
        controllers_PostController_post10_invoker.call(PostController_5.post)
      }
  
    // @LINE:32
    case controllers_PostController_getPostsByName11_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_PostController_getPostsByName11_invoker.call(PostController_5.getPostsByName(username))
      }
  
    // @LINE:34
    case controllers_PostController_getPostById12_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PostController_getPostById12_invoker.call(PostController_5.getPostById(id))
      }
  
    // @LINE:36
    case controllers_PostController_getPostsByFriends13_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_PostController_getPostsByFriends13_invoker.call(PostController_5.getPostsByFriends(username))
      }
  
    // @LINE:38
    case controllers_PostController_getAllPostsByName14_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_PostController_getAllPostsByName14_invoker.call(PostController_5.getAllPostsByName(username))
      }
  
    // @LINE:41
    case controllers_SearchController_displayPage15_route(params) =>
      call { 
        controllers_SearchController_displayPage15_invoker.call(SearchController_0.displayPage)
      }
  
    // @LINE:43
    case controllers_SearchController_getJson16_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_SearchController_getJson16_invoker.call(SearchController_0.getJson(name))
      }
  
    // @LINE:46
    case controllers_RegisterController_displayPage17_route(params) =>
      call { 
        controllers_RegisterController_displayPage17_invoker.call(RegisterController_4.displayPage)
      }
  
    // @LINE:48
    case controllers_RegisterController_register18_route(params) =>
      call { 
        controllers_RegisterController_register18_invoker.call(RegisterController_4.register)
      }
  
    // @LINE:51
    case controllers_FriendRecController_getHtml19_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_FriendRecController_getHtml19_invoker.call(FriendRecController_7.getHtml(name))
      }
  
    // @LINE:53
    case controllers_FriendRecController_getJson20_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_FriendRecController_getJson20_invoker.call(FriendRecController_7.getJson(name))
      }
  
    // @LINE:56
    case controllers_Assets_versioned21_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
