package Com;

public class Totalfindarray {
	
	public static void main(String[] args) {
		int a[]={12,45,75,75,758,87};
	int a1=	a.length;
	 int total = 0;
	 
	 for(int i=0; i<a.length;i++){
		  total=total+a[i];
	 }
	 
		System.out.println(total/a1);
	}

}
