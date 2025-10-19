package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		

		
		while(true) {
			System.out.print("Erste Zahl: ");
			double eingabe=input.nextDouble();
			
			System.out.print("Zweite Zahl: ");
			double eingabe2=input.nextDouble();
			
			System.out.print(" * , / , - , + : ");
			String eingabe3=input.next();
			if(eingabe3.equals("q")) {
				System.out.println("Taschenrechner wird beendet...");
				input.close();
				break;
			}
			
			GrundFunktion grundfunktion = null;

			switch(eingabe3) {
			    case "-": grundfunktion = new Subraktion(); break;
			    case "*": grundfunktion = new Multiplikation(); break;
			    case "/": grundfunktion = new Division(); break;
			    case "+": grundfunktion = new Addition(); break;
			    default:
			        System.out.println("Ungültiger Operator");
			        input.close();
			        return;
			}

			double ergebnis = grundfunktion.grundFunktion(eingabe, eingabe2);
			System.out.println("Ergebnis: " + ergebnis);
			System.out.println("-------------Nächste-------------");

			
		}
	}
}
