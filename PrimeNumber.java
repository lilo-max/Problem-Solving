package org.me.learning;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(isPrime(45));
		
	}
	//Always remember that the first prime number is 2

		public static boolean isPrime(int n) {
			if (n<=1) {
				return false;
			}
			
			for (int i=2; i<n; i++) {
				
			if (n%i==0) {
				
				return false;
			}
		}
		return true;
	}

}
