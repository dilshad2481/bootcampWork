package com.lwl.cj.basics.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lwl.cj.basics.StringPrograms;

class StringProgramsTest {
	
	
	@Test
	void joinStringsTest() {
		StringPrograms program = new StringPrograms();
		String delimeter1 = "-";
		String expected = "Rajesh-Manoj-Suresh";
		assertEquals(expected, program.joinStrings(new String[]{"Rajesh","Manoj","Suresh"},delimeter1));
		//fail("Not yet implemented");
	}
	
	@Test
	void occuranceTest() {
		StringPrograms program = new StringPrograms();
		assertEquals(2,program.occurance(new String[] {"B","Z","A","G","A","C","O","E"},"A"));
		assertEquals(3,program.occurance(new String[] {"potato","champion","potato","khalid","pikachu","rabbit","umbrella","helicoptor","potato"},"potato"));
		assertEquals(1,program.occurance(new String[] {"zavier","fighter","key","orange","rambo","potato","rainbow","Elephant"},"key"));
		assertEquals(0,program.occurance(new String[] {"B","Z","A","G","A","C","O","E"},"m"));
		assertEquals(0,program.occurance(new String[] {},"alpha"));
		assertEquals(0,program.occurance(new String[] {},""));

	}
	
	@Test
	void sortTest() {
		StringPrograms program = new StringPrograms();
		String[] input = {"red","green","brown","yellow","orange"};
		String[] output = {"brown","green","orange","red","yellow"};
		assertArrayEquals(output,program.sort(input));
//		assertEquals(3,program.sort(new String[] {"potato","champion","potato","khalid","pikachu","rabbit","umbrella","helicoptor","potato"},"potato"));
//		assertEquals(1,program.sort(new String[] {"zavier","fighter","key","orange","rambo","potato","rainbow","Elephant"},"key"));
//		assertEquals(0,program.sort(new String[] {"B","Z","A","G","A","C","O","E"},"m"));
//		assertEquals(0,program.sort(new String[] {},"alpha"));
//		assertEquals(0,program.sort(new String[] {},""));

	}
	
	
	@Test
	void countOfVowelsTest() {
		StringPrograms program = new StringPrograms();
		//String vowelTest = "apple";
		assertEquals(2,program.countOfVowels("apple"));
		assertEquals(3,program.countOfVowels("banana"));
		assertEquals(0,program.countOfVowels(""));
		assertEquals(0,program.countOfVowels("Rhythm"));
	}
	
	@Test
	void encodeTest() {
		StringPrograms program = new StringPrograms();
		assertEquals("10001",program.encode("Apple"));
		assertEquals("11011", program.encode("Audio"));
		assertEquals("0000",program.encode("Lynx"));
		assertEquals("000000",program.encode("Rhythm"));
		assertEquals("",program.encode(""));
	}
}
