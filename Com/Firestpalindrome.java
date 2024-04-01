package Com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Firestpalindrome {

	
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("sdhg");
		stringList.add("ads");
		stringList.add("ada");
		stringList.add("madam");
		stringList.add("mam");
		
		int  t = 0;
		
		for(String s2 :stringList){
			
			String rev ="";
			for(int i=s2.length()-1;i>=0;i--){
				
				char c=s2.charAt(i);
				rev = rev + c;
				// System.out.println(rev);	
			}
			
			if(rev.equals(s2)){
				t++;
				if(t==2 || t==3){
					System.out.println(s2);
					
				}
				
				
			}
		
		}
	}
	
}

