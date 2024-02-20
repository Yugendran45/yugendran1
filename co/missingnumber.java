package Com;

public class missingnumber {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,6,7};
		
		
		int Sum1=0;		int sum2=0;
		
		
		for(int i=1; i<=7; i++){
			Sum1=Sum1+i;
			
		}
		
		for(int i=0; i<arr.length; i++){
			sum2=sum2+arr[i];
			
		}
		
		int Sum3=Sum1-sum2;
		
		System.out.println(Sum3);
		
		
		
	}

}
