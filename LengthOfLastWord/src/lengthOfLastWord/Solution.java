package lengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
    	int count = 0;
    	s = s.trim();
    	//System.out.println(!s.contains(" "));
    	if(!s.contains(" ")) {
    		count = s.length();
    		System.out.println(count);
    		return count;
    	}
        for(int i = s.length() - 1; i > 0; i--) {
        	if(s.charAt(i) == ' ') {
        		//System.out.println(s.substring(i, s.length()));
        		count = s.substring(i, s.length()).length() - 1;
        		//System.out.println(count);
        		return count;
        		
        	}
        	
        }
        
        return count;
    }
    
    public static void main(String[] argz) {
    	Solution s = new Solution();
    	//s.lengthOfLastWord("   fly me   to   the moon  ");
    	s.lengthOfLastWord("a");
    }
}
