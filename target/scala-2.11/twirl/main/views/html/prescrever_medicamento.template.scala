
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object prescrever_medicamento extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

  <head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8" />
    <title>SafePrescription - Documentos</title>

    <link rel="icon"  href=""""),_display_(/*9.30*/routes/*9.36*/.Assets.at("/public/images/" ,"favicon.gif")),format.raw/*9.80*/("""" type="image/x-icon"/>
    <link rel="shortcut icon" href=""""),_display_(/*10.38*/routes/*10.44*/.Assets.at("/public/images/" , "favicon.gif")),format.raw/*10.89*/("""" type="image/x-icon"/> 
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.51*/routes/*11.57*/.Assets.at("/public/stylesheets/", "styles.css")),format.raw/*11.105*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.at("/public/stylesheets/","bootstrap-theme.css")),format.raw/*12.113*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.51*/routes/*13.57*/.Assets.at("/public/stylesheets/","bootstrap.css")),format.raw/*13.107*/(""""/>

    <script type="text/javascript" src=""""),_display_(/*15.42*/routes/*15.48*/.Assets.at("/public/javascripts/", "jquery-1.11.1.min.js")),format.raw/*15.106*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*16.42*/routes/*16.48*/.Assets.at("/public/javascripts/", "bootstrap.js")),format.raw/*16.98*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*17.42*/routes/*17.48*/.Assets.at("/public/javascripts/", "scripts.js")),format.raw/*17.96*/(""""></script>
    		
  </head>

  <body>
  	
    <!--start container-->
    <div id="container">

      <!--start header-->
      <header>  
        <!--start logo-->
        <a href="index" id="logo"><img src=""""),_display_(/*29.46*/routes/*29.52*/.Assets.at("/public/images/", "logo.png")),format.raw/*29.93*/("""" alt="logo"/></a> 
      	<!--end logo-->
  	
        <!--start menu-->
      	<nav>
          <ul>
            <li><a href="cadastrar_paciente">Cadastrar Paciente</a></a></li>
          	<li><a href="prescrever_medicamento" class="current">Prescrever Medicações</a></a></li>
          </ul>
        </nav>
        <!--end menu-->
      
    	</header>
      <!--end header-->

      <!--start intro-->
      <div class="intro-2" >
      
            <h3 class="titulo">Prescrever Medicamentos</h3>
            <form>

              <!--Pesquisar Paciente-->
              <h4 class="titulo-sessao">Pesquisar Paciente</h4>

              <div class="input-group spacing">
                    <input type="text" class="form-control" placeholder="Search" name="q">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                  </div>

                  <div class="list-group list-scroll">

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Alberto Trindade Tavares</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="radio">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">José Luiz Correia Neto</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="radio">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Nicolle Chaves Cysneiros</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="radio">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Rafael Lucena Cavalcanti de Oliveira</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="radio">
                          </div>
                        </div>
                    </div>

                  </div>
              <!--*******************************************-->          

                <!--Medicamentos-->

                  <h4 class="titulo-sessao">Medicamentos</h4>

                  <div class="input-group spacing">
                    <input type="text" class="form-control" placeholder="Search" name="q">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                  </div>

                  <div id="lista_medicamentos" class="list-group list-scroll">

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Alenia</p>
                          </div>
                          <div class="col-lg-1">
                            <input id="alenia" type="checkbox" onclick="if(this.checked)"""),format.raw/*128.89*/("""{"""),format.raw/*128.90*/("""$('#expansao_alenia').collapse('show')"""),format.raw/*128.128*/("""}"""),format.raw/*128.129*/("""else"""),format.raw/*128.133*/("""{"""),format.raw/*128.134*/("""$('#expansao_alenia').collapse('hide')"""),format.raw/*128.172*/("""}"""),format.raw/*128.173*/("""">
                          </div>
                          <div id="expansao_alenia" class="collapse expansao" role="tabpanel">
                            <div class="row">
                              <div class="col-lg-6">
                                <textarea id="posologia_input" type="text" class="form-control" placeholder="Posologia" rows="3"></textarea>
                              </div>
                              <div class="col-lg-6">
                                <textarea id="posologia_input" type="text" class="form-control" placeholder="Via" rows="3"></textarea>
                              </div>
                            </div>
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Budesonida</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Gestinol 28</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Ibuprofeno</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Nasonex</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                <!--************************************************-->

              </div>

              <button type="button" class="btn btn-style">Cadastrar</button>

            </form>
      </div>
      <!--end intro-->

    </div>
     <!--end container-->
     
    <!--start footer-->
    <footer>
      <div class="container">  
        <div id="FooterTwo"> © 2014 SafePrescription </div>
      </div>
    </footer>
    <!--end footer-->

  </body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 11 21:39:01 GMT-03:00 2014
                  SOURCE: C:/git/safe-prescription/app/views/prescrever_medicamento.scala.html
                  HASH: 9c5ed39d3783419c039720816bc9e8c86afe7404
                  MATRIX: 815->0|1182->341|1196->347|1260->391|1349->453|1364->459|1430->504|1533->580|1548->586|1618->634|1700->689|1715->695|1793->751|1875->806|1890->812|1962->862|2037->910|2052->916|2132->974|2213->1028|2228->1034|2299->1084|2380->1138|2395->1144|2464->1192|2713->1414|2728->1420|2790->1461|6811->5453|6841->5454|6909->5492|6940->5493|6974->5497|7005->5498|7073->5536|7104->5537
                  LINES: 29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|57->29|57->29|57->29|156->128|156->128|156->128|156->128|156->128|156->128|156->128|156->128
                  -- GENERATED --
              */
          