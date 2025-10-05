package ex3;
import java.util.Scanner;
public class TestMaDate {

	public static void main(String[] args) {
		MaDate date=new MaDate(3,5,2025);
		MaDate date2=new MaDate(3,5,2024);
		MaDate date3=new MaDate(2023);
		date3.setJours(2);
		date3.setMois(7);
		System.out.println(date);
		System.out.println(date2);
		System.out.println(date3);
		if (date.getJours()==date2.getJours() && date.getMois()==date2.getMois() && date.getAnnee()== date2.getAnnee() ) {
			System.out.println("Les deux dates sont identiques");
			
		}
		else {
			System.out.println("Les deux dates ne sont pas identiques");
		}
		Scanner Scanner = new Scanner(System.in);
        	
        int choix;
        System.out.println("\n======");
		System.out.println("date: "+date);
		System.out.println("1 ajout d’un jour");
		System.out.println("2 ajout de plusieurs jours");
		System.out.println("3 ajout d’un mois");
		System.out.println("4 ajout d’une année");
		System.out.println("\n======");
            choix = Scanner.nextInt();
         switch (choix) {
         case 1:
             date.ajouterUnjour();
             break;
         case 2:
        	 System.out.println("saisir le nombre de jours ajouteé");
        	 int n = Scanner.nextInt();
             if (n>0){
            	 date.ajouterPlusiersJours(n);
             }
             else {
            	 System.out.println("error");
             }
             break;
         case 3:
        	 date.ajouterunmois();
        	 break;
         case 4:
        	 date.ajouterunannee();
        	 break;
        	 
}
         Scanner.close();
         System.out.println("nouvelle date: " + date);
	}
}