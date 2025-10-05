package ex2;

public class TestPoint {
	public static void main (String [] args)
	{
	point p1;
	p1 = new point(3, 5);
	point p2 = new point ("a");
	point p3 = new point ("b", 3,5);
	System.out.println("\n ---------------------\n");
	System.out.println("les points créés sont :");
	p1.affiche ();
	p2.affiche ();
	p3.affiche ();
	System.out.println("-------------------------------------------\n");
	if (p1.coincide(p3)==true){
			System.out.println("Les deux point p1");
	}
		else {
			System.out.println("Les 2 points ne coïncident pas");
		}
	System.out.println("Les 2 points ne coïncident pas");
	
	System.out.println("\n ---------------------------\n");
	System.out.println("translation des point ");
	p1.transhoriz(4);
	p2.transvert(3);
	p3.translation(5,2);
	p1.affiche ();
	p2.affiche ();
	p3.affiche ();
	System.out.println("\n ---------------------------\n");
	System.out.println("modification des attributs	des points \n") ;
			p1.setNom("Test");
			p2.setAbscisse(2);
			p3.setOrdonne(4);
			p1.affiche ();
			p2.affiche ();
			p3.affiche ();
	System.out.println("utilisation des méthodes get");
	String x=p1.getNom();
	int y=p1.getAbscisse();
	int z=p1.getOrdonne();
	System.out.println(" le nom du point p1 est : " +x);
	System.out.println(" son abscisse est : " + y);
	System.out.println(" son ordonnée est : " + z);
			
	}

}