package searchInputPosition;

public class Solution {
	public static int searchInsert(int[] nums, int target) {
		int start = 0, end = nums.length;
		while(start < end) {
			int center = start + (end - start) / 2; //start <= center, center < high
			if(nums[center] >= target)				//end always decreases
				end = center;						//low always increases
			else 
				start = center + 1;
		}
		return start;
	}

	public static void main(String[] argz) {
		int n[] = {1,3,5,6};	
		System.out.println(searchInsert(n, 2));
	}
}
