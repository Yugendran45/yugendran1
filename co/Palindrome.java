package Com;

public class Palindrome {
	
	public  void Palindrome(int num) {
		
		int qu = num ;
		int  temp=qu;
	    int rev=0;
		int rem= 0;
		
		  
		while(qu>0){
			rev=qu%10;
			rem=(rem*10)+rev;
			qu=qu/10;
		}
		System.out.println(rem);
		System.out.println(temp);
		
		 if(rem == temp){
			 System.out.println("its Palindrome");
		 }else{
			 System.out.println("its not palindrome");
		
	}
	
	
		
}

	
public static void main(String[] args) {
	
	Palindrome p = new Palindrome();
	p.Palindrome(189581);
	p.Palindrome(1845);
	

	
}
}