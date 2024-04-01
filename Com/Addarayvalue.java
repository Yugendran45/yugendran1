package Com;

import java.util.Arrays;

public class Addarayvalue {
	
	public static void main(String[] args) {
		
		int a[]={10,20,30,40};
		int l=a.length;
		int b[]= new int[l+1];
		
		for(int i=0; i<a.length; i++){
			b[i]=a[i];
			
		}		
		System.out.println(Arrays.toString(b));
		
		b[l] = 50;
		
		System.out.println(Arrays.toString(b));
		
		
	}

}
