package palindromeNumber;

public class Solution {
	
	public static boolean isPalindrome(int x) {
	// If x is a negative number it is not a palindrome
    // If x % 10 = 0, in order for it to be a palindrome the first digit should also be 0
	if (x < 0 || (x != 0 && x % 10 == 0))
		return false;
	int res = 0;
	while (x > res) {
		res = res * 10 + x % 10;
		x = x / 10;
		
	}
	return (x == res || x == res/10);
	}
	
	
	public static void main(String[] args) {
		//System.out.println(isPalindrome(1221));

	}

}
