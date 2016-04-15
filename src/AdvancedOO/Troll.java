package AdvancedOO;

public class Troll extends Monster{
	
	public Troll(String name) {
		super(name, "Troll");
		if(name.equals("Saul")||name.equals("Salomon"))
			super.name = "Detritus";
	}
	
	public Troll(String name, double spAttackProbability) {
		super(name, "Troll");
		if(name.equals("Saul")||name.equals("Salomon"))
			super.name = "Detritus";
		super.spAttackProbability = spAttackProbability;
	}
	
	public int specialAttack(){
		return (int)Math.random()*15+1;
	}
}
