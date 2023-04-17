
import java.util.Scanner;

public class Fordonsregister {
	Fordon[] fordreg;
	int antal; 
	
	//konstruktor
	public Fordonsregister() {
		fordreg=new Fordon[3];
		antal=0;
	}
	
	// add: lägger till nytt fordon
	// pre: ägare till ett visst fordon skapad, registret inte fullt
	// post: Fordonet tillagt i registret
	public void add() {
	//public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ange Fordonstyp: "); 
		String typ = scanner.nextLine();
		
		
		System.out.println("Ange Märke på ditt fordon: "); 
		String marke = scanner.nextLine();
		
		System.out.println("Ange registreringsnummer på ditt fordon: "); 
		String regnr = scanner.nextLine();
		
		System.out.println("Is this your vehicle? "+typ+marke+regnr );
		//for loop för att lägga in data i Arrayn?
		//hur spara flera variabler på EN plats i Arrayn??
		
		scanner.close();

		
		
	}
	
	// remove: tar bort ett fordon
	// pre: position laglig (0 <=pos && pos < size())
	// post: fordon på position pos borttagen
	// ägare på högre positioner har skiftats ner för att undvika
	// “hål” i lagringsutrymmet.
	public void remove(int pos) {
		
	}
	
	// getFordon: hämtar fordonet på position pos i registret
	// pre: position laglig (0 <=pos && pos < size())
	// post: Fordonet på position pos returnerad
	public Fordon getFordon(int pos) {
		
	}
	
	// size: returnerar antalet fordon i registret
	// pre: true
	// post: antalet fordon i registret returnerat
	public int size() {
		
	}
	
	// maxSize: returnerar maximal storlek på registret
	// pre: true
	// post: maximal storlek för registret returnerad
	public int maxSize() {
		
	}
	
	// skrivUt: Returnerar information om ett fordon
	// pre: position laglig (0 <=pos && pos < size())
	// post: fordonet på position pos returnerad
	public String skrivUt(int pos) {
		
	}
	
}

/*
 Det är denna klass som innehåller själva registret. Storleken på registret ska skickas med när
man skapar det och klassen ska också hålla reda på hur många fordon som för närvarande
finns i registret (Klassen Fordonsregister har ett aggregatförhållande med klassen Fordon).
ovan metoder ska också finnas i klassen.
 */
