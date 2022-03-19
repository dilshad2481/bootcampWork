package com.lwl.cj.basics;

import java.util.Arrays;

public class FundamentalPrograms_3 {

	public int reverseOfNumber(int num) {
		// TODO write logic
		int result = 0;		
		while(num > 0) {			
			result += (num % 10);			
			//System.out.println(result);
			num = ((num - (num % 10))/10);
			result *= 10;
		}
		
		return result / 10;
	}

	public int sumOfDigits(int num) {
		// TODO write logic
		int sum = 0;
		String[] stringNum = String.valueOf(num).split("");
		for(int i = 0;i < stringNum.length;i++) {
			sum += Integer.parseInt(stringNum[i]);
		}

		return sum;
	}

	public boolean isPrime(int num) {
		// TODO write logic
		if ((num == 0)|| (num == 1)) {
			return false;
		}
		for(int i = 2;i < num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int nthFibonacciNumber(int n) {
		// TODO write logic
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		}else {
			return nthFibonacciNumber(n - 1) + nthFibonacciNumber(n-2);
		}
		
	}

	public boolean isPalindrome(int num) {		
		return num == reverseOfNumber(num);
	}

	public int countPrimes(int lb, int ub) {
		// TODO write logic
		int count = 0;
		for(int i = lb;i <= ub;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}

}