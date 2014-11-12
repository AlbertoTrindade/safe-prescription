
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
object prescrever_medicamento extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[views.PrescreverMedicamentoModeView,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lists: views.PrescreverMedicamentoModeView):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.46*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

  <head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8" />
    <title>SafePrescription - Documentos</title>

    <link rel="icon"  href=""""),_display_(/*10.30*/routes/*10.36*/.Assets.at("/public/images/" ,"favicon.gif")),format.raw/*10.80*/("""" type="image/x-icon"/>
    <link rel="shortcut icon" href=""""),_display_(/*11.38*/routes/*11.44*/.Assets.at("/public/images/" , "favicon.gif")),format.raw/*11.89*/("""" type="image/x-icon"/> 
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.at("/public/stylesheets/", "styles.css")),format.raw/*12.105*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.51*/routes/*13.57*/.Assets.at("/public/stylesheets/","bootstrap-theme.css")),format.raw/*13.113*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*14.51*/routes/*14.57*/.Assets.at("/public/stylesheets/","bootstrap.css")),format.raw/*14.107*/(""""/>

    <script type="text/javascript" src=""""),_display_(/*16.42*/routes/*16.48*/.Assets.at("/public/javascripts/", "jquery-1.11.1.min.js")),format.raw/*16.106*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*17.42*/routes/*17.48*/.Assets.at("/public/javascripts/", "bootstrap.js")),format.raw/*17.98*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*18.42*/routes/*18.48*/.Assets.at("/public/javascripts/", "scripts.js")),format.raw/*18.96*/(""""></script>
    		
  </head>

  <body>
  	
    <!--start container-->
    <div id="container">

      <!--start header-->
      <header>  
        <!--start logo-->
        <a href="index" id="logo"><img src=""""),_display_(/*30.46*/routes/*30.52*/.Assets.at("/public/images/", "logo.png")),format.raw/*30.93*/("""" alt="logo"/></a> 
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

                    """),_display_(/*63.22*/for(paciente<- lists.pacienteList) yield /*63.56*/{_display_(Seq[Any](format.raw/*63.57*/("""
                    """),format.raw/*64.21*/("""<div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">"""),_display_(/*67.60*/paciente/*67.68*/.getNome()),format.raw/*67.78*/("""</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="radio">
                          </div>
                        </div>
                    </div>                   
                  """)))}),format.raw/*74.20*/("""
                  """),format.raw/*75.19*/("""</div>
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
                            <input id="alenia" type="checkbox" onclick="if(this.checked)"""),format.raw/*97.89*/("""{"""),format.raw/*97.90*/("""$('#expansao_alenia').collapse('show')"""),format.raw/*97.128*/("""}"""),format.raw/*97.129*/("""else"""),format.raw/*97.133*/("""{"""),format.raw/*97.134*/("""$('#expansao_alenia').collapse('hide')"""),format.raw/*97.172*/("""}"""),format.raw/*97.173*/("""">
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

                    """),_display_(/*112.22*/for(medicamento <- lists.medicamentoList) yield /*112.63*/{_display_(Seq[Any](format.raw/*112.64*/("""

                    """),format.raw/*114.21*/("""<div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">"""),_display_(/*117.60*/medicamento/*117.71*/.getNome()),format.raw/*117.81*/("""</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>
                    """)))}),format.raw/*124.22*/("""
                """),format.raw/*125.17*/("""<!--************************************************-->

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

  def render(lists:views.PrescreverMedicamentoModeView): play.twirl.api.HtmlFormat.Appendable = apply(lists)

  def f:((views.PrescreverMedicamentoModeView) => play.twirl.api.HtmlFormat.Appendable) = (lists) => apply(lists)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 12 12:24:50 CST 2014
                  SOURCE: /home/alberto/Documents/java_projects/safe-prescription/app/views/prescrever_medicamento.scala.html
                  HASH: 441f05778827c2af9474c83400a83aa28b05b949
                  MATRIX: 769->1|901->45|928->46|1288->379|1303->385|1368->429|1456->490|1471->496|1537->541|1639->616|1654->622|1724->670|1805->724|1820->730|1898->786|1979->840|1994->846|2066->896|2139->942|2154->948|2234->1006|2314->1059|2329->1065|2400->1115|2480->1168|2495->1174|2564->1222|2801->1432|2816->1438|2878->1479|3971->2545|4021->2579|4060->2580|4109->2601|4317->2782|4334->2790|4365->2800|4661->3065|4708->3084|5748->4096|5777->4097|5844->4135|5874->4136|5907->4140|5937->4141|6004->4179|6034->4180|6843->4961|6901->5002|6941->5003|6992->5025|7201->5206|7222->5217|7254->5227|7537->5478|7583->5495
                  LINES: 26->1|29->1|30->2|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|58->30|58->30|58->30|91->63|91->63|91->63|92->64|95->67|95->67|95->67|102->74|103->75|125->97|125->97|125->97|125->97|125->97|125->97|125->97|125->97|140->112|140->112|140->112|142->114|145->117|145->117|145->117|152->124|153->125
                  -- GENERATED --
              */
          