package java1;

public class o1 {
	private void palindrome(String input) {
		String uppercase="";
		String lowercase="";
		String number ="";
		String specialchar ="";
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				uppercase= uppercase+c;
			}else if (Character.isLowerCase(c)) {
				lowercase=lowercase+c;
			}else if (Character.isDigit(c)) {
				number= number+c;
			}else {
				specialchar=specialchar+c;
			}}
		
			System.out.println("uppercase"+uppercase);
			System.out.println("lowercase"+lowercase);
		//	System.out.println("number"+isDigit);
			System.out.println("specialchar"+number);
		

	}
	public static void main(String[] args) {
	o1 p= new o1();
	p.palindrome("RFFYGF&^^%^%847477kbvhggbh");
	}

}
