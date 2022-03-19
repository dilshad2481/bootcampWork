package com.lwl.cj.basics;

import java.util.Arrays;

public class ArraysPrograms {

	// Find max element of given array
	public int maxElement(int[] arr) {
		int max = arr[0];
		for (int ele : arr) {
			if (max < ele) {
				max = ele;
			}
		}
		return max;
	}

	// Find sum of all the elements
	public long sumOfElement(int[] arr) {
		long sum = 0;
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}

	// If key is present in the array it should return true otherwise false
	public boolean search(int[] arr, int key) {
		boolean found = false;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == key) {
				found = true;
			}
		}
		return found;
	}

	// Sort array elements in given direction ( asc, desc )
	public int[] sort(int[] arr, String order) {
		int temp;
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		return arr;
	}

	// Generated prime store in array and return
	public int[] generateNPrimeNumbers(int n) {
		FundamentalPrograms_3 programs_3 = new FundamentalPrograms_3();
		int count = 0;
		int[] preResult = new int[n];
		int[] result= null;
		for(int i = 0;i < n; i++){
			if(programs_3.isPrime(i)) {
				preResult[i] = i;
				count++;
			}
			
		}
		result = new int[count];
		for(int i = 0,j = 0;i < preResult.length;i++){
			if(preResult[i] != 0) {
				result[j] = preResult[i];
				j++;
			}
		}
		
		//System.out.println(Arrays.toString(result));
		return result;
	}

	// Check subArr is subset of masterArr
	public boolean isSubSet(int[] masterArr, int[] subArr) {
		for(int i = 0;i < subArr.length; i++) {
			if(!search(masterArr, subArr[i])) {
				return false;
			}
		}
		return true;
	}

	// Return max sum row in the 2d array
	public int[] maxSumRow(int[][] arr) {
		int sum = 0;
		int[] max = arr[0];
		for(int i = 0;i < arr.length;i++){
			sum = (int)sumOfElement(arr[i]);
			if((int)sumOfElement(max) < sum) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
