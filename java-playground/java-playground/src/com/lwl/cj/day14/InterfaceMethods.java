package com.lwl.cj.day14;

interface MathService{
	boolean isPrime(int num);
	
	default int[] generatePrime(int n) {
		return null;
	}
	default int countPrimeInRange(int lb, int ub) {
		return 0;
	}
	private static int factorial(int num) {
		return 0;
	}
	private static int sum(int... arr) {
		return 0;
	}
}

class MathServiceImpl implements MathService{

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
public class InterfaceMethods {
	public static void main(String[] args) {
		MathService obj = new MathServiceImpl();
		obj.isPrime(123);
	}
	
	
}
