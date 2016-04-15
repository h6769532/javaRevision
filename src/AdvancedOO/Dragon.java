package AdvancedOO;

public class Dragon extends Monster {
	
	public Dragon(String name) {
		super(name, "Dragon");
		// TODO Auto-generated constructor stub
	}
	
	public Dragon(String name, double spAttackProbability) {
		super(name, "Dragon");
		super.spAttackProbability = spAttackProbability;
	}

	public int specialAttack(){
		return (int)Math.random()*50+1;
	}
}
