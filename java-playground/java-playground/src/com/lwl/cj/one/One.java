package com.lwl.cj.one;

public class One {
	public  int a = 10;
	protected int b = 20;
	private int c = 30;
	int d = 40;
	
	
	public void showValues() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		/**
		 * 				same class(One)		inherited-IS-A(Two)		HAS-A(create obj)(Three)		different package(IS-A)(inherit)		different package(HAS-A)(create obj)
		 * public			yes					yes						yes								yes										yes
		 * protected		yes					yes						yes								yes										no
		 * private			yes					no						no								no										no
		 * (default)		yes					yes						yes								no										no
		* restrictiveness: private > default > protected > public
		 */
		

	}

}
