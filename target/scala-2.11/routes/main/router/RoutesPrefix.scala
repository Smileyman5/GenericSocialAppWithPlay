
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alex/Coding/CSC435/SocialAppRepo/PlayGSA/conf/routes
// @DATE:Thu Apr 13 13:16:57 EDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
