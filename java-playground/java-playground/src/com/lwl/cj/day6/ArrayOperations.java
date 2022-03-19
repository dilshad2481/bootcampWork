package com.lwl.cj.day6;

import java.time.chrono.JapaneseChronology;
import java.util.Arrays;

public class ArrayOperations {
	public static void main(String[] args) {
		//int[][] n = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		// System.out.println(sumOfElements(n));
		// System.out.println(n.length);
		// System.out.println(sumOfEachRow(n)[0]);
		// System.out.println(19+1+" " + 5);
//		if(true)
//			System.out.println("I");
//		else if(false)
//			System.out.println("AM");
//		if(1>0)
//			System.out.println("A BOY");
//		else
//			System.out.println("A GIRL");
//		for (int i = 1; i <= 3; i++) {
//			System.out.print(i + " ");
//		}
//		int[][] test = {{1,2,3},{4,5,6},{5,3,1}};
//		System.out.println(maxSumRow(test));
//		int count = 0;
//		for(int i = 1;i<=3;i++) {
//			for(int j = 1;j <=i;j++) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		/*
		 * for(int i = 1,j = 2;i <= 2;i++,j--) { System.out.print(i+ " " + j--); }
		 *
		 */
//		int n = 10,i,j;
//		for(i = 1;i <=n;i++) {
//			int count = 0;
//			for(j = 1;j <= i;j++) {
//				if(i%j == 0) {
//					count++;
//				}
//			}
//			if(count == 2)
//				if(i%2 != 0)
//					System.out.print(i + " ");
//		}
//		int i = 0,j = 1;
//		System.out.print(i + " " + j);
//		for(int k = 1;k <=3;k++) {
//			int sum = i + j;
//			System.out.print(" " + sum);
//			i = j;
//			j = sum;
//		}
//		int k = 1;
//		for(int i = 1;i < 3;i++) {
//			for(int j = 1;j <=3;j++) {
//				System.out.print(k ++ + " ");
//			}
//		}
//		for(int i = 1;i <=2;i++) {
//			for(int j = 1;j <= 5;j++) {
//				if(i%2 == 0 && j%2 == 0) {
//					System.out.print(i+ " " + j + " ");
//				}
//			}
//		}
//		int i,j,k,l,count = 0;
//		for(i = 1;i <=3;i++) {
//			count++;
//			for(j = 1; j<=3-i;j++) 
//				count++;
//			for(k=1;k<=i;k++) {
//				count++;
//			    break;
//			}
//			for(l=k-2;l >= 1;l--) 
//				count++;
//		}
//		System.out.println(count);
		
//		int a = 10, b = 20;
//		if ( a < b){
//			System.out.print(a + " ");
//		System.out.print(b + " ");
//		}
//		boolean a,b = false;
//		if(a = !(4==5) && (b =true)) {
//			System.out.println(a + " ");
//		}
//		if(a = true && b) {
//			System.out.println(a);
//		}
//		int sum = 0;
//		for(int i = 1;i <= 20;i++) {
//			if(i%4 != 0) 
//				continue;
//			sum += i;
//					
//		}
//		System.out.println(sum);
//		boolean a = false, b = false, c = true;
//		if(a & (b=true) &(c = false))
//			System.out.println(a + " " + b + " " + c);
//		boolean a = false, b = false, c = true;
//		if(a && (b = true) && (c = false));
//		System.out.println(a + " " + b + " " + c);
//		int a = 20, b = 30, c = 50;
//		if(a < b && a < b)
//			System.out.println(a);
//		else if(b < c)
//			System.out.println(b);
//		else
//			System.out.println(c);
//		for(int i = 1, j = 5;i <= 4;i++,j--) {
//			if(i % j == 0)
//				System.out.println(i + " " + j + " ");
//		}
//		for(int i = 0;i < 2;i++) {
//			for(int j = 2;j >= 0;j--) {
//				if(i == j)
//					break;
//				System.out.print(i + " " + j + " ");
//			}
//		}
//		int num1 = 10, num2 = 30, num3 = 40;
//		int big = (num1 > num2 && num1 > num3)?num1:(num2 > num3)? num2:num3; 
//		System.out.println(big);
//		int count = 0;
//		for(int i = 0;i < 5;i++) {
//			for(int j = 2; j >=0;j--,count++) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
//		int n = 10;
//		int[] list = new int[n/2];
//		int[] result = null;
//		
//		for(int i = 2;i< n/2; i++) {
//			list[i] = i;
//		}
//		System.out.println(Arrays.toString(list));
		//System.out.println(countOfVowels("apple"));
		
//		int i = 1,sum = 0;
//		while(true) {
//			sum+= i;
//			if (sum > 14)
//				break;
//			if(i == 5)
//				break;
//			i = sum + sum;			
//		}
//		System.out.println("Sum is: " + sum);
		
//		int i =0,j = 10;
//		while(i < j - i) {
//			i++;
//			--j;
//			//System.out.println(i+ "," + j);
//		}
//		System.out.println(i+ "," + j);
		
//		int i = 0, j=10;
//		do {
//			i++;
//			--j;
//		}while(i < 5);
//		System.out.println(i + ", " + j);
//		int num = 9845;
//		while(num > 9) {
//			int sum = num % 10 + num / 10;
//			num = sum;
//		}
//		System.out.println(num);
		
//		int i = 1, sum = 0;
//		while(i < 10) {
//			int j = 1;
//			int count = 0;
//			while(j <= i) {
//				if(i % j == 0) {
//					count++;
//				}
//				j++;
//			}
//			if(count == 2) {
//				if(i % 2 != 0)
//					sum += i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
//		int i = 2, sum = 0;
//		while(true) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//			i++;
//			if (sum > 9)
//				break;
//		}
//		System.out.println(sum);
		
//		int count = 0,i = 1;
//		do {
//			count++;
//			i++;
//		}while(i < 10);
//		System.out.println(count);
//		int i = 3;
//		while(2<3) {
//			if(i < 2)
//				break;
//			System.out.println(i-- + " ");
//		}
		
//		int i = 3;
//		do {
//			if (i < 2)
//				break;
//			System.out.print(i-- + " ");
//		} while(2 < 3);
		
		//String data = "Hi welcome to Banglore";
		//System.out.print(data.substring(2,10).trim().length());
		//System.out.print(data.substring(2,10).trim().substring(3));
		
		StringBuffer sb1 = new StringBuffer("Welcome");
		String sb2 = "Welcome";
		if(sb1.toString().equals(sb2)) {
			System.out.println("Both are equal ");
		}else {
			System.out.println("Both are ");
		}
	}
	public static int countOfVowels(String str) {
		char[] vowels = {'a','e','i','o','u'};
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			for(int j = 0;j < vowels.length;j++) {
				if(vowels[j] == (str.toLowerCase().charAt(i))) {
					count++;
				}
			}
		}
		//System.out.println(str + " " + count);
		return count;
	}
