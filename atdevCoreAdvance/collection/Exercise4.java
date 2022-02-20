package collection;

import java.util.Arrays;
import java.util.Scanner;

class Exercise4 {

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.printf("enter player number");
	    int n = scan.nextInt();

	    Player[] player = new Player[n];
	    Checker checker = new Checker();

	    for(int i = 0; i < n; i++){
	    	System.out.printf("enter player name and score");
	    	
	      player[i] = new Player(scan.next(), scan.nextInt());
	    }
	    scan.close();

	    Arrays.sort(player, checker);
	    System.out.printf("after sorting players sequencely by name\n");
	    for(int i = 0; i < player.length; i++){
	      System.out.printf("%s %s\n", player[i].name, player[i].score);
	    }
	  }
	}