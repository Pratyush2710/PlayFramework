// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vassar/Documents/play framework/bookstoreapp/conf/routes
// @DATE:Mon May 27 12:20:55 IST 2019


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
