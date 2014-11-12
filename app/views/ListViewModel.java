package views;

import models.entidades.QuadroClinico;
import models.entidades.Farmaco;
import java.util.List;

public class ListViewModel {

    public List<Farmaco> farmacoList;   
    public List<QuadroClinico> quadrosList;   
    

    public ListViewModel(List<Farmaco> farmacoList,List<QuadroClinico> quadrosList ){
    	this.farmacoList=farmacoList;
    	this.quadrosList=quadrosList;


    }

}