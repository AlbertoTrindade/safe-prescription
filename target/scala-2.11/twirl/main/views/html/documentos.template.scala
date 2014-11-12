
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
object documentos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

  <head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8" />
    <title>SafePrescription - Documentos</title>

    <link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
    <link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
    <link rel="stylesheet" type="text/css" href="css/styles.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>

    <script type="text/javascript" src=" https://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.js"></script>
    		
  </head>

  <body>
  	
    <!--start container-->
    <div id="container">

      <!--start header-->
      <header>  
        <!--start logo-->
        <a href="index.html" id="logo"><img src="images/logo.png" alt="logo"/></a> 
      	<!--end logo-->
  	
        <!--start menu-->
      	<nav>
          <ul>
            <li><a href="index.html">Home</a></li>
          	<li><a href="documentos.html" class="current">Documentos</a></li>
            <li><a href="cadastrar_paciente.html">Acessar Sistema</a></li>
          </ul>
        </nav>
        <!--end menu-->
      
    	</header>
      <!--end header-->

      <!--start intro-->
      <div class="intro">

        <div class="group_bannner_right">
          <img src="images/documentos.png" width="550" height="316"  alt="baner">
        </div>
      
        <header class="group_bannner_left">
          <hgroup>
            <h2 class="titulo">Documentos Disponíveis</h2>
            <h3>
              <ul class="documento_lista" align="left">
                <li><a href="arquivos/Escopo do Projeto.pdf">Escopo do Projeto</a></li>
              </ul>
            </h3>
          </hgroup>
        </header>
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
                  DATE: Wed Nov 12 12:24:50 CST 2014
                  SOURCE: /home/alberto/Documents/java_projects/safe-prescription/app/views/documentos.scala.html
                  HASH: a62e2c1cdffae78d30a1fd4138f3827474a68d73
                  MATRIX: 803->0
                  LINES: 29->1
                  -- GENERATED --
              */
          