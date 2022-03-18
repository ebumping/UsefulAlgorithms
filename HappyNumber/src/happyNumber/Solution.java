package happyNumber;

class Solution {
    public static boolean isHappy(int n) {
    	int sum = 0;
    	int x = n;
    	
    	while(n!=0) {
    		int r = n % 10;
    		r = r * r;
    		sum += r;
    	}
    	if(sum == 1 || x == 7 || x == 1) {
    		return true;
    	}else if(sum == x*x && sum != 1)
    		return false;
    	else
		return isHappy(sum);
        
    }
    
    public static void main(String[] argz) {
    	isHappy(1359);
    }
}
