package tp_classe_abstract_interface;

public class Personnel {
	int sum;
	Employe[] Employ=new Employe[20];
	int nbremp=0;
	public void ajouterEmploye(Employe e) {
		Employ[nbremp]=e;
		nbremp++;
	}
	public void calculerSalaire() {
		for (Employe p:Employ) {
			if (p!=null) {
				if (p instanceof EmployeVente) {
					((EmployeVente) p).calculer();
					sum+=p.salaire;
				}
				else if (p instanceof Manutention) {
					((Manutention) p).calculer();
					sum+=p.salaire;
				}
				else if (p instanceof Production){
					((Production) p).calculer();
					sum+=p.salaire;
				}
				else if (p instanceof Representation) {
					((Representation) p).calculer();
					sum+=p.salaire;
				}
				else if (p instanceof Manutration_danger) {
					((Manutration_danger) p).calculer();
					sum+=p.salaire;
				}
				else {
					((Production_danger) p).calculer();
					sum+=p.salaire;
				}
			}
		}
		
	}
	public double SalaireMoyen() {
		return sum/nbremp;
	}
}
