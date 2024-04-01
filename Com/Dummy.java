package Com;

import java.util.Arrays;

public class Dummy {
	
	  
	
	/*public static void main(String[] args) {
		int s1=0;
		int[] slower = {1,1,2,2,5,5,6,4,1,2,1,2,9,1};
		for(int i =0; i<slower.length;i++){
			
			if(slower[i]!= slower[s1]){
				
				s1++;
				
				slower[s1]= slower[i];
			}
		}
		int jump = slower.length;
		for(int i=0;i<jump;i++){
			System.out.println(s1);
		}

	}*/
	
	
	public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int slowPointer = 0;
        for (int fastPointer = 1; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != nums[slowPointer]) {
                slowPointer++;
                nums[slowPointer] = nums[fastPointer];
            }
        }
        
        return slowPointer + 1;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newSize = removeDuplicates(nums);
        System.out.println("New size of array after removing duplicates: " + newSize);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
    }

	
	
}
