package de.unistuttgart.dsass2022.ex02.p4;
 

public class Complexity {
	
	
	/**
	 * 
	 * @param n positive integer n
	 * @return some new number based on n
	 */
	public static int couldBeBetter1(int n) {
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result += 2;
		}
		return result;
	}
	
	
	/**
	 * 
	 * @param n positive integer n
	 * @return some new number based on n
	 */
	public static int couldBeBetter2(int n) {
		int temp = 1;
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = 0;
			for (int j = 1; j <= i; j++) {
				result += temp;
			}
			temp = result;
		}
		return result;
	}
	
	/**
	 * 
	 * @param n positive integer
	 * @return some new number based on n
	 */
	public static int couldBeBetter3(int n) {
		
		if (n < 0) throw new IllegalArgumentException("n has to be positive!");
		else if (n <= 1) return 1;
		else return couldBeBetter3(n-1)+ couldBeBetter3(n-2);
	}
	
	
	/**
	 * 
	 * @param n positive integer
	 * @return same number as couldBeBetter1, but faster
	 */
	public static int isDoneBetter1(int n) {
		return 2 * n + 2;
	}
	
	
	/**
	 * 
	 * @param n positive integer
	 * @return same number as couldBeBetter1, but faster
	 */
	public static int isDoneBetter2(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;

	}

	
	/**
	 * 
	 * @param n positive integer
	 * @return same number as couldBeBetter1, but faster
	 */
	public static int isDoneBetter3(int n) {
		int last = 1;
		int secondLast = 0;
		int result = 1;
		for (int i = 0; i < n; i++) {
			result = last + secondLast;
			secondLast = last;
			last = result;
		}
		return result;
	}

}
