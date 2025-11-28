package ex1;

import java.util.Arrays;

public class Lotissement implements GestionPropriete{
	protected Propriété [] tabProp;
	protected int nombre=0;
	public Lotissement(Propriété[] tabProp, int nombre) {
		this.tabProp = tabProp;
		this.nombre = nombre;
	}
	public Lotissement(int MAX_PROPRIETES) {
		MAX_PROPRIETES=100;
		tabProp=new Propriété[MAX_PROPRIETES];
	}
	public Propriété getpropriétéByIndex(int i) {
		return tabProp[i];
	}
	int calculglobal() {
		int sum=0;
		for (Propriété p:tabProp) {
			if (p instanceof PropriétéPrivée){
				sum+=((PropriétéPrivée) p).getNbPieces();
			}
		}
		return sum;
	}

	public String toString() {
		return "Lotissement [tabProp=" + Arrays.toString(tabProp) + ", nombre=" + nombre + ", getnbPièce()="
				+ "]";
	}
	public void afficherPropriétés() {
		for (int i=0;i<nombre;i++) {
			if (tabProp[i] instanceof Villa) {
				((Villa )tabProp[i]).afficher();
			}
			else if (tabProp[i] instanceof Appartement) {
				((Appartement )tabProp[i]).afficher();
			}
			else if (tabProp[i] instanceof PropriétéProfessionnelle) {
				((PropriétéProfessionnelle )tabProp[i]).afficher();
			}
			else if (tabProp[i] instanceof PropriétéPrivée) {
				((PropriétéPrivée )tabProp[i]).afficher();
			}
			else {
				System.out.println("qsd");
			}
			
		}
	}
	public void moinimport() {
		double min=0.0;
		int index=-1;
		String nomprop="";
		for (int i=0;i<nombre;i++) {
			if (!(tabProp[i] instanceof PropriétéProfessionnelle)) {
				if (index==-1) {
					min=((PropriétéPrivée)tabProp[i]).calcullimpot();
					index=0;
					nomprop=((PropriétéPrivée) tabProp[i]).responsable.nom;
				}
				else {
				if (min>((PropriétéPrivée)tabProp[i]).calcullimpot()) {
					min=((PropriétéPrivée)tabProp[i]).calcullimpot();
				}
				
			}
			}
			else {
				System.out.println("qsd");
			}
		}
		System.out.println("Le moin impot c'est "+nomprop +min);
	}
	public boolean ajouter(Propriété p){
		if (nombre!=MAX_PROPRIETES) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean supprimer(Propriété p) {
		int index=-1;
		for (int i=0;i<nombre;i++) {
			if (tabProp[i].equals(p)) {
				index=i;
				break;
			}
		}
		if (index==-1) {
				return false;
			}
		for (int j=index;j<nombre-1;j++) {
			tabProp[j]=tabProp[j+1];
		}
		tabProp[nombre-1] = null;
		nombre--;
			return true;
	}
}
