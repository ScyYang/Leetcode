package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	 public static int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> map = new HashMap<>();
		 for(int i = 0; i < nums.length; i++) {
			 int completion = target - nums[i];
			 if(map.containsKey(nums[i])) {
				 return new int[] {i, map.get(nums[i])};
			 }
			 map.put(completion, i);
		 }
		 throw new IllegalArgumentException("no such two numbers");
	}
}
