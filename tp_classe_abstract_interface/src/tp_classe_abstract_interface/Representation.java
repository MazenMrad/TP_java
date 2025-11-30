package tp_classe_abstract_interface;

public class Representation extends Employe{
	double chiffre_affaire;
	public Representation(String nom, String prenom, int age, int date, double chiffre_affaire) {
		super(nom, prenom, age, date);
		this.chiffre_affaire = chiffre_affaire;
	}
	public void calculer() {
		salaire=0.2*this.chiffre_affaire+800;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "EmployeVente [salaire=" + salaire + "]";
	}
	
}


