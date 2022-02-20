package test;

import test.ClassRoom;

public class PrintDeskBench 
{
	public static void main(String[] args)
	{
		ClassRoom cl0 = new ClassRoom(1,60);
		ClassRoom cl1 = new ClassRoom(2,90);
		ClassRoom cl2 = new ClassRoom(3,50);
		ClassRoom cl3 = new ClassRoom(4,500);
		
		System.out.println("\nClass 5 ---");
		cl0.printDeskBench();
		System.out.println("\nClass 6 ---");
		cl1.printDeskBench();
		System.out.println("\nClass 7 ---");
		cl2.printDeskBench();
		System.out.println("\nClass 8 ---");
		cl3.printDeskBench();
			
		

	}
}
