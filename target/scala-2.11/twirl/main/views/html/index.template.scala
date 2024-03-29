
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

  <head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8" />
    <title>SafePrescription - Home</title>

    <link rel="icon" href=""""),_display_(/*10.29*/routes/*10.35*/.Assets.at("/public/images/", "favicon.gif")),format.raw/*10.79*/("""" type="image/x-icon"/>
    <link rel="shortcut icon" href=""""),_display_(/*11.38*/routes/*11.44*/.Assets.at("/public/images/", "favicon.gif")),format.raw/*11.88*/("""" type="image/x-icon"/> 
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.at("/public/stylesheets/", "styles.css")),format.raw/*12.105*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.51*/routes/*13.57*/.Assets.at("/public/stylesheets/","bootstrap-theme.css")),format.raw/*13.113*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*14.51*/routes/*14.57*/.Assets.at("/public/stylesheets/","bootstrap.css")),format.raw/*14.107*/(""""/>

    		
  </head>

  <body>
  	
    <!--start container-->
    <div id="container">

      <!--start header-->
      <header>  
        <!--start logo-->
        <a href="index.html" id="logo"><img src=""""),_display_(/*27.51*/routes/*27.57*/.Assets.at("/public/images/","logo.png")),format.raw/*27.97*/("""" alt="logo"/></a> 
      	<!--end logo-->
  	
        <!--start menu-->
      	<nav>
          <ul>
            <li><a href="index.html" class="current">Home</a></li>
          	<li><a href="documentos.html">Documentos</a></li>
            <li><a href="cadastrar_paciente">Acessar Sistema</a></li>
          </ul>
        </nav>
        <!--end menu-->
      
    	</header>
      <!--end header-->

      <!--start intro-->
      <div class="intro">

        <div class="group_bannner_right">
          <img src=""""),_display_(/*47.22*/routes/*47.28*/.Assets.at("/public/images/", "computer.png")),format.raw/*47.73*/("""" width="550" height="316"  alt="baner">
        </div>
      
        <div class="group_bannner_left">
            <p id="descricao">
              Aqui você encontra informações sobre o Projeto SafePrescription, desenvolvido para a disciplina de Análise e Projeto de Sistemas do Centro de Informática da UFPE.
            </p>
        </div>

      </div>
      <!--end intro-->

      <!--start holder-->
      <div class="holder_content">
     
        <section class="group1">
          <img class="group-icon" src=""""),_display_(/*63.41*/routes/*63.47*/.Assets.at("/public/images/","icon_projeto.png")),format.raw/*63.95*/("""">
          <h3>O Projeto</h3>
          <p align="center">
            O SafePrescription é uma ferramenta desktop que busca auxiliar profissionais de saúde na prescrição de medicamentos de forma segura, levando em consideração as interações entre os fármacos, o quadro clínico do paciente e as alergias que este possa apresentar.
          </p>
        </section>
  	    
        <section class="group2">
          <img class="group-icon" src=""""),_display_(/*71.41*/routes/*71.47*/.Assets.at("/public/images/","icon_motivacao.png")),format.raw/*71.97*/("""">
          <h3>Motivação</h3>
           <p align="center">
            A interação entre medicamentos é um problema sério vivenciado pelos profissionais da área de saúde, uma vez que essas interações podem causar diversos problemas, como o aumento do efeito de uma droga ou a inibição da mesma. As ferramentas disponíveis até então não forneciam uma forma prática de verificar as interações entre remédios, sendo necessária a consulta em extensos bulários antes da prescrição do medicamento.
          </p>
        </section>
        
        <section class="group3">
          <img class="group-icon" src=""""),_display_(/*79.41*/routes/*79.47*/.Assets.at("/public/images/","icon_equipe.png")),format.raw/*79.94*/("""">
          <h3>Equipe</h3>
          <ul align="center">
            <li><span>Alberto Trindade Tavares</span></li>
            <li><span>José Luiz Correia Neto</span></li>
            <li><span>Nicolle Chaves Cysneiros</span></li>
            <li><span>Rafael Lucena C. de Oliveira</span></li>
          </ul>
        </section>

      </div>
      <!--end holder-->

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

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 12 12:24:50 CST 2014
                  SOURCE: /home/alberto/Documents/java_projects/safe-prescription/app/views/index.scala.html
                  HASH: 90a5f4d168d320a1722ba2557b156967cfcffd2d
                  MATRIX: 723->1|828->18|855->19|1208->345|1223->351|1288->395|1376->456|1391->462|1456->506|1558->581|1573->587|1643->635|1724->689|1739->695|1817->751|1898->805|1913->811|1985->861|2220->1069|2235->1075|2296->1115|2839->1631|2854->1637|2920->1682|3469->2204|3484->2210|3553->2258|4028->2706|4043->2712|4114->2762|4752->3373|4767->3379|4835->3426
                  LINES: 26->1|29->1|30->2|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|55->27|55->27|55->27|75->47|75->47|75->47|91->63|91->63|91->63|99->71|99->71|99->71|107->79|107->79|107->79
                  -- GENERATED --
              */
          