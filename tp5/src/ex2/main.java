package ex2;

public class main {


public static void main(String[] args) { 
	System.out.println("Pépinière GREEN HANDS");
	Pépinière pépinière = new Pépinière();
	Fleur rose = new Fleur(null, 30, 12, 15.99, "Rouge", 2);
	Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99, "Jaune", 4);
	Arbre sapin = new Arbre("Sapin", 158, 30, 59.99, "Persistant");
	Arbre chene= new Arbre("Chene",200,60,89.99,"Caduque");
	rose.setNom("Rose");
	System.out.println("la "+rose.getNom()+" a le couleur "+rose.getCouleur());
	pépinière.ajoutPlante(rose);
	pépinière.ajoutPlante(tulipe);
	pépinière.ajoutPlante(chene);
	pépinière.ajoutPlante(sapin);
	pépinière.afficherinventaire();
	System.out.println("Total Aborption CO2"+ pépinière.totalAbsorptionTotaleCO2());
	System.out.println("Nombre d'arbres Caduques dans la pépinière : " + pépinière.compterArbresCaduques());
}
}
