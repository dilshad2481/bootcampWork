package com.lwl.cj.basics;

public class FundamentalPrograms_2 {

	public boolean isEven(int num) {
		// TODO write logic
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public int biggest(int a, int b) {
		// TODO write logic
		
		return (a > b) ? a : b;
	}

	public int biggest(int a, int b, int c) {
		// TODO write logic
		if ((a > b) && (a > c)){
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}
	
	
	/*
	 * If amount 1 - 100 Discount 5% 
	 * If amount >100 and <= 500 Discount 10% 
	 * If amount >500 and <= 1000 Discount 12% 
	 * If amount > 1000 Discount 15%
	 */

	public float getDiscountAmount(int amount) {
		// TODO write logic
		if ((amount > 0) && (amount <= 100)) {
			return amount - (amount * 0.05f);
		} else if ((amount > 100) && (amount <= 500)) {
			return amount - (amount * 0.1f);
		} else if ((amount > 500) && (amount <= 1000)) {
			return amount - (amount * 0.12f);
		} else {
			return amount - (amount * 0.15f);
		}

	}

	/*
	 * If used units 0 - 100 per unit 3 
	 * > 100 and <= 500 per unit 5
	 * > 500 and <=	 * 1000 per unit 8 
	 * > 1000 per unit 10
	 * 
	 * bill amount = minAmount + used units amount
	 * 
	 */
	public float calElectricityBill(int minAmount, int usedUnits) {
		float billAmount = 0;
		float usedUnitsAmount = 0;
		if ((usedUnits >= 0) && (usedUnits <= 100)) {
			
			usedUnitsAmount = usedUnits * 3;
			System.out.println("1 usedUnits = " + usedUnits + ", usedUnitsAmount = " + usedUnitsAmount);
		} else if ((usedUnits > 100) && (usedUnits <= 500)) {
			usedUnitsAmount = usedUnits * 5;			
			System.out.println("2 usedUnits = " + usedUnits + ", usedUnitsAmount = " + usedUnitsAmount);
		} else if ((usedUnits > 500) && (usedUnits <= 1000)) {
			usedUnitsAmount = usedUnits * 8;	
			System.out.println("3 usedUnits = " + usedUnits + ", usedUnitsAmount " + usedUnitsAmount);
		} else {
			usedUnitsAmount = usedUnits * 10;
			System.out.println("4 usedUnits = " + usedUnits + ", usedUnitsAmount " + usedUnitsAmount);
		}
		
		billAmount = minAmount + usedUnitsAmount;
		System.out.println("minAmount = " + minAmount + ", billAmount = " + billAmount);
		return billAmount;
		
		
		
		
		// TODO write logic
//		System.out.println(minAmount + " " + usedUnits);
//		float billAmount = 0;
//		if ((usedUnits >= 0) && (usedUnits <= 100)) {
//			usedUnits *= 3f;
//		} else if ((usedUnits <= 500) && (usedUnits > 100)) {
//			usedUnits *= 5f;
//			
//		} else if ((usedUnits > 500) && (usedUnits <= 1000)) {
//			usedUnits *= 8;
//			
//		} else {
//			usedUnits *= 10;
//		}
//		System.out.println(usedUnits);
//		return minAmount + usedUnits;

	}

}