package com.lwl.cj.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@FunctionalInterface
interface MathService{
	public int perform(int a, int b);
	default boolean isEven(int a) {
		return a % 2 == 0;
	}
	//Can't have any more methods otherwise it won't be
	//functional interface anymore
	
	
	
	//public int isPrime(int num);
}

interface MyPredicate{
	public boolean test(int ele);
}

class ResultService{
	public void showResult(MathService math, int a, int b) {		
		System.out.println(math.perform(a, b));
	}
	public List<Integer> filterData(List<Integer> list, MyPredicate obj) {
		List<Integer> mylist = new ArrayList<Integer>();
		for(Integer i:list) {
			if(obj.test(i)) {
				mylist.add(i);
			}
		}
		return mylist;
	}
}
//class AddNumbers implements MathService{
//	@Override
//	public int perform(int a, int b) {
//		return a + b;
//	}
//}
//
//class MultiplyNumbers implements MathService{
//	@Override
//	public int perform(int a, int b) {
//		return a * b;
//	}
//}
class MathServiceImpl implements MathService{

	@Override
	public int perform(int a, int b) {
		return a + b;
	}
	
	
	
}


public class LambdaExamples {
	public static void main(String[] args) {
//		MathService add = new MathService() {
//
//			@Override
//			public int perform(int a, int b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		};
//		add.perform(1,2);
//		
//		MathService multiply = (a,b) -> a * b;
//		System.out.println(multiply.perform(6, 2));
		
//		1 way to do it
//		MathService adder = new MathServiceImpl();
//		ResultService rs = new ResultService();
//		rs.showResult(adder, 5, 8);
		
//		2nd way to do it
//		MathService adder = new MathService() {			
//			@Override
//			public int perform(int a, int b) {
//				return a + b;
//			}
//		};
//		
//		ResultService obj = new ResultService();
//		obj.showResult(adder, 9, 3);
		
//		3rd way to do it
		/*
		 * MathService adder = (a,b)->a+b;
		 * 
		 * ResultService rs = new ResultService(); rs.showResult(adder, 8, 8);
		 * 
		 * //4th way rs.showResult((a, b)->a*b, 10,20);
		 */
		
		ResultService obj = new ResultService();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i <= 100;i++) {
			int value = ThreadLocalRandom.current().nextInt(100, 999);
			list.add(value);			
		}
		System.out.println(list);
		System.out.println(obj.filterData(list, (a)->a%2 == 0));
		
		
		
	}	
	
	
}
