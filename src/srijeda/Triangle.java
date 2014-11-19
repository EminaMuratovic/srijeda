package srijeda;

import java.util.Scanner;



public class Triangle {
	public static void main(String[] args) {
		double povrsina, povrsinaa, s, prvii, drugii, trecii, prvi, drugi, treci;
		
		System.out.println("Unesite 3 broja: ");
		prvi = TextIO.getlnDouble();
		drugi = TextIO.getlnDouble();
		treci = TextIO.getlnDouble();
		if (prvi > 0 && drugi > 0 && treci > 0) {
			s = (prvi + drugi + treci) / 2;
			povrsinaa = s * (s - prvi) * (s - drugi) * (s - treci);
			povrsina = Math.sqrt(povrsinaa);
			System.out.println("Povrsina zadanog trougla je " + povrsina);
			if (prvi > drugi && prvi > treci) {
				prvii = (drugi * drugi + treci * treci - prvi * prvi) / 2
						* drugi * treci;
				System.out.println("Najveci trougao je naspram stranice "
						+ prvi + " i iznosi " + Math.acos(prvii));
			} else if (drugi > treci) {
				drugii = (prvi * prvi + treci * treci - drugi * drugi) / 2
						* prvi * treci;
				System.out.println("Najveci trougao je naspram stranice "
						+ drugi + " i iznosi " + Math.acos(drugii));
			} else {
				trecii = (prvi * prvi + drugi * drugi - treci * treci) / 2
						* prvi * drugi;
				System.out.println("Najveci trougao je naspram stranice "
						+ treci + " i iznosi " + Math.acos(trecii));
			}
		} else
			System.out.println("Ne postoji trougao sa unesenim vrijednostima.");

	}

}
