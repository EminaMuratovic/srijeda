package srijeda;

import java.util.Scanner;

public class HittingTheGround {
	public static void main(String[] args) {
		double g = 9.87, height, sec;
		
		Scanner unos = new Scanner(System.in);
		System.out.println("From what height is the body falling? ");
		height = TextIO.getlnDouble();
		
		System.out.println("For how long? ");
		sec = TextIO.getlnDouble();
		
		double t = 2 * height / g;
		double vrijeme = Math.sqrt(t);
		if (sec == vrijeme)
			System.out.println("The body has hit the ground.");
		else
			sec =  vrijeme % sec;
		System.out.println("There is " + sec
				+ " sec left for body to hit the ground. ");

	}

}
