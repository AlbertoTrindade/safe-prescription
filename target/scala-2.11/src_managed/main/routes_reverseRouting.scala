// @SOURCE:C:/git/safe-prescription/conf/routes
// @HASH:25d431d47877dadbcc61b65e6f4d6ca89c3078fa
// @DATE:Tue Nov 11 21:39:01 GMT-03:00 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:8
class ReverseCRCadastroPaciente {


// @LINE:8
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cadastrar_paciente")
}
                        

}
                          

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseAssets {


// @LINE:14
// @LINE:13
// @LINE:12
def at(path:String, file:String): Call = {
   (path: @unchecked, file: @unchecked) match {
// @LINE:12
case (path, file) if path == "/public/images/" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/images/")))
  Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:13
case (path, file) if path == "/public/stylesheets/" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/stylesheets/")))
  Call("GET", _prefix + { _defaultPrefix } + "stylesheets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:14
case (path, file) if path == "/public/javascripts/" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/")))
  Call("GET", _prefix + { _defaultPrefix } + "javascripts/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:9
class ReverseCRPrescricaoMedicamento {


// @LINE:9
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "prescrever_medicamento")
}
                        

}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
// @LINE:6
def index(): Call = {
   () match {
// @LINE:6
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix)
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:8
class ReverseCRCadastroPaciente {


// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CRCadastroPaciente.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar_paciente"})
      }
   """
)
                        

}
              

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseAssets {


// @LINE:14
// @LINE:13
// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/images/") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/stylesheets/") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stylesheets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/javascripts/") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascripts/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:9
class ReverseCRPrescricaoMedicamento {


// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CRPrescricaoMedicamento.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "prescrever_medicamento"})
      }
   """
)
                        

}
              

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:8
class ReverseCRCadastroPaciente {


// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CRCadastroPaciente.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CRCadastroPaciente", "index", Seq(), "GET", """""", _prefix + """cadastrar_paciente""")
)
                      

}
                          

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseAssets {


// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """images/$file<.+>""")
)
                      

}
                          

// @LINE:9
class ReverseCRPrescricaoMedicamento {


// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CRPrescricaoMedicamento.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CRPrescricaoMedicamento", "index", Seq(), "GET", """""", _prefix + """prescrever_medicamento""")
)
                      

}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    