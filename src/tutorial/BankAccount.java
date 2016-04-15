package tutorial;

public class BankAccount {

	protected String number;
	protected String name;
	protected double balance;
	
	public BankAccount(String name,String number){
		this.number = number;
		this.name = name;
		this.balance = 0;
	}
	
	public BankAccount(String name,String number,double balance){
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(double amount){
		
		this.balance = this.balance - amount;
		return true;
		
	}
	
	public double checkBalance(){
		return this.balance;
	}
	
	public void payIn(double amount){
		
	}
}
