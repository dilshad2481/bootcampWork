package com.lwl.cj.basics.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lwl.cj.basics.FundamentalPrograms_3;

class FundamentalPrograms_3_Test {

	@Test
	void reverseOfNumberTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(54321, obj.reverseOfNumber(12345), "You must reverse the numbers");
		assertEquals(121, obj.reverseOfNumber(121));
		assertEquals(0, obj.reverseOfNumber(0));
		assertEquals(1, obj.reverseOfNumber(1));
		assertEquals(1, obj.reverseOfNumber(10));
	}

	@Test
	void sumOfDigitsTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(15, obj.sumOfDigits(12345), "You must find sum of digits");
		assertEquals(1, obj.sumOfDigits(100));
		assertEquals(2, obj.sumOfDigits(10010));
		assertEquals(10, obj.sumOfDigits(70102));
	}

	@Test
	void isPrimeTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(true, obj.isPrime(2), "You must check the number is prime or not");
		assertEquals(true, obj.isPrime(3));
		assertEquals(false, obj.isPrime(4));
		assertEquals(false, obj.isPrime(0));
		assertEquals(false, obj.isPrime(22));
		assertEquals(true, obj.isPrime(11));
	}

	@Test
	void nthFibonacciNumberTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(55, obj.nthFibonacciNumber(10), "You must find nth fibonacci number");
		assertEquals(34, obj.nthFibonacciNumber(9), "You must find nth fibonacci number");
		assertEquals(0, obj.nthFibonacciNumber(0), "You must find nth fibonacci number");
		assertEquals(1, obj.nthFibonacciNumber(1), "You must find nth fibonacci number");
		
	}

	@Test
	void isPalindromeTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(true, obj.isPalindrome(12321), "You must reverse the numbers");
		assertEquals(true, obj.isPalindrome(4554));
		assertEquals(false, obj.isPalindrome(1213));
		assertEquals(false, obj.isPalindrome(7485));
	}

	@Test
	void countPrimesTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertEquals(4, obj.countPrimes(1, 10), "You must find no(count) of prime number between lower bound and upper bound");
		assertEquals(4, obj.countPrimes(10, 20), "You must find no(count) of prime number between lower bound and upper bound");
		assertEquals(0, obj.countPrimes(20, 10), "You must find no(count) of prime number between lower bound and upper bound");
	}

}
