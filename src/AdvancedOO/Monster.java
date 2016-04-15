package AdvancedOO;

public abstract class Monster {
	
	protected String name;
	protected String class_type;
	protected double spAttackProbability=0.2;
	
	public Monster(){
		
	}
	
	public Monster(String name){
		this.name = name;
	}
	
	public double getSpAttackProbability() {
		return spAttackProbability;
	}

	public void setSpAttackProbability(double spAttackProbability) {
		this.spAttackProbability = spAttackProbability;
	}

	public Monster(String name, String class_type){
		this.name = name;
		this.class_type = class_type;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClass_type() {
		return class_type;
	}

	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}

	public final int attack(){
		double num = Math.random();
		int damage;
		
		if(num<spAttackProbability)
			damage = this.specialAttack();
		else
			damage = (int)(Math.random()*4+1);
		
		return damage; 
	}
	
	public abstract int specialAttack();
	
	public void move(int direction){
		switch(direction % 3){
		case 0:
			System.out.println(this.name+" is moving 1 step NORTH.");
			break;
		case 1:
			System.out.println(this.name+" is moving 1 step EAST.");
			break;
		case 2:
			System.out.println(this.name+" is moving 1 step SOUTH.");
			break;
		case 3:
			System.out.println(this.name+" is moving 1 step WEST.");
			break;
		}
	}

}
