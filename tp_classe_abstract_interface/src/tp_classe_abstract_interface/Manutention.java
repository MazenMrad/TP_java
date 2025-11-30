package tp_classe_abstract_interface;

public class Manutention extends Employe{
int nb_heure;

public Manutention(String nom, String prenom, int age, int date, int nb_heure) {
	super(nom, prenom, age, date);
	this.nb_heure = nb_heure;
}
public void calculer() {
	salaire=this.nb_heure*65;
	System.out.println(toString());
}
@Override
public String toString() {
	return "EmployeVente [salaire=" + salaire + "]";
}

}
