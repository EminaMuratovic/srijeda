package srijeda;

public class RughtAngledTriangle {
	public static void main(String[] args) {
		double prva, druga, treca, prvaa, drugaa, trecaa;

		System.out.println("What are the sides of your triangle? ");
		prva = TextIO.getDouble();
		druga = TextIO.getDouble();
		treca = TextIO.getDouble();

		if (prva > druga && prva > treca) {
			prvaa = druga * druga + treca * treca;
			if (prva == Math.sqrt(prvaa))
				System.out.println("Your triangle is right-angled.");
			else
				System.out.println("Your triangle is not right-angled.");
		} else if (druga > treca) {
			drugaa = prva * prva + treca * treca;
			if (druga == Math.sqrt(drugaa))
				System.out.println("Your triangle is right-angled.");
			else
				System.out.println("Your triangle is not right-angled.");
		} else {
			trecaa = prva * prva + druga * druga;
			if (treca == Math.sqrt(trecaa))
				System.out.println("Your triangle is right-angled.");
			else
				System.out.println("Your triangle is not right-angled.");
		}
	}

}
