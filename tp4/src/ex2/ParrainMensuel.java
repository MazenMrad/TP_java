package ex2;

public class ParrainMensuel extends Parrain{
	double virementMensuel;
	public ParrainMensuel(String nom,String prenom,int age,double virementMensuel) {
		super(nom,prenom,age);
		this.virementMensuel=virementMensuel;
	}
	public double calculerVirementTotal(double virementMensuel) {
		return this.virementMensuel*super.getNombreEnfantsParraines();
	}	
	public void afficherinfos() {
		super.afficherinfos();
		System.out.println(calculerVirementTotal(this.virementMensuel));
	}
	public double getVirementMensuel() {
		return virementMensuel;
	}
}
