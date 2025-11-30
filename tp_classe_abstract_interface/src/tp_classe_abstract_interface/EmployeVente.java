package tp_classe_abstract_interface;

public class EmployeVente extends Employe{
	double chiffre_affaire;

	public EmployeVente(String nom, String prenom, int age, int date, double chiffre_affaire) {
		super(nom, prenom, age, date);
		this.chiffre_affaire = chiffre_affaire;
	}
	public void calculer() {
		salaire=0.2*this.chiffre_affaire+400;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "EmployeVente [salaire=" + salaire + "]";
	}
	
}
