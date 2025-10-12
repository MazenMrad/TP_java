package ex1;

public class Entier {
	int valeur=0;
	static int valeur1=0;
			
	public static int factoriel(int n) {
		int i=1;
		int fact=1;
		while (i<=n) {
			fact=fact*i;
			i++;
		}
		return fact;
		
	}
	public static int absolue(int n) {
		if (n>0){
			return n;
		}
		else {
			return -n;
		}
	}
	public static void compare(int e1,int e2) {
		if (e1>e2){
			System.out.println(e1+"est supérieure que "+e2);
	}
		else {
			System.out.println(e2+"est supérieure que "+e1);
		}
}
	public static boolean premier(int n) {
		int nbdiv=2;
		int i=2;
		while (nbdiv<=3 && i<n){
			if (n%i==0) {
				nbdiv++;
			}
			else {
				i++;
			}
		}
		return nbdiv==2;
	}
	public void affiche() {
		System.out.println(valeur);
		System.out.println(valeur1);
		
	}
}