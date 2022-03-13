package romanToInteger;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
    	char[] romanChar = s.toCharArray();
    	int size = romanChar.length;
        int sumRN = 0, highestDigit = 1;
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for(int i = size - 1; i >= 0; i--){
            int value = map.get(romanChar[i]);
            if(value < highestDigit) {
            	sumRN = sumRN - value;
            }else {
            	sumRN = sumRN + value;
            		highestDigit = value;
            }
        	
        }
		return sumRN;
    }
}
