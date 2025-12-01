package ex2;

	class ConditionAge implements ConditionAccess{
	int ageMin;

	public ConditionAge(int ageMin) {
		super();
		this.ageMin = ageMin;
	}
	public boolean accesPossible(Personne p) {
		if (p.age>=this.ageMin) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getAgeMin() {
		return ageMin;
	}
	
}
