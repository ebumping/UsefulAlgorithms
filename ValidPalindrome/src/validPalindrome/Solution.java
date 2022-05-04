package validPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
    	String cleanS = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    	char[] revS =  new char[cleanS.length()];
    	int j = 0;
    	for(int i = cleanS.length(); i > 0; i--) {
    		 revS[j] += cleanS.charAt(i - 1);
    		 j++;
    	}
    	
    	if(cleanS.equals(new String(revS))) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	
    	s.isPalindrome("sduh");
    	System.out.println(s.isPalindrome("mam"));
    }
    
    
}
