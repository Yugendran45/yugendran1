package Com;

public class Separatetolowercaseanduppercase {
	
	public static void main(String[] args) {
		String s = "WeLcome to all tO My LaYout tret565767";
		
		
		String lowercase ="";
		String uppercase ="";
		String number ="";
		
		for(int i=0; i < s.length();i++){
			char c =s.charAt(i);
			
			if(Character.isUpperCase(c)){
				
				lowercase +=c;
			}else if(Character.isLowerCase(c)){
				uppercase +=c;
			}else if(Character.isDigit(c)){
				number +=c;
			}
			}
		
		System.out.println(lowercase);
		System.out.println(uppercase);
		System.out.println(number);
	}
	

}
