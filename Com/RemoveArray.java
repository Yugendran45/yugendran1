package Com;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveArray {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5,1,6,5 };

		ArrayList<Integer> ar = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (!ar.contains(nums[i])) {
				ar.add(nums[i]);
			}

		}
		System.out.println(ar);

	}

}
