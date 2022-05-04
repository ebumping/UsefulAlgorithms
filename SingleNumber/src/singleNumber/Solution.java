package singleNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i : nums) {
			if(set.contains(i)) {
				set.remove(i);
				continue;
			}
			set.add(i);
		}
		return set.toArray(new Integer[1])[0];

	}
}
