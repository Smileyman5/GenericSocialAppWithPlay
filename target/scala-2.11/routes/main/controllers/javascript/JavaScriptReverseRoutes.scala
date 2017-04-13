
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alex/Coding/CSC435/SocialAppRepo/PlayGSA/conf/routes
// @DATE:Thu Apr 13 13:16:57 EDT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:56
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:46
  class ReverseRegisterController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def displayPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegisterController.displayPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:48
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegisterController.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseStatController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def updateStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatController.updateStats",
      """
        function(username0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "stats/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.getProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restful/profile"})
        }
      """
    )
  
    // @LINE:14
    def displayPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.displayPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:18
    def getProfileJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.getProfileJson",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restful/json/profile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def displayPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.displayPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function(username0,password1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password1))})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseFriendRecController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def getHtml: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FriendRecController.getHtml",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recommend/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:53
    def getJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FriendRecController.getJson",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restful/recommend/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def displayPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.displayPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:43
    def getJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.getJson",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restful/search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
  }

  // @LINE:30
  class ReversePostController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def getPostsByFriends: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getPostsByFriends",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/friends/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
    // @LINE:30
    def post: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.post",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
        }
      """
    )
  
    // @LINE:38
    def getAllPostsByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getAllPostsByName",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/all/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
    // @LINE:34
    def getPostById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getPostById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/ids/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:32
    def getPostsByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getPostsByName",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseFriendController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def deleteRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FriendController.deleteRequest",
      """
        function(username0,name1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "friends/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name1))})
        }
      """
    )
  
    // @LINE:25
    def acceptRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FriendController.acceptRequest",
      """
        function(username0,name1) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "friends/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name1))})
        }
      """
    )
  
    // @LINE:21
    def displayPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FriendController.displayPage",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "friends/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
    // @LINE:23
    def addFriend: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FriendController.addFriend",
      """
        function(username0,name1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "friends/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name1))})
        }
      """
    )
  
  }


}
