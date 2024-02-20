package Com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	
	 
	
	
	public static void main(String[] args) {
		
		

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(42);
		a.add(15);
		a.add(52);
		a.add(15);
		
		Scanner sc = new Scanner(System.in);
	     int i = sc.nextInt();

		
		System.out.println("Enter the number"+i);
		
		
		 int m =a.get(i);
		 System.out.println(m);
		
		
		
	}
	
		
			

}
