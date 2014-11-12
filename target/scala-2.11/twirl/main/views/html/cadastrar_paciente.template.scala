
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
object cadastrar_paciente extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

  <head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8" />
    <title>SafePrescription - Documentos</title>

    <link rel="icon" href=""""),_display_(/*9.29*/routes/*9.35*/.Assets.at("/public/images/", "favicon.gif")),format.raw/*9.79*/("""" type="image/x-icon"/>
    <link rel="shortcut icon" href=""""),_display_(/*10.38*/routes/*10.44*/.Assets.at("/public/images/", "favicon.gif")),format.raw/*10.88*/("""" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.51*/routes/*11.57*/.Assets.at("/public/stylesheets/", "styles.css")),format.raw/*11.105*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.at("/public/stylesheets/","bootstrap-theme.css")),format.raw/*12.113*/(""""/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.51*/routes/*13.57*/.Assets.at("/public/stylesheets/","bootstrap.css")),format.raw/*13.107*/(""""/>

    <script type="text/javascript" src=""""),_display_(/*15.42*/routes/*15.48*/.Assets.at("/public/javascripts/", "jquery-1.11.1.min.js")),format.raw/*15.106*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*16.42*/routes/*16.48*/.Assets.at("/public/javascripts/", "bootstrap.js")),format.raw/*16.98*/(""""></script>
    		
  </head>

  <body>
  	
    <!--start container-->
    <div id="container">

      <!--start header-->
      <header>  
        <!--start logo-->
        <a href="index" id="logo"><img src=""""),_display_(/*28.46*/routes/*28.52*/.Assets.at("/public/images/", "logo.png")),format.raw/*28.93*/("""" alt="logo"/></a> 
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

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Asma</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Diabetes</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Gravidez</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Hipertensão</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Obesidade</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                  </div>
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

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Azitromicina</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Corticóide</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Dipirona</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>


                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Hidroclorotiazida</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>

                    <div class="list-group-item">
                        <div class="row">
                          <div class="col-lg-11">
                            <p style="margin-bottom:0px;">Paracetamol</p>
                          </div>
                          <div class="col-lg-1">
                            <input type="checkbox">
                          </div>
                        </div>
                    </div>
                    
                  </div>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 11 21:39:01 GMT-03:00 2014
                  SOURCE: C:/git/safe-prescription/app/views/cadastrar_paciente.scala.html
                  HASH: 4200adf552ef1c3a556e5af223f782003304fead
                  MATRIX: 811->0|1177->340|1191->346|1255->390|1344->452|1359->458|1424->502|1526->577|1541->583|1611->631|1693->686|1708->692|1786->748|1868->803|1883->809|1955->859|2030->907|2045->913|2125->971|2206->1025|2221->1031|2292->1081|2541->1303|2556->1309|2618->1350
                  LINES: 29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|56->28|56->28|56->28
                  -- GENERATED --
              */
          