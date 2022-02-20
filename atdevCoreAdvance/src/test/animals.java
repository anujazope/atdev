package test;

import Animal.domestic;

import Animal.wild;

public class animals {
	public static void main(String[] args) {
		domestic d1 = new domestic("CAT");
		domestic d2 = new domestic("DOG");
		
		wild w1 = new wild("TIGER");
		wild w2 = new wild("LION");
		
		System.out.println("domestic animals :");
		d1.printName();
		d2.printName();
		System.out.println("wild animals :");
		w1.printName();
		w2.printName();
	}
}
