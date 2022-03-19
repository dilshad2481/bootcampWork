package com.lwl.cj.two;
import com.lwl.cj.one.*;
public class Four extends One{
	One objOne = new One();
	public void showValues() {
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
		
		
		System.out.println(objOne.a);
		//System.out.println(objOne.b);
		//System.out.println(objOne.c);
		//System.out.println(objOne.d);
	}

}
