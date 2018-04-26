//Problem 7 - Reverse Integer

public class Problem7{
	
	public static void main(String[] args){
		long start = System.nanoTime();
		
		Solution sol = new Solution();
		System.out.println(sol.reverse(1534236469));
		System.out.println((System.nanoTime() - start)/10000000000.0 + " seconds");
	}
}

class Solution{
	
	public int reverse(int x){	
		int reverse = 0;
		while (x != 0){
			if ( Integer.MAX_VALUE/10 < reverse || 
					 (Integer.MIN_VALUE-x%10) < reverse*10)
				return 0;
			reverse = reverse * 10 + x%10;
			x /= 10;
			
		}
		return reverse;
	}
}
