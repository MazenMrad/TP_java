package ex2;

public class Banque {


	public static void main(String[] args) {
		Compte co1=new Compte();
		Compte co2=new Compte();
		Compte co3=new Compte();
		Compte[] tab=new Compte[3];

		co1.deposer(1200);
		co2.deposer(500);
		co2.transferer(700, co1);
		co1.affiche();
		co2.affiche();
		tab[0]=co1;
		tab[1]=co2;
		tab[2]=co3;
		for (int i=0;i<3;i++) {
			System.out.print(tab[i]);
		}
	}

}
