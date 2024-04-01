package Com;

public class StringAppendusing {
	
	public static void main(String[] args) {
		String s="word";
		String s1="Chamdfs";
		
		int i=0;
		int j=0;
		
		StringBuilder sb = new StringBuilder();
		
		
		
		while(i<s.length()||j<s1.length()){
			
			if(i< s.length()){
				sb.append(s.charAt(i));
				
			}if(j<s1.length()){
				sb.append(s1.charAt(i));
					
				}
			
		
			  i++;
			  j++;} 
			  
			
		System.out.println(sb);
		
		
		

}

}

