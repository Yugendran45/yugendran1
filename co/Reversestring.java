package Com;

public class Reversestring {

	
	public String paraman(String input) {
		
	   String str="";
		for(int i=input.length()-1; i>=0; i--){
		   char am =input.charAt(i);
		   str = str+am;
		}
		if(str.equals(input))
			System.out.println("it s palindraome");
		else{
			System.out.println("Not palindrome ");
		}
		return str;
	}

  public static void main(String[] args) {
	  Reversestring rs = new Reversestring();
	  String chan = rs.paraman("madam");
	  System.out.println(chan);
	 
}

}
