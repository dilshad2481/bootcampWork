package com.lwl.cj.basics;

import java.util.Arrays;

public class StringPrograms {

	
		public boolean isPalindrome(String str) {
			String[] stringNum = String.valueOf(str).split("");
			String[] reverseStringNum = new String[stringNum.length];
			for(int i = (stringNum.length - 1),j = 0;i > -1;i--,j++) {
				reverseStringNum[j] = stringNum[i];
			}
			
			System.out.println(Arrays.toString(stringNum));
			System.out.println(Arrays.toString(reverseStringNum));
			for(int i = 0;i < stringNum.length;i++) {
				if(!stringNum[i].equals(reverseStringNum[i])) {
					return false;
				}
			}
			
			return true;
		}
		
		// ABCD => n = 3 => ["ABC", "BCD"]
		public String[] subStringWithSizeN(String str,int n) {
			String takeOut = "";
			String[] preResult = new String[str.length()];
			String[] result = null;
			int nullCount = 0;
	  		int counter = 0;
			while(str.length() >= n) {
				System.out.println(str.length() +" " +  n + " " + str + " " + counter);
				preResult[counter] = str.substring(0, (n));
				str = str.substring(1);
				
				System.out.println(preResult[counter]);
				counter++;
				
			}
			for(int i = 0;i < preResult.length;i++) {
				if(preResult[i] == null) {
					nullCount++;
				}
			}
			nullCount = preResult.length - nullCount;
			result = new String[nullCount];
			for(int i = 0; i < result.length;i++) {
				result[i] = preResult[i];
			}
				return result;
		}
		
		// ["Rajesh","Manoj","Suresh"] => delimeter = "-"  => Rajesh-Manoj-Suresh
		public String joinStrings(String[] str,String delimeter) {
			String result = "";
			for(int i = 0; i < str.length;i++) {
				result += str[i] + "-";
			}
			
			return result.substring(0,result.length() - 1);
		}
		
		// Occurance of given key in the given array
		public int occurance(String[] str,String key) {
			int result = 0;
			for(int i = 0;i < str.length;i++) {
				if(key.toUpperCase().equals(str[i].toUpperCase())) {
					result++;
				}
			}
			return result;
		}
		
		// Sort the given colors in asc/desc
		public String[] sort(String[] colors) {
			for(int i = 0;i < colors.length;i++) {
				for(int j = i;j < colors.length;j++) {
					if((int)colors[i].charAt(0) > (int)colors[j].charAt(0)) {
						String temp = colors[i];
						colors[i] = colors[j];
						colors[j] = temp;
					}
				}
			}
			//System.out.println(Arrays.toString(colors));
			return colors;
		}
		
		public int countOfVowels(String str) {
			char[] vowels = {'a','e','i','o','u'};
			int count = 0;
			for(int i = 0;i<str.length();i++) {
				for(int j = 0;j < vowels.length;j++) {
					if(vowels[j] == (str.toLowerCase().charAt(i))) {
						count++;
					}
				}
			}
			System.out.println(str + " " + count);
			return count;
		}
		
		public int getWordCount(String str) {
			
			return str.length();
		}
		
		// Covert integer arr values to binary string array
		public String[] covertToBinaryString(int[] arr) {
			
			return null;
		}
		
		// Encode string vowels with 1 and consonants with 0 then return 
		public String encode(String str) {
			String result = "";
			for(int i = 0;i < str.length();i++) {
				char eachChar = str.charAt(i);
				if (eachChar == 'a' || eachChar == 'e' || eachChar == 'i' || eachChar == 'o'
						|| eachChar == 'u' || eachChar == 'A' || eachChar == 'E' || eachChar == 'I' || eachChar == 'O' || eachChar == 'U') {
					result += "1";
				} else {
					result += "0";
				}
			}
				return result;
		}
		
}
