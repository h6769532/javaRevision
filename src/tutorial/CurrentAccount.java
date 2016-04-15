package tutorial;

public class CurrentAccount extends BankAccount{
	
	private double overdraft_limit;
	
	public CurrentAccount(String name, String number) {
		super(name, number);
		// TODO Auto-generated constructor stub
	}
	
	public CurrentAccount(String name,String number,double balance){
		super(name,number,balance);
	}
	
	public boolean withdraw(double amount){
		
		return false;
	}
	
	

}
