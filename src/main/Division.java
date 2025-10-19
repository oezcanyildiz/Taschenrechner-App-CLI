package main;

public class Division extends GrundFunktion {

	@Override
	public double grundFunktion(double zahl1, double zahl2) {
		if(zahl2 == 0) {
		    System.out.println("Fehler: Division durch 0 nicht erlaubt.");
		    return 0;
		}
		return zahl1 / zahl2;
	}

}
