package Com;

import java.util.Scanner;

public class FindLongstring {

	
	public static void main(String[] args) {
		
		/*Scanner s = new Scanner(System.in);*/
		
		
		String  s ="javaasdsa is to hard lang";
		String[] s1=s.split(" ");
		
		String longestword ="";
		int longcount =0;
		
		 for(String m:s1){
			 
			 int len = m.length();
			 
			 if(len > longcount) {
				 
				 longestword = m;
				 longcount = len;
				 
			 }
			 
		 }
		
		 System.out.println(longestword);
		 
	}
}
