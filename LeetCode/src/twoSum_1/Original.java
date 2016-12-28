package twoSum_1;

public class Original {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		boolean flag = false;
		
		//O(n^2) solution to traverse the array
		for (int i = 0; i < nums.length; i++) {
			int val1 = nums[i];
			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;
				if (nums[j] + val1 == target) {
					if (j <= i) {
						result[0] = j;
						result[1] = i;
					} else {
						result[0] = i;
						result[1] = j;
					}
					flag = true;
					break;
				}
			}
			//use flag to jump out from the nested for-loop
			if (flag)
				break;
		}
		return result;
	}
}
