package containsDuplicate;

import java.util.HashSet;

public class Solution {
	public boolean containsDuplicate(int[] nums) {
		if(nums == null) {
			throw new IllegalArgumentException("Input is null");
		}
		if(nums.length <= 1) {
			return false;
		}
		
		HashSet<Integer> found = new HashSet<>();
		for(int i : nums) {
			if(!found.add(i)) {
				return true;
			}
		}
		
		return false;
	}
}
