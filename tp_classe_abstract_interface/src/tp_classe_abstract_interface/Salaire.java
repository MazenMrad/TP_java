package tp_classe_abstract_interface;

public class Salaire {

	public static void main(String[] args) {
		Personnel p=new Personnel();
		p.ajouterEmploye(new EmployeVente("Mohamed", "Salah", 45, 1995, 30000.0));
		p.ajouterEmploye(new Representation("Ali", "Ben Ali", 25, 2001, 20000.0));
		p.ajouterEmploye(new Production("Yosri", "Mansour", 28, 1998, 1000));
		p.ajouterEmploye(new Manutention("Jalel", "Tounsi", 32, 1998, 45));
		p.ajouterEmploye(new Production_danger("Jamel", "Fehri", 28, 2000, 1000));
		p.ajouterEmploye(new Manutration_danger("Ali", "Abloulou", 30, 2001, 45));
		p.calculerSalaire();
		System.out.println("Le salaire moyen dans l'entreprise est de " + p.SalaireMoyen() + "francs.\"");
				
		
	}

}
