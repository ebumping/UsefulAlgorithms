package happyNumber;

class Solution {
    public static boolean isHappy(int n) {
    	int sum = 0;
    	if (n == 1 || n == 7) {
    		return true;
    	}
        if (n >= 2 && n <= 9) {
        	return false;
        }
        while (n != 0) {
        	int r = n % 10;
        	sum += r*r;
        	n /= 10;
        }
        return isHappy(sum);
    }
}
