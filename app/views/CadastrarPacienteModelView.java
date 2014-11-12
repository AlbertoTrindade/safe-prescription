package views;

import models.entidades.QuadroClinico;
import models.entidades.Farmaco;
import java.util.List;

public class CadastrarPacienteModelView {

    public List<Farmaco> farmacoList;   
    public List<QuadroClinico> quadrosList;   
    

    public CadastrarPacienteModelView(List<Farmaco> farmacoList,List<QuadroClinico> quadrosList ){
    	this.farmacoList=farmacoList;
    	this.quadrosList=quadrosList;
    }

}