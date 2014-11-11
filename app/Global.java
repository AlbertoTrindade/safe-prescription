import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import play.*;
import models.entidades.*;;

public class Global extends GlobalSettings{

	public void onStart(Application aplicacao){
		DadosIniciais.inserirFarmacos();
		DadosIniciais.inserirMedicamentos();
		DadosIniciais.inserirQuadrosClinicos();
		DadosIniciais.inserirInteracoesQuadrosClinicos();
		DadosIniciais.inserirInteracoesFarmacos();
	}
}

class DadosIniciais{
	
	public static void inserirFarmacos(){
		if (Farmaco.find.all().isEmpty()){
			List<Farmaco> farmacos = new ArrayList<Farmaco>();

			farmacos.add(new Farmaco("ácido acetilsalicílico"));
			farmacos.add(new Farmaco("ácido ascórbico"));
			farmacos.add(new Farmaco("amoxicilina"));
			farmacos.add(new Farmaco("bicarbonato de sódio"));
			farmacos.add(new Farmaco("cafeína"));
			farmacos.add(new Farmaco("carbidopa"));
			farmacos.add(new Farmaco("cefalexina"));
			farmacos.add(new Farmaco("ciclosporina"));
			farmacos.add(new Farmaco("clonazepam"));
			farmacos.add(new Farmaco("dexametasona"));
			farmacos.add(new Farmaco("diazepam"));
			farmacos.add(new Farmaco("difenidramina"));
			farmacos.add(new Farmaco("dimenidrinato"));
			farmacos.add(new Farmaco("dipirona"));
			farmacos.add(new Farmaco("entacapona"));
			farmacos.add(new Farmaco("escitalopram"));
			farmacos.add(new Farmaco("fenobarbital"));
			farmacos.add(new Farmaco("fexofenadina"));
			farmacos.add(new Farmaco("glicose"));
			farmacos.add(new Farmaco("hidróxido de alumínio"));
			farmacos.add(new Farmaco("isotretinoína"));
			farmacos.add(new Farmaco("lansoprazol"));
			farmacos.add(new Farmaco("levodopa"));
			farmacos.add(new Farmaco("metilfenidato"));
			farmacos.add(new Farmaco("omeprazol"));
			farmacos.add(new Farmaco("orfenadrina"));
			farmacos.add(new Farmaco("paracetamol"));
			farmacos.add(new Farmaco("propranolol"));
			farmacos.add(new Farmaco("simeticona"));
			farmacos.add(new Farmaco("sinvastatina"));
			farmacos.add(new Farmaco("sulfametizol"));
			farmacos.add(new Farmaco("sulfametoxazol"));
			farmacos.add(new Farmaco("trimetoprima"));
			farmacos.add(new Farmaco("zidovudina")); 
			
			for(Farmaco farmaco : farmacos){
				farmaco.save();
			}
		} 
	}

