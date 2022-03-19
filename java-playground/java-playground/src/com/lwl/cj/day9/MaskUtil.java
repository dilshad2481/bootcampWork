package com.lwl.cj.day9;

import java.util.UUID;

public final class MaskUtil {
	private static double accNumber = 1000000001;
	private MaskUtil() {
		
	}
	
	public static String maskAccountNumber(String accNumber){
		return "********" + accNumber.substring(accNumber.length()-4,accNumber.length());
	}
	
	public static String newAccountNumber() {
		return "SB" + accNumber++;
	}
}
