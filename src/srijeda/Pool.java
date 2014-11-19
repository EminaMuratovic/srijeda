package srijeda;

import java.util.Scanner;

public class Pool {
	public static void main(String[] args) {
		double povrsinaPool, povrsinaTile, ostatakWide, ostatakLong, ostatak, poolWide, poolLong, tileWide, tileLong;
		int wide, longg, holeBrick;
		
		System.out.println("How wide is the pool? ");
		poolWide = TextIO.getlnDouble();
		
		System.out.println("How long is the pool? ");
		poolLong = TextIO.getlnDouble();
		
		System.out.println("How wide is the tile? ");
		tileWide = TextIO.getlnDouble();
		
		System.out.println("How long is the tile? ");
		tileLong = TextIO.getlnDouble();
		
		wide=(int)(poolWide/tileWide);
		longg=(int)(poolLong/tileLong);
		ostatakWide=poolWide%tileWide;
		ostatakLong=poolLong%tileLong;
		ostatak=ostatakWide*ostatakLong;
		holeBrick=wide*longg;
		System.out.println("You need to use " + holeBrick + " and " + ostatak + " bricks");
		
		
		
		
		
	}

}
