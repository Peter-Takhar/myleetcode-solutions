//Problem 1 - Two Sum


import java.util.*;

public class Problem1{

	public static void main(String[] args){
		long start = System.nanoTime();
		
		int[] nums = new int[]{3,2,3};
		int target = 6;

		Solution sol = new Solution();
		int[] test = sol.twoSum(nums, target);

		for (int p : test)
			System.out.print(p + " ");

		System.out.println();
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");

	}

}

class Solution{
		//brute force method
		/*
		public int[] twoSum(int[] nums, int target){
			for(int i = 0; i < nums.length-1; i++){
				for (int k = i+1; k < nums.length; k++){
					if (nums[i] + nums[k] == target) 
							return new int[]{i,k};
				}
			}
		throw new IllegalArgumentException("No two sum solution");
		}
		*/

		//hashtable method 
		//we can find target through for the complement of the target,
		//ie. target - one element = another element in the array
		//note: if you add a duplicate element, it will overwrite the 
		//   original with the new value
		public int[] twoSum(int[] nums, int target){
			Map<Integer, Integer> map = new HashMap<>();
			
			for (int i = 0; i < nums.length; i++){
				int complement = target - nums[i];
				if (map.containsKey(complement))
					return new int[]{ map.get(complement), i )};
				map.put(nums[i], i);
			}
			throw new IllegalArgumentException("No two sum solution");

		}
}
