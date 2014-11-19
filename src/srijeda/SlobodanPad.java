package srijeda;

import java.util.Scanner;

public class SlobodanPad {
	public static void main(String[] args) {
		double sec, distance, g=9.87;
		Scanner unos = new Scanner(System.in);
		System.out.println("For how many seconds is the body falling? ");
		sec = TextIO.getlnDouble();
		
		distance = g * sec * sec / 2;
		System.out.println("Body will cover " + distance + " metres in " + sec
				+ " seconds.");

	}
}