//	public static int maxSumRow(int[][] arr) {
//		int i = 0;
//		int[] temp = new int[arr.length];
//		int max = 0;
//		for (i = 0; i < arr.length; i++) {
//			int s = 0;
//			for (int j = 0; j < arr[i].length; j++) {
//				s = s + arr[i][j];
//			}
//			temp[i] = s;
//		}
//		for(i = 0;i < temp.length;i++) {
//			
//			if(max < temp[i]) {
//				max = temp[i];
//			}
//		}
//		return max;
//	}
	
	
	public int[] maxSumRow(int[][] arr) {
		int[] max = arr[0];
		for (int[] subarr :arr) {
		int tmp = sumOfElement(subarr);
		max = (tmp>sumOfElement(max))?subarr:max;
		}
		return max;
		}

	public static int[] sumOfEachRow(int[][] arr) {
		int[] sum = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];

			}
		}

		return sum;
	}

	
	public int sumOfElement(int[] arr) {
		int rs = 0;
		for (int ele : arr) {
		rs += ele;
		}
		return rs;
		}
	public static int sumOfElements(int[][] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i].length);
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static boolean subSet(int[] arr, int[] sub) {
		for (int i = 0; i < sub.length; i++) {
			if (!searchElement(arr, sub[i])) {
				return false;
			}
		}
		return true;
	}

	public static int occuranceOfKey(int[] arr, int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				count++;
			}
		}
		return count;
	}

	public static boolean searchElement(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;

	}
}
