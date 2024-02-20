package Com;

import java.util.Arrays;

public class Maxandminimunvalue {
	
	public static void main(String[] args) {
		int[] arr=
				{32,45,23,453,54,54,64,4,54};
		
		Arrays.sort(arr);
		
	  System.out.println("max number of"+arr[0]);
	  System.out.println("min number of"+arr[arr.length-1]);
	  
		
	}

}
