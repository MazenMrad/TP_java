package tp_classe_abstract_interface;

public class Manutration_danger extends Employe implements Employe_risque{
	int nb_heure;
	public Manutration_danger(String nom, String prenom, int age, int date, int nb_heure) {
		super(nom, prenom, age, date);
		this.nb_heure = nb_heure;
	}
	public void calculer() {
		salaire=this.nb_heure*65+prime;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "EmployeVente [salaire=" + salaire + "]";
	}
	
	}



