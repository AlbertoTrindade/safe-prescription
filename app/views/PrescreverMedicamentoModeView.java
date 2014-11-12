package views;

import models.entidades.Medicamento;
import models.entidades.Paciente;
import java.util.List;

public class PrescreverMedicamentoModeView {

    public List<Paciente> pacienteList;   
    public List<Medicamento> medicamentoList;   
    

    public PrescreverMedicamentoModeView(List<Paciente> pacienteList,List<Medicamento> medicamentoList ){
    	this.pacienteList=pacienteList;
    	this.medicamentoList=medicamentoList;
    }

}