
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
object cadastrar_paciente extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[views.ListViewModel,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lists: views.ListViewModel):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.30*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

  <head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8" />
    <title>SafePrescription - Documentos</title>

    <link rel="icon" href=""""),_display_(/*10.29*/routes/*10.35*/.Assets.at("/public/images/", "favicon.gif")),format.raw/*10.79*/("""" type="image/x-icon"/>
    <link rel="shortcut icon" href=""""),_display_(/*11.38*/routes/*11.44*/.Assets.at("/public/images/", "favicon.gif")),format.raw/*11.88*/("""" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.at("/public/stylesheets/", "styles.css")),format.raw/*12.105*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.51*/routes/*13.57*/.Assets.at("/public/stylesheets/","bootstrap-theme.css")),format.raw/*13.113*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*14.51*/routes/*14.57*/.Assets.at("/public/stylesheets/","bootstrap.css")),format.raw/*14.107*/(""""/>

    <script type="text/javascript" src=""""),_display_(/*16.42*/routes/*16.48*/.Assets.at("/public/javascripts/", "jquery-1.11.1.min.js")),format.raw/*16.106*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*17.42*/routes/*17.48*/.Assets.at("/public/javascripts/", "bootstrap.js")),format.raw/*17.98*/(""""></script>
    		
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
            <li><a href="cadastrar_paciente" class="current">Cadastrar Paciente</a></a></li>
          	<li><a href="prescrever_medicamento">Prescrever Medicações</a></a></li>
          </ul>
        </nav>
        <!--end menu-->
      
    	</header>
      <!--end header-->

      <!--start intro-->
      <div class="intro-2" >
      
            <h3 class="titulo">Cadastrar Paciente</h3>
            <form>

              <!--Informações Básicas-->
              <h4 class="titulo-sessao">Informações Básicas</h4>

              <input id="nome_input" type="text" class="form-control spacing" placeholder="Nome do Paciente">

              <div class="row spacing">
                <div class="col-lg-3">
                  <input id="cpf_input" type="text" class="form-control" placeholder="CPF">
                </div>
                <div class="col-lg-3">
                  <input id="data_nasc_input" type="text" class="form-control" placeholder="Data de Nascimento">
                </div>
                <div class="col-lg-3">
                  <input id="tel_celular_input" type="text" class="form-control" placeholder="Telefone Celular">
                </div>
                <div class="col-lg-3">
                  <input id="tel_fixo_input" type="text" class="form-control" placeholder="Telefone Fixo">
                </div>
              </div>
              <!--*******************************************-->

              <!--Endereço-->
              <h4 class="titulo-sessao">Endereço</h4>

              <div class="row spacing">
                <div class="col-lg-8">
                  <input id="logradouro_input" type="text" class="form-control" placeholder="Logradouro">
                </div>
                <div class="col-lg-2">
                  <input id="numero_input" type="text" class="form-control" placeholder="Número">
                </div>
                <div class="col-lg-2">
                  <input id="complemento_input" type="text" class="form-control" placeholder="Complemento">
                </div>
              </div>

              <div class="row spacing">
                <div class="col-lg-4">
                  <input id="bairro_input" type="text" class="form-control" placeholder="Bairro">
                </div>
                <div class="col-lg-4">
                  <input id="cidade_input" type="text" class="form-control" placeholder="Cidade">
                </div>
                <div class="col-lg-3">
                  <input id="cep_input" type="text" class="form-control" placeholder="CEP">
                </div>
                <div class="col-lg-1">
                  <div class="btn-group">
                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="padding-right:10px;padding-left:9px;">
                      UF <span class="caret"></span>
                    </button>
                    <ul id="dropdown-estados" class="dropdown-menu" role="menu">
                      <li><a href="#" value="AC">AC</a></li>
                      <li><a href="#" value="AL">AL</a></li>
                      <li><a href="#" value="AM">AM</a></li>
                      <li><a href="#" value="AP">AP</a></li>
                      <li><a href="#" value="BA">BA</a></li>
                      <li><a href="#" value="CE">CE</a></li>
                      <li><a href="#" value="DF">DF</a></li>
                      <li><a href="#" value="ES">ES</a></li>
                      <li><a href="#" value="GO">GO</a></li>
                      <li><a href="#" value="MA">MA</a></li>
                      <li><a href="#" value="MG">MG</a></li>
                      <li><a href="#" value="MS">MS</a></li>
                      <li><a href="#" value="MT">MT</a></li>
                      <li><a href="#" value="PA">PA</a></li>
                      <li><a href="#" value="PB">PB</a></li>
                      <li><a href="#" value="PE">PE</a></li>
                      <li><a href="#" value="PI">PI</a></li>
                      <li><a href="#" value="PR">PR</a></li>
                      <li><a href="#" value="RJ">RJ</a></li>
                      <li><a href="#" value="RN">RN</a></li>
                      <li><a href="#" value="RO">RO</a></li>
                      <li><a href="#" value="RR">RR</a></li>
                      <li><a href="#" value="RS">RS</a></li>
                      <li><a href="#" value="SC">SC</a></li>
                      <li><a href="#" value="SE">SE</a></li>
                      <li><a href="#" value="SP">SP</a></li>
                      <li><a href="#" value="TO">TO</a></li>
                    </ul>
                  </div>
                </div>
              </div>
              <!--************************************************-->
              
              <div class="row spacing">

                <!--Quadros Clínicos-->
                <div class="col-lg-6">

                  <h4 class="titulo-sessao">Quadro Clínico</h4>

                  <div class="input-group spacing">
                    <input type="text" class="form-control" placeholder="Search" name="q">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                  </div>

                  <div class="list-group list-scroll">

                    """),_display_(/*151.22*/for(quadro <-lists.quadrosList) yield /*151.53*/{_display_(Seq[Any](format.raw/*151.54*/("""
                      """),format.raw/*152.23*/("""<div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">"""),_display_(/*155.60*/quadro/*155.66*/.getNome()),format.raw/*155.76*/("""</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>
                    """)))}),format.raw/*162.22*/("""                    

                  """),format.raw/*164.19*/("""</div>
                </div>
                <!--************************************************-->

                <!--Alergias-->
                <div class="col-lg-6">

                  <h4 class="titulo-sessao">Alergias</h4>

                  <div class="input-group spacing">
                    <input type="text" class="form-control" placeholder="Search" name="q">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                  </div>

                  <div class="list-group list-scroll">

                    """),_display_(/*182.22*/for(farmaco <-lists.farmacoList) yield /*182.54*/{_display_(Seq[Any](format.raw/*182.55*/("""

                    """),format.raw/*184.21*/("""<div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">"""),_display_(/*187.60*/farmaco/*187.67*/.getNome()),format.raw/*187.77*/("""</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>                    
                    """)))}),format.raw/*194.22*/("""
                  """),format.raw/*195.19*/("""</div>
                </div>

                <!--************************************************************-->
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

  def render(lists:views.ListViewModel): play.twirl.api.HtmlFormat.Appendable = apply(lists)

  def f:((views.ListViewModel) => play.twirl.api.HtmlFormat.Appendable) = (lists) => apply(lists)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 12 12:24:50 CST 2014
                  SOURCE: /home/alberto/Documents/java_projects/safe-prescription/app/views/cadastrar_paciente.scala.html
                  HASH: 48b8d9bf39c6ec060b5b88642eea9ca8fcc37f22
                  MATRIX: 749->1|865->29|892->30|1251->362|1266->368|1331->412|1419->473|1434->479|1499->523|1600->597|1615->603|1685->651|1766->705|1781->711|1859->767|1940->821|1955->827|2027->877|2100->923|2115->929|2195->987|2275->1040|2290->1046|2361->1096|2598->1306|2613->1312|2675->1353|8249->6899|8297->6930|8337->6931|8389->6954|8598->7135|8614->7141|8646->7151|8929->7402|8998->7442|9705->8121|9754->8153|9794->8154|9845->8176|10054->8357|10071->8364|10103->8374|10406->8645|10454->8664
                  LINES: 26->1|29->1|30->2|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|57->29|57->29|57->29|179->151|179->151|179->151|180->152|183->155|183->155|183->155|190->162|192->164|210->182|210->182|210->182|212->184|215->187|215->187|215->187|222->194|223->195
                  -- GENERATED --
              */
          