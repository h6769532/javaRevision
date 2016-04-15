package StringAndMath;

public class StringConverter {
	
	public StringConverter(String str){
		System.out.println("Input: "+str+"\n"+"Output: "+convertString(str));
	}
	
	public String convertString(String str){
		char[] result = new char[str.length()];
		for(int i=0;i<str.length();i++){
			if(this.isLowercaseVowel(str.charAt(i)))
				result[i] = str.charAt(i);
			else if(str.charAt(i) == ' ')
				result[i] = '*';
			else result[i] = Character.toUpperCase((str.charAt(i)));
		}
		return new String(result);
	}
	
	public boolean isLowercaseVowel(char ch){
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return true;
		else return false;
	}
	
	public static void main(String args[]){
		new StringConverter("Any characters that are not letters should be converted to the character");
	}
}
