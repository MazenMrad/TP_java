package ex1;

public class Calcul {

	public static void main(String[] args) {
		Entier obj=new Entier();
		System.out.println(obj.factoriel(5));
		System.out.println(obj.absolue(-5));
		obj.compare(5,7);

		Entier.factoriel(5);
		Entier.absolue(-5);
		Entier.compare(5,7);
		
		obj.valeur1++;
		obj.valeur++;
		obj.affiche();
	}
	}


