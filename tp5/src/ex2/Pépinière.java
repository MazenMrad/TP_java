package ex2;

public class Pépinière {
Plante[] inventaire;
final int MAX_PLANTES=1000;
static int nombreDePlantes;
int nb_plante_actuel=0;
	public Pépinière() {
		this.nombreDePlantes=0;
		this.inventaire=new Plante[MAX_PLANTES];
	}
	public void ajoutPlante(Plante plante) {
        if (nombreDePlantes < MAX_PLANTES) {
        	System.out.println("A");
            inventaire[nombreDePlantes] = plante;
            nombreDePlantes++;
            nb_plante_actuel=nombreDePlantes;
        }
          else {
            	System.out.println("Erreur");
            }	
	}
	public void afficherinventaire() {
		for (Plante p:inventaire){
			if (p!=null) {
			if (p instanceof Arbre) {
				
				p.description();
			}
			else if(p instanceof Fleur){
				p.description();
			}
			else {
				System.out.println("Erreur");
			}
			}
			
			
		}

	}
	public double totalAbsorptionTotaleCO2(){
		int som=0;
		for (Plante p:inventaire){
			if (p instanceof Arbre) {
				som+=((Arbre) p).absormoyenne();
			}
	}
		return som;
	}
	public int compterArbresCaduques() {
		int nb=0;
		for (Plante p:inventaire){
			if (p!=null) {
				if (p instanceof Arbre) {
					if (((Arbre) p).type_feuillage=="Caduque"){
						nb++;
					}
			}

				
			
		}
		}
		return nb;
	}
}