	public static void inserirMedicamentos(){
		if (Medicamento.find.all().isEmpty()){
			List<Medicamento> medicamentos = new ArrayList<Medicamento>();

			medicamentos.add(new Medicamento("Aas", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique()))));
			medicamentos.add(new Medicamento("Allegra D", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "fexofenadina").findUnique()))));
			medicamentos.add(new Medicamento("Amoxicilina", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "amoxicilina").findUnique()))));
			medicamentos.add(new Medicamento("Anador", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "difenidramina").findUnique(),
																							Farmaco.find.where().eq("nome", "dipirona").findUnique()))));
			medicamentos.add(new Medicamento("Aspirina", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique()))));
			medicamentos.add(new Medicamento("Bactrim", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(),
																							 Farmaco.find.where().eq("nome", "trimetoprima").findUnique(),
																							 Farmaco.find.where().eq("nome", "sulfametizol").findUnique()))));
			medicamentos.add(new Medicamento("Benegrip", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "cafeína").findUnique(),
																							  Farmaco.find.where().eq("nome", "dipirona").findUnique()))));
			medicamentos.add(new Medicamento("Bicarbonato de Sódio", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "bicarbonato de sódio").findUnique()))));
			medicamentos.add(new Medicamento("Buscopan Plus", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "paracetamol").findUnique()))));
			medicamentos.add(new Medicamento("Cebion", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "ácido ascórbico").findUnique()))));
			medicamentos.add(new Medicamento("Cefalexina", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "cefalexina").findUnique()))));
			medicamentos.add(new Medicamento("Ciclosporina", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "ciclosporina").findUnique()))));
			medicamentos.add(new Medicamento("Coristina D", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "cafeína").findUnique(),
					  																		  	 Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique()))));
			medicamentos.add(new Medicamento("Dexametasona", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "dexametasona").findUnique()))));
			medicamentos.add(new Medicamento("Diazepam", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "diazepam").findUnique()))));
			medicamentos.add(new Medicamento("Dipirona", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "dipirona").findUnique()))));
			medicamentos.add(new Medicamento("Dorflex", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "cafeína").findUnique(),
																							 Farmaco.find.where().eq("nome", "dipirona").findUnique(),
																							 Farmaco.find.where().eq("nome", "orfenadrina").findUnique()))));
			medicamentos.add(new Medicamento("Doril", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "cafeína").findUnique(),
					  	 																   Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique()))));
			medicamentos.add(new Medicamento("Dramin", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "dimenidrinato").findUnique()))));
			medicamentos.add(new Medicamento("Energil C", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "ácido ascórbico").findUnique()))));
			medicamentos.add(new Medicamento("Engov", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "cafeína").findUnique(),
					   																	   Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(),
					   																	   Farmaco.find.where().eq("nome", "hidróxido de alumínio").findUnique()))));
			medicamentos.add(new Medicamento("Fluviral", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "paracetamol").findUnique()))));
			medicamentos.add(new Medicamento("Gardenal", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "fenobarbital").findUnique()))));
			medicamentos.add(new Medicamento("Glicose", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "glicose").findUnique()))));
			medicamentos.add(new Medicamento("Lansoprazol", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "lansoprazol").findUnique()))));
			medicamentos.add(new Medicamento("Lexapro", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "escitalopram").findUnique()))));
			medicamentos.add(new Medicamento("Luftal", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "simeticona").findUnique()))));
			medicamentos.add(new Medicamento("Melhoral", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "cafeína").findUnique(),
					   																		  Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique()))));
			medicamentos.add(new Medicamento("Neosaldina", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "cafeína").findUnique(),
						  																		Farmaco.find.where().eq("nome", "dipirona").findUnique()))));
			medicamentos.add(new Medicamento("Novalgina", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "dipirona").findUnique()))));
			medicamentos.add(new Medicamento("Omeprazol", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "omeprazol").findUnique()))));
			medicamentos.add(new Medicamento("Paracetamol", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "paracetamol").findUnique()))));
			medicamentos.add(new Medicamento("Propranolol", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "propranolol").findUnique()))));
			medicamentos.add(new Medicamento("Retrovir", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "zidovudina").findUnique()))));
			medicamentos.add(new Medicamento("Ritalina", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "metilfenidato").findUnique()))));
			medicamentos.add(new Medicamento("Rivotril", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "clonazepam").findUnique()))));
			medicamentos.add(new Medicamento("Roacutan", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "isotretinoína").findUnique()))));
			medicamentos.add(new Medicamento("Sinvastatina", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "sinvastatina").findUnique()))));
			medicamentos.add(new Medicamento("Stalevo", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "carbidopa").findUnique(),
																						     Farmaco.find.where().eq("nome", "entacapona").findUnique(),
																						     Farmaco.find.where().eq("nome", "levodopa").findUnique()))));
			medicamentos.add(new Medicamento("Tylenol Dc", new ArrayList<Farmaco>(Arrays.asList(Farmaco.find.where().eq("nome", "cafeína").findUnique(),
					   																		    Farmaco.find.where().eq("nome", "paracetamol").findUnique()))));
			
			for(Medicamento medicamento : medicamentos){
				medicamento.save();
			}
		}
	}
	
	public static void inserirQuadrosClinicos(){
		if (QuadroClinico.find.all().isEmpty()){
			List<QuadroClinico> quadrosClinicos = new ArrayList<QuadroClinico>();

			quadrosClinicos.add(new QuadroClinico("Alcoolismo"));
			quadrosClinicos.add(new QuadroClinico("Anemia"));
			quadrosClinicos.add(new QuadroClinico("Anomalias de Coagulação"));
			quadrosClinicos.add(new QuadroClinico("Asma"));
			quadrosClinicos.add(new QuadroClinico("Deficiência em Vitamina K"));
			quadrosClinicos.add(new QuadroClinico("Depressão da Medula Óssea/Baixa Contagem de Celulas Sanguíneas"));
			quadrosClinicos.add(new QuadroClinico("Desidratação"));
			quadrosClinicos.add(new QuadroClinico("Desnutrição"));
			quadrosClinicos.add(new QuadroClinico("Diarreia"));
			quadrosClinicos.add(new QuadroClinico("Doença Cardiovascular"));
			quadrosClinicos.add(new QuadroClinico("Doenças Hepáticas"));
			quadrosClinicos.add(new QuadroClinico("Fenilcetonúria"));
			quadrosClinicos.add(new QuadroClinico("Glaucoma/Hipertensão Ocular"));
			quadrosClinicos.add(new QuadroClinico("Hemodiálise"));
			quadrosClinicos.add(new QuadroClinico("Hemorragia"));
			quadrosClinicos.add(new QuadroClinico("Hipertensão"));
			quadrosClinicos.add(new QuadroClinico("Hipertireoidismo"));
			quadrosClinicos.add(new QuadroClinico("HIV"));
			quadrosClinicos.add(new QuadroClinico("Infarto do Miocárdio"));
			quadrosClinicos.add(new QuadroClinico("Influenza"));
			quadrosClinicos.add(new QuadroClinico("Insuficiência Renal"));
			quadrosClinicos.add(new QuadroClinico("Mononucleose"));
			quadrosClinicos.add(new QuadroClinico("Obstrução Gastrointestinal"));
			quadrosClinicos.add(new QuadroClinico("Pressão Baixa"));
			quadrosClinicos.add(new QuadroClinico("Retenção Urinária"));
			quadrosClinicos.add(new QuadroClinico("Taquiarritmia"));
			quadrosClinicos.add(new QuadroClinico("Trombocitopatia"));
			quadrosClinicos.add(new QuadroClinico("Trombocitopenia"));
			quadrosClinicos.add(new QuadroClinico("Úlcera Péptica"));
			quadrosClinicos.add(new QuadroClinico("Varicella-Zoster"));
			
			for(QuadroClinico quadroClinico : quadrosClinicos){
				quadroClinico.save();
			}
		} 
	}
	
	public static void inserirInteracoesQuadrosClinicos(){
		if (InteracaoQuadroClinico.find.all().isEmpty()){
			List<InteracaoQuadroClinico> interacoesQuadrosClinicos = new ArrayList<InteracaoQuadroClinico>();

			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Moderado",
																     "Salicylates, particularly aspirin, can cause dose-related gastrointestinal bleeding and mucosal damage, which may occur independently of each other."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "dipirona").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Leve",
																     "Não deve ser usado com bebidas alcoólicas porque o efeito do álcool pode ser potencializado."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "trimetoprima").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Moderado",
																     "The use of trimethoprim is contraindicated in patients with documented megaloblastic anemia due to folate deficiency."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "paracetamol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Moderado",
																     "Chronic alcohol abusers may be at increased risk of hepatotoxicity during treatment with acetaminophen (APAP)."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Moderado",
																     "The use of benzodiazepines is contraindicated in patients with acute alcohol intoxication exhibiting depressed vital signs."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "fenobarbital").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Moderado",
																     "The use of barbiturates is contraindicated in patients with acute alcohol intoxication exhibiting depressed vital signs."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "zidovudina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Moderado",
																     "Therapy with NRTIs should be administered cautiously in patients with preexisting liver disease, a history of alcohol abuse, or hepatitis."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "metilfenidato").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Moderado",
																     "Central nervous system (CNS) stimulants, especially amphetamines, have significant potential for habituation and abuse."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "clonazepam").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Moderado",
																     "Therapy with benzodiazepines should be administered cautiously in patients who might be prone to acute alcohol intake."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sinvastatina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Alcoolismo").findUnique(), 
																     "Moderado",
																     "The use of HMG-CoA reductase inhibitors is contraindicated in patients with active liver disease or unexplained, persistent elevations of serum transaminases."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Moderado",
																     "Therapy with salicylate drugs should be administered cautiously in patients with renal impairment, especially if it is severe."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "fexofenadina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Leve",
																     "Fexofenadine is primarily eliminated unchanged by the kidney.  Patients with renal impairment may be at greater risk for adverse effects from fexofenadine due to decreased drug clearance."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "amoxicilina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Leve",
																     "Most beta-lactam antibiotics are eliminated by the kidney as unchanged drug and, in some cases, also as metabolites."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Moderado",
																     "Sulfonamides and their metabolites are eliminated by the kidney.  Patients with renal impairment may be at greater risk for adverse effects from sulfonamides due to decreased drug clearance."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "trimetoprima").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Leve",
																     "The use of trimethoprim is contraindicated in patients with documented megaloblastic anemia due to folate deficiency."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "cefalexina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Leve",
																     "Most beta-lactam antibiotics are eliminated by the kidney as unchanged drug and, in some cases, also as metabolites."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "dexametasona").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Leve",
																     "Corticosteroids may cause hypernatremia, hypokalemia, fluid retention, and elevation in blood pressure."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Moderado",
																     "Benzodiazepines are metabolized by the liver, and the metabolites are excreted in the urine."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "dimenidrinato").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Leve",
																     "Patients with renal and/or liver disease may be at greater risk for adverse effects from antihistamines due to drug and metabolite accumulation."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "fenobarbital").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Moderado",
																     "Therapy with phenobarbital should be administered cautiously and initiated at reduced dosages in patients with renal impairment."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "zidovudina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Moderado",
																     "Patients with clinically significant renal impairment may be at greater risk for toxicities and adverse effects from nucleoside reverse transcriptase inhibitors (NRTIs) due to decreased drug clearance."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "clonazepam").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Moderado",
																     "The use of clonazepam is considered by the manufacturer to be contraindicated in patients with clinical or biochemical evidence of significant liver disease."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sinvastatina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Insuficiência Renal").findUnique(), 
																     "Moderado",
																     "Although simvastatin itself is not eliminated by the kidney, the plasma concentrations of total HMG-CoA reductase inhibitors after a single dose of simvastatin may be increased in patients with significant renal impairment."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Doenças Hepáticas").findUnique(), 
																     "Leve",
																     "The use of salicylates has occasionally been associated with acute, reversible hepatotoxicity, primarily manifested as elevations of serum transaminases, alkaline phosphatase and/or, rarely, bilirubin."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "difenidramina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Doenças Hepáticas").findUnique(), 
																     "Leve",
																     "Patients with renal and/or liver disease may be at greater risk for adverse effects from antihistamines due to drug and metabolite accumulation.  Therapy with antihistamines should be administered cautiously in such patients."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Doenças Hepáticas").findUnique(), 
																     "Moderado",
																     "Hepatotoxicity, including jaundice, diffuse hepatocellular necrosis, hypersensitivity hepatitis and hepatic failure, has rarely been reported in patients receiving sulfonamides."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "paracetamol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Doenças Hepáticas").findUnique(), 
																     "Moderado",
																     "Acetaminophen is primarily metabolized in the liver to inactive forms.  However, small quantities are converted by minor pathways to metabolites that can cause hepatotoxicity or methemoglobinemia."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Doenças Hepáticas").findUnique(), 
																     "Moderado",
																     "Benzodiazepines are metabolized by the liver, and the metabolites are excreted in the urine."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Anomalias de Coagulação").findUnique(), 
																     "Moderado",
																     "The use of aspirin is contraindicated in patients with significant active bleeding or hemorrhagic disorders such as hemophilia, von Willebrand's disease, or telangiectasia."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hemorragia").findUnique(), 
																     "Moderado",
																     "The use of aspirin is contraindicated in patients with significant active bleeding or hemorrhagic disorders such as hemophilia, von Willebrand's disease, or telangiectasia."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Trombocitopatia").findUnique(), 
																     "Moderado",
																     "The use of aspirin is contraindicated in patients with significant active bleeding or hemorrhagic disorders such as hemophilia, von Willebrand's disease, or telangiectasia."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Trombocitopenia").findUnique(), 
																     "Moderado",
																     "The use of aspirin is contraindicated in patients with significant active bleeding or hemorrhagic disorders such as hemophilia, von Willebrand's disease, or telangiectasia."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Deficiência em Vitamina K").findUnique(), 
																     "Moderado",
																	 "The use of aspirin is contraindicated in patients with significant active bleeding or hemorrhagic disorders such as hemophilia, von Willebrand's disease, or telangiectasia."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Asma").findUnique(), 
																     "Moderado",
																     "Approximately 10% of patients with asthma may have aspirin-sensitive asthma, characterized by nasal polyposis, pansinusitis, eosinophilia, and precipitation of asthma and rhinitis attacks after ingestion of aspirin."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "difenidramina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Asma").findUnique(), 
																     "Leve",
																     "It has been suggested that the anticholinergic effect of antihistamines may reduce the volume and cause thickening of bronchial secretions, resulting in obstruction of respiratory tract."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Asma").findUnique(), 
																     "Moderado",
																     "Therapy with sulfonamides should be administered cautiously in patients with severe allergies, bronchial asthma or AIDS, since these patients may be at increased risk for potentially severe hypersensitivity reactions."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "dimenidrinato").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Asma").findUnique(), 
																     "Leve",
																	 "It has been suggested that the anticholinergic effect of antihistamines may reduce the volume and cause thickening of bronchial secretions, resulting in obstruction of respiratory tract."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Asma").findUnique(), 
																     "Moderado",
																     "In general, beta-adrenergic receptor blocking agents (i.e., beta-blockers) should not be used in patients with bronchospastic diseases."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Úlcera Péptica").findUnique(), 
																     "Moderado",
																     "Salicylates, particularly aspirin, can cause dose-related gastrointestinal bleeding and mucosal damage, which may occur independently of each other."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "cafeína").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Úlcera Péptica").findUnique(), 
																     "Moderado",
																     "Methylxanthines are known to stimulate peptic acid secretion.  Therapy with products containing methylxanthines should be administered with extreme caution in patients with active peptic ulcer disease."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Influenza").findUnique(), 
																     "Moderado",
																     "The use of salicylates, primarily aspirin, in children with varicella infections or influenza-like illnesses has been associated with an increased risk of Reye's syndrome."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Varicella-Zoster").findUnique(), 
																     "Moderado",
																     "The use of salicylates, primarily aspirin, in children with varicella infections or influenza-like illnesses has been associated with an increased risk of Reye's syndrome."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Anemia").findUnique(), 
																     "Leve",
																     "Occult, often asymptomatic GI blood loss occurs quite frequently with the use of normal dosages of aspirin and stems from the drug's local effect on the GI mucosa."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hemodiálise").findUnique(), 
																     "Leve",
																     "Salicylate and its metabolites are readily removed by hemodialysis and, to a lesser extent, by peritoneal dialysis."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "amoxicilina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hemodiálise").findUnique(), 
																     "Leve",
																     "Penicillin antibiotics (except for agents in the penicillinase-resistant class) are removed by hemodialysis."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hemodiálise").findUnique(), 
																     "Leve",
																     "The sulfonamides, sulfadiazine, sulfamethoxazole, and sulfisoxazole, are partially removed by hemodialysis and should be administered after dialysis."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "trimetoprima").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hemodiálise").findUnique(), 
																     "Leve",
																     "Trimethoprim is moderately removed by hemodialysis.  Doses should either be scheduled for administration after dialysis or supplemental doses be given after dialysis."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "cefalexina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hemodiálise").findUnique(), 
																     "Leve",
																     "Most cephalosporin antibiotics are removed by hemodialysis.  Doses should either be scheduled for administration after dialysis or supplemental doses be given after dialysis."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hemodiálise").findUnique(), 
																     "Moderado",
																     "Therapy with beta-adrenergic receptor blocking agents (aka beta-blockers) should be administered cautiously in patients requiring hemodialysis."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "amoxicilina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Mononucleose").findUnique(), 
																     "Leve",
																     "Patients with mononucleosis treated with an aminopenicillin antibiotic, particularly ampicillin, quite frequently develop a pruritic erythematous maculopapular skin rash that generally occurs 5 to 10 days after therapy is initiated."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "amoxicilina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Fenilcetonúria").findUnique(), 
																     "Leve",
																     "Augmentin (brand of amoxicillin-clavulanate) chewable tablets contain 2.1 mg of phenylalanine per each 200 mg tablet and 4.2 mg of phenylalanine per each 400 mg tablet."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "difenidramina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Obstrução Gastrointestinal").findUnique(), 
																     "Leve",
																     "Antihistamines often have anticholinergic activity, to which elderly patients are particularly sensitive."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "difenidramina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Retenção Urinária").findUnique(), 
																     "Leve",
																     "Antihistamines often have anticholinergic activity, to which elderly patients are particularly sensitive."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "difenidramina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Glaucoma/Hipertensão Ocular").findUnique(), 
																     "Leve",
																     "Antihistamines often have anticholinergic activity, to which elderly patients are particularly sensitive."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "difenidramina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Doença Cardiovascular").findUnique(), 
																     "Leve",
																     "Antihistamines may infrequently cause cardiovascular adverse effects related to their anticholinergic and local anesthetic (quinidine-like) activities."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "difenidramina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hipertireoidismo").findUnique(), 
																     "Leve",
																  	 "Antihistamines may infrequently cause cardiovascular adverse effects related to their anticholinergic and local anesthetic (quinidine-like) activities."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "cafeína").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hipertireoidismo").findUnique(), 
																     "Leve",
																  	 "Like other methylxanthines, caffeine at high dosages may be associated with positive inotropic and chronotropic effects on the heart."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "difenidramina").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Pressão Baixa").findUnique(), 
																     "Leve",
																     "Antihistamines may infrequently cause cardiovascular adverse effects related to their anticholinergic and local anesthetic (quinidine-like) activities."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "dimenidrinato").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Pressão Baixa").findUnique(), 
																     "Leve",
																     "Antihistamines may infrequently cause cardiovascular adverse effects related to their anticholinergic and local anesthetic (quinidine-like) activities."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Pressão Baixa").findUnique(), 
																     "Moderado",
																     "The use of beta-adrenergic receptor blocking agents (aka beta-blockers) is contraindicated in patients with hypotension or cardiogenic shock."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Depressão da Medula Óssea/Baixa Contagem de Celulas Sanguíneas").findUnique(), 
																     "Moderado",
																     "Therapy with sulfonamides should be administered cautiously in patients with preexisting blood dyscrasias or bone marrow suppression."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Depressão da Medula Óssea/Baixa Contagem de Celulas Sanguíneas").findUnique(), 
																     "Moderado",
																     "Zidovudine (AZT) may cause bone marrow toxicity, most commonly manifested as granulocytopenia and anemia, particularly in patients with advanced, symptomatic HIV disease."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "HIV").findUnique(), 
																     "Moderado",
																     "The use of sulfonamides is associated with large increases in the risk of Stevens-Johnson syndrome, toxic epidermal necrolysis and other serious dermatologic reactions, although these phenomena are rare as a whole."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Desidratação").findUnique(), 
																     "Leve",
																     "Crystalluria can occur during sulfonamide therapy due to precipitation of the sulfonamide and/or its N4-acetyl metabolite in the urinary tract."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Diarreia").findUnique(), 
																     "Moderado",
																     "Crystalluria can occur during sulfonamide therapy due to precipitation of the sulfonamide and/or its N4-acetyl metabolite in the urinary tract."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "trimetoprima").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Desnutrição").findUnique(), 
																     "Moderado",
																     "The use of trimethoprim is contraindicated in patients with documented megaloblastic anemia due to folate deficiency."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "cafeína").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Taquiarritmia").findUnique(), 
																     "Leve",
																     "Like other methylxanthines, caffeine at high dosages may be associated with positive inotropic and chronotropic effects on the heart."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "cafeína").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Infarto do Miocárdio").findUnique(), 
																     "Leve",
																     "Like other methylxanthines, caffeine at high dosages may be associated with positive inotropic and chronotropic effects on the heart."));
			interacoesQuadrosClinicos.add(new InteracaoQuadroClinico(Farmaco.find.where().eq("nome", "cafeína").findUnique(), 
																     QuadroClinico.find.where().eq("nome", "Hipertensão").findUnique(), 
																     "Leve",
																     "Like other methylxanthines, caffeine at high dosages may be associated with positive inotropic and chronotropic effects on the heart."));
			
			for(InteracaoQuadroClinico interacaoQuadroClinico : interacoesQuadrosClinicos){
				interacaoQuadroClinico.save();
			}
		}
	}
	
	public static void inserirInteracoesFarmacos() {
		
		if (InteracaoFarmaco.find.all().isEmpty()){
			List<InteracaoFarmaco> interacoesFarmacos = new ArrayList<InteracaoFarmaco>();

			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "ácido ascórbico").findUnique(), 
													    Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
													    "Leve",
														"Limited data suggest that ascorbic acid may decrease the oral bioavailability of propranolol by possibly interfering with its absorption from the gastrointestinal tract."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
													    Farmaco.find.where().eq("nome", "cafeína").findUnique(), 
													    "Leve",
														"One study has reported that coadministration of caffeine and aspirin lead to a 25% increase in the rate of appearance and 17% increase in maximum concentration of salicylate in the plasma."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
													    Farmaco.find.where().eq("nome", "ciclosporina").findUnique(), 
													    "Moderado",
														"Nonsteroidal anti-inflammatory drugs (NSAIDs) may potentiate the nephrotoxic effects of cyclosporine, especially if dehydration is present."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
													    Farmaco.find.where().eq("nome", "dexametasona").findUnique(), 
													    "Moderado",
														"Coadministration with corticosteroids may decrease the serum concentrations and therapeutic effects of salicylates."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
													    Farmaco.find.where().eq("nome", "escitalopram").findUnique(), 
													    "Moderado",
														"Published case reports have documented the occurrence of bleeding episodes in patients treated with psychotropic agents that interfere with serotonin reuptake."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
													    Farmaco.find.where().eq("nome", "lansoprazol").findUnique(), 
													    "Leve",
														"Coadministration with proton pump inhibitors may decrease the oral bioavailability of aspirin and other salicylates."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
													    Farmaco.find.where().eq("nome", "omeprazol").findUnique(), 
													    "Leve",
														"Coadministration with proton pump inhibitors may decrease the oral bioavailability of aspirin and other salicylates."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
													    Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
													    "Leve",
														"High doses of salicylates may blunt the antihypertensive effects of beta-blockers."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
													    Farmaco.find.where().eq("nome", "bicarbonato de sódio").findUnique(), 
													    "Moderado",
														"Agents that cause urinary alkalinization can reduce serum salicylate concentrations in patients receiving anti-inflammatory dosages of aspirin or other salicylates."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "trimetoprima").findUnique(), 
													    Farmaco.find.where().eq("nome", "zidovudina").findUnique(), 
													    "Leve",
														"Limited data indicate that zidovudine may significantly increase the serum half-life of both trimethoprim (TMP) and sulfamethoxazole (SMX)."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "sulfametoxazol").findUnique(), 
													    Farmaco.find.where().eq("nome", "zidovudina").findUnique(), 
													    "Leve",
														"Limited data indicate that zidovudine may significantly increase the serum half-life of both trimethoprim (TMP) and sulfamethoxazole (SMX)."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "trimetoprima").findUnique(), 
													    Farmaco.find.where().eq("nome", "sinvastatina").findUnique(), 
													    "Moderado",
														"Prolonged use of certain nucleoside reverse transcriptase inhibitors may commonly cause myopathy, including rare cases of rhabdomyolysis."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "paracetamol").findUnique(), 
													    Farmaco.find.where().eq("nome", "fenobarbital").findUnique(), 
													    "Moderado",
														"Barbiturates may increase the hepatotoxic potential of acetaminophen and decrease its therapeutic effects."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "paracetamol").findUnique(), 
													    Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
													    "Leve",
														"Two studies have suggested that propranolol may increase the pharmacologic effects of acetaminophen."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "paracetamol").findUnique(), 
													    Farmaco.find.where().eq("nome", "zidovudina").findUnique(), 
													    "Leve",
														"Case reports have suggested that the concomitant use of zidovudine and acetaminophen may potentiate the risk of bone marrow suppression and hepatotoxicity; however data have been conflicting."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "orfenadrina").findUnique(), 
													    Farmaco.find.where().eq("nome", "fenobarbital").findUnique(), 
													    "Moderado",
														"Central nervous system- and/or respiratory-depressant effects may be additively or synergistically increased in patients taking multiple drugs that cause these effects, especially in elderly or debilitated patients."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "orfenadrina").findUnique(), 
													    Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
													    "Moderado",
														"Coadministration with antihypertensive agents, in particular vasodilators and alpha-blockers, may result in additive effects on blood pressure and orthostasis."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "omeprazol").findUnique(), 
													    Farmaco.find.where().eq("nome", "fenobarbital").findUnique(), 
													    "Leve",
														"Coadministration with inhibitors of CYP450 2C19 may theoretically increase the plasma concentrations of phenobarbital, which is a substrate of the isoenzyme."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "omeprazol").findUnique(), 
													    Farmaco.find.where().eq("nome", "sinvastatina").findUnique(), 
													    "Moderado",
														"A case report suggests that coadministration with esomeprazole may increase the plasma concentrations of atorvastatin and the associated risk of myopathy."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "metilfenidato").findUnique(), 
													    Farmaco.find.where().eq("nome", "fenobarbital").findUnique(), 
													    "Leve",
														"According to the manufacturer, methylphenidate may inhibit the metabolism of anticonvulsants including phenobarbital, phenytoin, and primidone."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "levodopa").findUnique(), 
													    Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
													    "Moderado",
														"The hypotensive effects of levodopa and antihypertensive agents may be additive."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "levodopa").findUnique(), 
													    Farmaco.find.where().eq("nome", "sinvastatina").findUnique(), 
													    "Moderado",
														"The risk of peripheral neuropathy may be increased during concurrent use of two or more agents that are associated with this adverse effect."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "lansoprazol").findUnique(), 
													    Farmaco.find.where().eq("nome", "fenobarbital").findUnique(), 
													    "Leve",
														"Coadministration with inhibitors of CYP450 2C19 may theoretically increase the plasma concentrations of phenobarbital, which is a substrate of the isoenzyme."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "lansoprazol").findUnique(), 
													    Farmaco.find.where().eq("nome", "sinvastatina").findUnique(), 
													    "Moderado",
														"A case report suggests that coadministration with esomeprazole may increase the plasma concentrations of atorvastatin and the associated risk of myopathy."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "hidróxido de alumínio").findUnique(), 
													    Farmaco.find.where().eq("nome", "ácido acetilsalicílico").findUnique(), 
													    "Moderado",
														"Chronic administration of antacids may reduce serum salicylate concentrations in patients receiving large doses of aspirin or other salicylates."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "hidróxido de alumínio").findUnique(), 
													    Farmaco.find.where().eq("nome", "clonazepam").findUnique(), 
													    "Leve",
														"A number of studies have reported that antacids can delay the gastrointestinal absorption and reduce the peak plasma concentration (Cmax) of some benzodiazepines."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "hidróxido de alumínio").findUnique(), 
													    Farmaco.find.where().eq("nome", "ciclosporina").findUnique(), 
													    "Moderado",
														"The blood concentrations of orally administered cyclosporine were reported to have decreased rapidly in a pediatric patient who had been administered cyclosporine combined with dried aluminum hydroxide gel."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "hidróxido de alumínio").findUnique(), 
													    Farmaco.find.where().eq("nome", "dexametasona").findUnique(), 
													    "Leve",
														"Antacids and agents with acid-neutralizing effects may impair the absorption of dexamethasone, prednisolone, prednisone, and other corticosteroids, although data from published studies are somewhat conflicting."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "hidróxido de alumínio").findUnique(), 
													    Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    "Leve",
														"A number of studies have reported that antacids can delay the gastrointestinal absorption and reduce the peak plasma concentration (Cmax) of some benzodiazepines."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "hidróxido de alumínio").findUnique(), 
													    Farmaco.find.where().eq("nome", "fexofenadina").findUnique(), 
													    "Moderado",
														"The concomitant administration of aluminum or magnesium-containing antacids with fexofenadine reduces its peak serum concentrations (Cmax) by 43% and area under the plasma concentration-time curve (AUC) by 41%."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "hidróxido de alumínio").findUnique(), 
													    Farmaco.find.where().eq("nome", "levodopa").findUnique(), 
													    "Leve",
														"Antacids and some oral aluminum, calcium, or magnesium containing preparations may increase the absorption of levodopa."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "hidróxido de alumínio").findUnique(), 
													    Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
													    "Leve",
														"Concurrent administration with aluminum and magnesium antacids has been shown to decrease the oral bioavailability of certain beta-blockers, although data are conflicting."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "fenobarbital").findUnique(), 
													    Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
													    "Moderado",
														"Coadministration with barbiturates may decrease the plasma concentrations and pharmacologic effects of certain beta-blockers when administered orally."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "dipirona").findUnique(), 
													    Farmaco.find.where().eq("nome", "ciclosporina").findUnique(), 
													    "Leve",
														"A dipirona sódica pode causar redução dos níveis plasmáticos de ciclosporina. Deve-se, portanto, realizar monitorização das concentrações de ciclosporina quando da administração concomitante."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    Farmaco.find.where().eq("nome", "difenidramina").findUnique(), 
													    "Moderado",
														"Central nervous system- and/or respiratory-depressant effects may be additively or synergistically increased in patients taking multiple drugs that cause these effects, especially in elderly or debilitated patients."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    Farmaco.find.where().eq("nome", "entacapona").findUnique(), 
													    "Moderado",
														"Central nervous system- and/or respiratory-depressant effects may be additively or synergistically increased in patients taking multiple drugs that cause these effects, especially in elderly or debilitated patients."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    Farmaco.find.where().eq("nome", "escitalopram").findUnique(), 
													    "Moderado",
														"Central nervous system- and/or respiratory-depressant effects may be additively or synergistically increased in patients taking multiple drugs that cause these effects, especially in elderly or debilitated patients."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    Farmaco.find.where().eq("nome", "levodopa").findUnique(), 
													    "Moderado",
														"Benzodiazepines may decrease the therapeutic effects of levodopa in patients with Parkinson's disease."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    Farmaco.find.where().eq("nome", "omeprazol").findUnique(), 
													    "Moderado",
														"Omeprazole may increase the pharmacologic effects and serum levels of certain benzodiazepines via hepatic enzyme inhibition."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    Farmaco.find.where().eq("nome", "orfenadrina").findUnique(), 
													    "Moderado",
														"Central nervous system- and/or respiratory-depressant effects may be additively or synergistically increased in patients taking multiple drugs that cause these effects, especially in elderly or debilitated patients."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
													    "Leve",
														"The pharmacologic effects of some benzodiazepines may be increased by some beta-blockers."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    Farmaco.find.where().eq("nome", "zidovudina").findUnique(), 
													    "Leve",
														"One study has suggested that patients receiving zidovudine and a benzodiazepine concomitantly may demonstrate increased plasma clearance of the benzodiazepine."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "dexametasona").findUnique(), 
													    Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    "Leve",
														"Certain corticosteroids may decrease the plasma concentration of some benzodiazepines."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "dexametasona").findUnique(), 
													    Farmaco.find.where().eq("nome", "fenobarbital").findUnique(), 
													    "Moderado",
														"Barbiturates may decrease the plasma concentrations and systemic effects of both endogenous and exogenous corticosteroids."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "dexametasona").findUnique(), 
													    Farmaco.find.where().eq("nome", "propranolol").findUnique(), 
													    "Moderado",
														"Corticosteroids may antagonize the effects of antihypertensive medications by inducing sodium and fluid retention."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "dexametasona").findUnique(), 
													    Farmaco.find.where().eq("nome", "zidovudina").findUnique(), 
													    "Moderado",
														"Prolonged use of certain nucleoside reverse transcriptase inhibitors may commonly cause myopathy, including rare cases of rhabdomyolysis."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "cafeína").findUnique(), 
													    Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    "Leve",
														"One study has reported a 22% reduction in diazepam plasma levels when coadministered with caffeine."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "bicarbonato de sódio").findUnique(), 
													    Farmaco.find.where().eq("nome", "clonazepam").findUnique(), 
													    "Leve",
														"A number of studies have reported that antacids can delay the gastrointestinal absorption and reduce the peak plasma concentration (Cmax) of some benzodiazepines."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "bicarbonato de sódio").findUnique(), 
													    Farmaco.find.where().eq("nome", "dexametasona").findUnique(), 
													    "Leve",
														"Antacids and agents with acid-neutralizing effects may impair the absorption of dexamethasone, prednisolone, prednisone, and other corticosteroids, although data from published studies are somewhat conflicting."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "bicarbonato de sódio").findUnique(), 
													    Farmaco.find.where().eq("nome", "diazepam").findUnique(), 
													    "Leve",
														"A number of studies have reported that antacids can delay the gastrointestinal absorption and reduce the peak plasma concentration (Cmax) of some benzodiazepines."));
			interacoesFarmacos.add(new InteracaoFarmaco(Farmaco.find.where().eq("nome", "bicarbonato de sódio").findUnique(), 
													    Farmaco.find.where().eq("nome", "levodopa").findUnique(), 
													    "Leve",
														"Antacids and some oral aluminum, calcium, or magnesium containing preparations may increase the absorption of levodopa."));

			for(InteracaoFarmaco interacaoFarmaco : interacoesFarmacos){
				interacaoFarmaco.save();
			}
		}
	}
}