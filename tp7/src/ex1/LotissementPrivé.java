package ex1;

public class LotissementPrivé extends Lotissement{
int capacité;

public LotissementPrivé(Propriété[] tabProp, int nombre, int capacité) {
	super(tabProp, nombre);
	this.capacité = capacité;
}
public LotissementPrivé( int capacité) {
	super(capacité);
	this.capacité = capacité;
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


public Propriété getpropriétéByIndex(int i) {
	return tabProp[i];
}
}
