package tp_classe_abstract_interface;

public class Production_danger extends Employe implements Employe_risque{
	
	int nb_unité;
	public Production_danger(String nom, String prenom, int age, int date, int nb_unité) {
		super(nom, prenom, age, date);
		this.nb_unité = nb_unité;
	}
	public void calculer() {
		salaire=this.nb_unité*5+prime;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "EmployeVente [salaire=" + salaire + "]";
	}
	
}
