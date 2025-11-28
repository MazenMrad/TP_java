package ex1;

public class Fiscalité {

	public static void main(String[] args) {
		
		Personne p1=new Personne(123456,"mazen","mrad");
		Personne p2=new Personne(456,"yasser","gombra");
		Personne p3=new Personne(7896,"mehdi","sahnoun");
		PropriétéPrivée propp1=new PropriétéPrivée(1,p1,"Corniche",350,4);
		Villa vill=new Villa(2,p2,"Dar Chaabane", 400,6,true);
		Appartement apart=new Appartement(3,p2,"Hammamet",1200,8, 3);
		PropriétéProfessionnelle propp2=new PropriétéProfessionnelle(4,p3,"Korba", 1000, 50,true);
		PropriétéProfessionnelle propp3=new PropriétéProfessionnelle(5,p1,"Bir Bouragba",2500, 400, false);
	
		Propriété[] propr1=new Propriété[20];
		Lotissement lot=new Lotissement(propr1, 0);
		lot.ajouter(propp2);
		lot.ajouter(vill);
		lot.ajouter(propp3);
		lot.ajouter(propp1);
		lot.ajouter(apart);
		lot.afficherPropriétés();
		propp1.affiche_nb_piéce();
		System.out.println(propp1.getNbPieces());
		lot.moinimport();
		lot.supprimer(apart);
		lot.afficherPropriétés();
		Lotissement lt= new LotissementPrivé(10);
		lt.ajouter(apart);
		lt.afficherPropriétés();
	}

}
