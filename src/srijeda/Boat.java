package srijeda;

public class Boat {
	public static void main(String[] args) {

		double distance, time, speed, speed1;
		System.out.println("What is the speed of the boat? ");
		speed = TextIO.getlnInt();
		System.out.println("What is the distance it has passed? ");
		distance = TextIO.getlnDouble();
		speed1 = speed * 1.60934 / 3600;
		time = distance / speed1;
		System.out.println("In " + time + " seconds the boat has passed "
				+ distance + " kilometres driving " + speed
				+ " miles per hour.");

	}

}
