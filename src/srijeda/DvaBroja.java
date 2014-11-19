package srijeda;

public class DvaBroja {
	public static void main(String[] args) {
		double prvi, drugi, suma, proizvod, kolicnik, modul;
		System.out.println("Unesite dva broja: ");
		do {
			prvi=TextIO.getDouble();
			drugi=TextIO.getDouble();
			suma=prvi+drugi;
			proizvod=prvi*drugi;
			kolicnik=prvi/drugi;
			modul=prvi%drugi;
			if(prvi==0 && drugi==0) return;
			else
			System.out.println("Suma je " + suma + "; Proizvod je " + proizvod + "; Kolicnik je " + kolicnik + "; Modul je " + modul + ";");
	} while (prvi!=0 && drugi!=0);
	}
}
