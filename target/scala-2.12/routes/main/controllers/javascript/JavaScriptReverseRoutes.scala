// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/TodoList/conf/routes
// @DATE:Wed Sep 19 17:33:40 IST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(cat0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:12
    def completed: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.completed",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "completed"})
        }
      """
    )
  
    // @LINE:13
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:7
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit"})
        }
      """
    )
  
    // @LINE:18
    def submitLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitLogin"})
        }
      """
    )
  
    // @LINE:20
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:21
    def stats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.stats",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stats"})
        }
      """
    )
  
    // @LINE:14
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:16
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:19
    def submitRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submitRegister"})
        }
      """
    )
  
    // @LINE:10
    def changeStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.changeStatus",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "completed" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:11
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:9
    def submitDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitDate",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submitdate" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:8
    def addDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDate",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:17
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:15
    def overdue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.overdue",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "overdue"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
