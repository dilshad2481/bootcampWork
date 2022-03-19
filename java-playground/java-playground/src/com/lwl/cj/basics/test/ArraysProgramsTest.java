package com.lwl.cj.basics.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Timeout;

import com.lwl.cj.basics.ArraysPrograms;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArraysProgramsTest {
	
	ArraysPrograms obj;
	
	@BeforeEach
	void init() {
		obj = new ArraysPrograms();
	}
	
	@Test
	void generateNPrimeNumbersTest() {
		ArraysPrograms arr = new ArraysPrograms();
		
		assertArrayEquals(new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}, arr.generateNPrimeNumbers(30));
	}
	
	@Test
	void SumOfElements() {
		int[] arr1 = {4,5,6,7,8,9,1,2,3,4};
		int[] arr2 = {-4,-5,-6,-7};
		int[] arr3 = {0,0,0,0,0};
		int[] arr4 = {-4,5,6,7,8,-9,-1,2,3,4};
		int[] arr5 = {1,5,-6,-9,0,8,10};
		int[] arr6 = {2,3,5,7,11,13,19}; 
		int[] arr7 = {-2,-3,-5,-7,2,3,5,7};
		int[] arr8 = {-2,-29,-37,-43,-59,-61};
		int[] arr9 = {-10,-23,-31,-41,-53,-67};
		int[] arr10 = {0,79,-83,97,-29,47,-43};
		int[] arr11 = {};
		int[] arr12 = {0};
		assertAll("SumOfElements",
				()->assertEquals(49,obj.sumOfElement(arr1)),
				()->assertEquals(-22,obj.sumOfElement(arr2)),
				()->assertEquals(0,obj.sumOfElement(arr3)),
				()->assertEquals(21,obj.sumOfElement(arr4)),
				()->assertEquals(9,obj.sumOfElement(arr5)),
				()->assertEquals(60,obj.sumOfElement(arr6)),
				()->assertEquals(0,obj.sumOfElement(arr7)),
				()->assertEquals(-231,obj.sumOfElement(arr8)),
				()->assertEquals(-225,obj.sumOfElement(arr9)),
				()->assertEquals(68,obj.sumOfElement(arr10)),
				()->assertEquals(0,obj.sumOfElement(arr11)),
				()->assertEquals(0,obj.sumOfElement(arr12))						
				);
	}
	
	@Test
	void maxElement() {
		int[] arr1 = {4,5,6,7,8,9,1,2,3,4};
		int[] arr2 = {-4,-5,-6,-7};
		int[] arr3 = {0,0,0,0,0};
		int[] arr4 = {-4,5,6,7,8,-9,-1,2,3,4};
		int[] arr5 = {1,5,-6,-9,0,8,10};
		int[] arr6 = {2,3,5,7,11,13,19};
		int[] arr7 = {-2,-3,-5,-7,2,3,5,7};
		int[] arr8 = {-2,-29,-37,-43,-59,-61};
		int[] arr9 = {-10,-23,-31,-41,-53,-67};
		int[] arr10 = {0,79,-83,97,-29,47,-43};
		
		
		assertAll("MaxElement",
				
				()->assertEquals(9,obj.maxElement(arr1)),
				()->assertEquals(-4,obj.maxElement(arr2)),
				()->assertEquals(0,obj.maxElement(arr3)),
				()->assertEquals(8,obj.maxElement(arr4)),
				()->assertEquals(10,obj.maxElement(arr5)),
				()->assertEquals(19,obj.maxElement(arr6)),
				()->assertEquals(7,obj.maxElement(arr7)),
				()->assertEquals(-2,obj.maxElement(arr8)),
				()->assertEquals(-10,obj.maxElement(arr9)),
				()->assertEquals(97,obj.maxElement(arr10))
				
				);
	}
	
	
	@Test
    void maxElementPNumbers() {
		int[] arr1 = {4,5,6,7,8,9,1,2,3,4};
		int[] arr2 = {-4,-5,-6,-7};
		int[] arr3 = {0,0,0,0,0};
		int[] arr4 = {-4,5,6,7,8,-9,-1,2,3,4};
		int[] arr5 = {1,5,-6,-9,0,8,10};
		int[] arr6 = {2,3,5,7,11,13,19};
		int[] arr7 = {-2,-3,-5,-7,2,3,5,7};
		int[] arr8 = {-2,-29,-37,-43,-59,-61};
		int[] arr9 = {-10,-23,-31,-41,-53,-67};
		int[] arr10 = {0,79,-83,97,-29,47,-43};
		
		
		assertAll("MaxElement",
				
				()->assertEquals(9,obj.maxElement(arr1)),
				()->assertEquals(-4,obj.maxElement(arr2)),
				()->assertEquals(0,obj.maxElement(arr3)),
				()->assertEquals(8,obj.maxElement(arr4)),
				()->assertEquals(10,obj.maxElement(arr5)),
				()->assertEquals(19,obj.maxElement(arr6)),
				()->assertEquals(7,obj.maxElement(arr7)),
				()->assertEquals(-2,obj.maxElement(arr8)),
				()->assertEquals(-10,obj.maxElement(arr9)),
				()->assertEquals(97,obj.maxElement(arr10))
				
				);
		
	}
	
	@Test
	void maxElementNNumbers() {
		int[] arr1 = {4,5,6,7,8,9,1,2,3,4};
		int[] arr2 = {-4,-5,-6,-7};
		int[] arr3 = {0,0,0,0,0};
		int[] arr4 = {-4,5,6,7,8,-9,-1,2,3,4};
		int[] arr5 = {1,5,-6,-9,0,8,10};
		int[] arr6 = {2,3,5,7,11,13,19};
		int[] arr7 = {-2,-3,-5,-7,2,3,5,7};
		int[] arr8 = {-2,-29,-37,-43,-59,-61};
		int[] arr9 = {-10,-23,-31,-41,-53,-67};
		int[] arr10 = {0,79,-83,97,-29,47,-43};
		
		
		assertAll("MaxElement",
				
				()->assertEquals(9,obj.maxElement(arr1)),
				()->assertEquals(-4,obj.maxElement(arr2)),
				()->assertEquals(0,obj.maxElement(arr3)),
				()->assertEquals(8,obj.maxElement(arr4)),
				()->assertEquals(10,obj.maxElement(arr5)),
				()->assertEquals(19,obj.maxElement(arr6)),
				()->assertEquals(7,obj.maxElement(arr7)),
				()->assertEquals(-2,obj.maxElement(arr8)),
				()->assertEquals(-10,obj.maxElement(arr9)),
				()->assertEquals(97,obj.maxElement(arr10))
				
				);
	}
	
	@Test
	void maxElementZero() {
		int[] arr = {0,0,0,0,0};
		int expected = 0;
		int actual = obj.maxElement(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void maxElementWithNandPNumber() {
		int[] arr1 = {4,5,6,7,8,9,1,2,3,4};
		int[] arr2 = {-4,-5,-6,-7};
		int[] arr3 = {0,0,0,0,0};
		int[] arr4 = {-4,5,6,7,8,-9,-1,2,3,4};
		int[] arr5 = {1,5,-6,-9,0,8,10};
		int[] arr6 = {2,3,5,7,11,13,19};
		int[] arr7 = {-2,-3,-5,-7,2,3,5,7};
		int[] arr8 = {-2,-29,-37,-43,-59,-61};
		int[] arr9 = {-10,-23,-31,-41,-53,-67};
		int[] arr10 = {0,79,-83,97,-29,47,-43};
		
		
		assertAll("MaxElement",
				
				()->assertEquals(9,obj.maxElement(arr1)),
				()->assertEquals(-4,obj.maxElement(arr2)),
				()->assertEquals(0,obj.maxElement(arr3)),
				()->assertEquals(8,obj.maxElement(arr4)),
				()->assertEquals(10,obj.maxElement(arr5)),
				()->assertEquals(19,obj.maxElement(arr6)),
				()->assertEquals(7,obj.maxElement(arr7)),
				()->assertEquals(-2,obj.maxElement(arr8)),
				()->assertEquals(-10,obj.maxElement(arr9)),
				()->assertEquals(97,obj.maxElement(arr10))
				
				);
	}
	
	
	
//	@Test
//	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
//	void isSubSetWithValidSubset() {
//		
//		int[] arr1 = {2,4,5,7,10};
//		int[] arr2 = {-2,4,5,7,12};
//		int[] arr3 = {1,2,3,4,5};
//		int[] arr4 = {0,2,10,11,63,57};
//		int[] arr5 = {-5,-7,-8,2,9,6,4};
//		int[] arr6 = {0,17,12,23,63,57};
//		int[] arr7 = {4,5,6,7,8,9,1,2,3,4};
//		int[] arr8 = {0,0,0,0,0};
//		
//		int[] sub1 = {2,3,4};
//		int[] sub2 = {-2,7,12};
//		int[] sub3 = {5,3};
//		int[] sub4 = {0,57,10,11};
//		int[] sub5 = {-8,6,-7,4};
//		int[] sub6 = {17,63,12,57};
//		int[] sub7 = {6,7};
//		int[] sub8 = {0};
//		
//		boolean res1 = obj.isSubSet(arr1, sub1);
//		boolean res2 = obj.isSubSet(arr2, sub2);
//		boolean res3 = obj.isSubSet(arr3, sub3);
//		boolean res4 = obj.isSubSet(arr4, sub4);
//		boolean res5 = obj.isSubSet(arr5, sub5);
//		boolean res6 = obj.isSubSet(arr6, sub6);
//		boolean res7 = obj.isSubSet(arr7, sub7);
//		boolean res8 = obj.isSubSet(arr8, sub8);
//		
//		assertTrue(res1, "Sub array is not sub set of master array");
//		assertTrue(res2, "Sub array is not sub set of master array");
//		assertTrue(res3, "Sub array is not sub set of master array");
//		assertTrue(res4, "Sub array is not sub set of master array");
//		assertTrue(res5, "Sub array is not sub set of master array");
//		assertTrue(res6, "Sub array is not sub set of master array");
//		assertTrue(res7, "Sub array is not sub set of master array");
//		assertTrue(res8, "Sub array is not sub set of master array");
//	}
	
//	@Test
//	void isSubSetWithNotSubset() {
//		
//		int[] arr1 = {2,4,5,7,10};
//		int[] arr2 = {-2,4,5,7,12};
//		int[] arr3 = {1,2,3,4,5};
//		int[] arr4 = {0,2,10,11,63,57};
//		int[] arr5 = {-5,-7,-8,2,9,6,4};
//		int[] arr6 = {0,17,12,23,63,57};
//		int[] arr7 = {4,5,6,7,8,9,1,2,3,4};
//		int[] arr8 = {0,0,0,0,0};
//		int[] arr9 = {1,2,3,4,5};
//		
//		int[] sub1 = {0,10,2,3,4};
//		int[] sub2 = {12,-10,-2,7,12};
//		int[] sub3 = {-5};
//		int[] sub4 = {-17,80,57,10};
//		int[] sub5 = {63,-54,6,-7,4};
//		int[] sub6 = {2,-3,57,17,63,12,57};
//		int[] sub7 = {13,19,-6,7};
//		int[] sub8 = {5,12};
//		int[] sub9 = {2,3,9};
//		
//		boolean res1 = obj.isSubSet(arr1, sub1);
//		boolean res2 = obj.isSubSet(arr2, sub2);
//		boolean res3 = obj.isSubSet(arr3, sub3);
//		boolean res4 = obj.isSubSet(arr4, sub4);
//		boolean res5 = obj.isSubSet(arr5, sub5);
//		boolean res6 = obj.isSubSet(arr6, sub6);
//		boolean res7 = obj.isSubSet(arr7, sub7);
//		boolean res8 = obj.isSubSet(arr8, sub8);
//		boolean res9 = obj.isSubSet(arr9, sub9);
//		
//		assertFalse(!res1, "Sub array is  sub set of master array");
//		assertFalse(!res2, "Sub array is  sub set of master array");
//		assertFalse(!res3, "Sub array is  sub set of master array");
//		assertFalse(!res4, "Sub array is  sub set of master array");
//		assertFalse(!res5, "Sub array is  sub set of master array");
//		assertFalse(!res6, "Sub array is  sub set of master array");
//		assertFalse(!res7, "Sub array is  sub set of master array");
//		assertFalse(!res8, "Sub array is  sub set of master array");
//		assertFalse(!res9, "Sub array is  sub set of master array");
//	}

}
