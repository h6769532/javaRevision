package StringAndMath;

public class ParityBitAdder{
	
	private int ones, zeros;
	private String output;
	
	public ParityBitAdder(String input, int control) throws InvalidControlException, 
		InvalidInputLengthException, InvalidInputCharacterException{
		
		this.ones = 0;
		this.zeros = 0;
		
		if(input.length()!=7)
			throw new InvalidInputLengthException();
		for(int i=0;i<input.length();i++){
			if(input.charAt(i) != '1' && input.charAt(i) != '0'){
				System.out.println(i +"th character error");
				throw new InvalidInputCharacterException();
			}
				
		}
		
		this.output = input;
		this.countBinary(input);
		
		if (control == 0)
			System.out.println("Even parity: "+input +" --> "+this.evenParity());
		else if(control == 1)
			System.out.println("Odd parity: "+input +" --> "+this.oddParity());
		else throw new InvalidControlException();
	}
	
	public String evenParity(){
		if(ones%2 == 1)
			output = "1" + output;
		else output = "0" + output;
		
		return output;
	}
	
	public String oddParity(){
		if(ones%2 == 0)
			output = "1" + output;
		else output = "0" + output;
		
		return output;
	}
	
	public void countBinary(String input){
		
		for(int i=0;i<input.length();i++){
			if(input.charAt(i) == '0')
				zeros++;
			else ones++;
		}
	}
	
	public class InvalidControlException extends Exception{
		public InvalidControlException(){
			System.err.println("Invalid Control Number!");
		}
	}
	
	public class InvalidInputLengthException extends Exception{
		public InvalidInputLengthException(){
			System.err.println("Invalid Input Length!");
		}
	}
	
	public class InvalidInputCharacterException extends Exception{
		public InvalidInputCharacterException(){
			System.err.println("Invalid Input Charater!");
		}
	}

}


