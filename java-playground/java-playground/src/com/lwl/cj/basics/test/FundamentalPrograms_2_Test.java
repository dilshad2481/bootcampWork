package com.lwl.cj.basics.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lwl.cj.basics.FundamentalPrograms_2;

class FundamentalPrograms_2_Test {

	@Test
	void isEven() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(true, obj.isEven(10));
		assertEquals(true, obj.isEven(32));
		assertEquals(true, obj.isEven(-10));
		assertEquals(true, obj.isEven(0));
		assertEquals(false, obj.isEven(11));
		assertEquals(false, obj.isEven(21));
		assertEquals(false, obj.isEven(61));
	}

	@Test
	void biggestOfTwoTest() {
		// biggest(5,5) biggest(0,0)
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(10, obj.biggest(10, 5));
		assertEquals(5, obj.biggest(5, 5));
		assertEquals(0, obj.biggest(0, 0));
		assertEquals(10, obj.biggest(10, 0));
		assertEquals(280, obj.biggest(0, 280));
		assertEquals(85, obj.biggest(85, 76));
		assertEquals(10, obj.biggest(5, 10));
		assertEquals(20, obj.biggest(-10, 20));
		assertEquals(10, obj.biggest(10, -20));
		assertEquals(-10, obj.biggest(-10, -20));
		assertEquals(-10, obj.biggest(-20, -10));
	}

	@Test
	void biggestOfThreeTest() {
		//biggest(100,100,100)
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(30, obj.biggest(10, 15, 30));
		assertEquals(0, obj.biggest(0, 0, 0));
		assertEquals(300, obj.biggest(100, 200, 300));
		assertEquals(100, obj.biggest(100, 100, 100));
		assertEquals(850, obj.biggest(850, 750, 650));
		assertEquals(99, obj.biggest(77, 88, 99));
		assertEquals(-25, obj.biggest(-25, -50, -85));
		assertEquals(50, obj.biggest(-25, 50, -85));
		assertEquals(25, obj.biggest(25, -50, -85));
		assertEquals(50, obj.biggest(19, 50, -85));
	}

	/*
	 * If amount 1 - 100 Discount 5% 
	 * If amount >100 and <= 500 Discount 10% 
	 * If amount >500 and <= 1000 Discount 12% 
	 * If amount > 1000 Discount 15%
	 */

	@Test
	void getDiscountAmountTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(95, obj.getDiscountAmount(100), 0.02);
		assertEquals(450, obj.getDiscountAmount(500), 0.02);
		assertEquals(880, obj.getDiscountAmount(1000), 0.02);
		assertEquals(748, obj.getDiscountAmount(850), 0.02);
		assertEquals(90.9000015258789, obj.getDiscountAmount(101), 0.02);
		assertEquals(440.8800048828125, obj.getDiscountAmount(501), 0.02);
		assertEquals(850.8499755859375, obj.getDiscountAmount(1001), 0.02);
		assertEquals(0, obj.getDiscountAmount(0));
	}

	/* 
	 * If used units 0 - 100 per unit 3
	 * > 100 and <= 500 per unit 5 
	 * > 500 and <= *1000 per unit 8 
	 * > 1000 per unit 10
	 * 
	 * bill amount = minAmount + used units amount
	 */

	@Test
	void calElectricityBillTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertEquals(140, obj.calElectricityBill(50, 30), 0.02);
		//assertEquals(2420, obj.calElectricityBill(620, 180), 0.02);
		assertEquals(150, obj.calElectricityBill(60, 30), 0.02);
		assertEquals(350, obj.calElectricityBill(50, 100), 0.02);
		assertEquals(2700, obj.calElectricityBill(200, 500), 0.02);
		//assertEquals(5320, obj.calElectricityBill(320, 1000), 0.02);
		//assertEquals(403, obj.calElectricityBill(100, 101), 0.02);
		//assertEquals(2625, obj.calElectricityBill(120, 501), 0.02);
		//assertEquals(5150, obj.calElectricityBill(145, 1001), 0.02);
	}

}
