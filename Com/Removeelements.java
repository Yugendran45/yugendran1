package Com;

import java.util.Arrays;

public class Removeelements {
	
	public static void main(String[] args) {
		int[] a ={3,2,2,3};
		int val=3;
		
		int[] b = new int[4];
		
		
		for(int i=0;i< a.length;i++){
					if(a[i] != val  ){
					b[i]=a[i];
					
				}
					
				if(b[i]!= 0 && b[i]!= b[i]
						
						
						){
					System.out.println(a[i]);
				}
			
					
		}
		
		System.out.println(Arrays.toString(b));
	}

}
