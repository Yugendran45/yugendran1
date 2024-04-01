package Com;

import java.util.Arrays;

public class Addtwonumberinarray {

	
	public static void main(String[] args) {

		int a[] = {9,9,9,9,9,9,9};
		int b[] = {9,9,9,9};
//		int min = (a.length > b.length) ? b.length : a.length; // 7 > 5
		int max = (a.length < b.length) ? b.length : a.length; // 7 < 5
		int[] result = new int[max];
		int carry = 0;
		
		if(a.length > b.length) {
			
			for(int j = (b.length - 1); j < max; j++) {
				b[j] = 0;
			}
			
		} else {
			for(int j = (a.length - 1); j < max; j++) {
				a[j] = 0;
				
				
				
				
				
				
			}
		}
			
	
      
		for (int i = 0; i < max; i++) {
		
 		   	int temp = a[i] + b[i] + carry; // 15 = 10+5+0
 		   	carry = temp /10; // 1
			int bal = temp % 10; // 5
			result[i] = bal;
			
		}
		System.out.println(Arrays.toString(result));
	}

}
