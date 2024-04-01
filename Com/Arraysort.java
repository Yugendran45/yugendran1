package Com;

import java.util.Arrays;

public class Arraysort {
	
	public static void main(String[] args) {
		
			int num1[] ={1,2,3,0,0};
			int n1=num1.length;
			int num2[] ={2,5,6};
			int n2=num2.length;
					
			int c1=n1+n2;
			
			
			 
			
			int[] c = new int[c1];
			
			
			
		
			for(int i=0;i < n1;i++){
				c[i]=num1[i];
			}
			for(int i=0;i < n2; i++){
			    c[n1+i]=num2[i];
	        }
           
			
			
           Arrays.sort(c);
  
	 System.out.println(Arrays.toString(c));
            
            
	}
			 
			
			
		
			
}
