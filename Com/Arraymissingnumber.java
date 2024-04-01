package Com;

public class Arraymissingnumber {

	
	public static void main(String[] args) {
		
		
		int[] a={5,6,8,9};
		
		int sum1=0;
		int sum2 =0;
		
		
		for(int i=5;i<=9;i++){
			 sum1=sum1+i;
			//System.out.println(i);
	
		}
		//System.out.println(sum1);
	
		
		for(int i=0; i< a.length;i++){
			sum2=sum2+a[i];
			
		}
		
	int sum3 =sum1-sum2;
	System.out.println(sum3);
	}
}
    