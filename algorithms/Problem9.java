//Problem 9 - Palindrome Number

public class Problem9 {
	
	public static void main(String[] args){
		long start = System.nanoTime();

		Solution sol = new Solution();
		System.out.println(sol.isPalindrome(121));
		System.out.println(sol.isPalindrome(-121));
		System.out.println(sol.isPalindrome(10));
		System.out.println(sol.isPalindrome(0));
		System.out.println(sol.isPalindrome(5001005));
		
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
	}
}

class Solution {
	//with String
	/*	
	public boolean isPalindrome(int x){
		String strX = String.valueOf(x);
		
		for (int i = 0; i < strX.length()/2; i++){
			if (strX.charAt(i) != strX.charAt(strX.length()-i-1)) 
				return false;
		}
		return true;		
	}
	*/

	//with no String	
	public boolean isPalindrome(int x){
		if (x < 0 || (x != 0 && x%10==0)) return false;
		int revertedNumber = 0;
		while (x > revertedNumber){
			revertedNumber = revertedNumber*10 + x%10;
			x /= 10;
		}	
		return x == revertedNumber || x == revertedNumber/10;	
	}
	
}

