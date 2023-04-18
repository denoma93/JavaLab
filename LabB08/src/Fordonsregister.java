
import java.util.Scanner;

public class Fordonsregister {
	private Fordon[] fordreg;
	private int antal;
	
	//konstruktor
	public Fordonsregister(int max) {
		fordreg=new Fordon[max];
		antal=0;
	}
	
	// add: lägger till nytt fordon
	// pre: ägare till ett visst fordon skapad, registret inte fullt
	// post: Fordonet tillagt i registret
	public void add() {
		Scanner scanner = new Scanner(System.in);
		
		//Skapa ägare
		System.out.println("Skapa ny owner genom att ange din Age och Name: ");
		int age = scanner.nextInt();
		String name= scanner.nextLine();
		
		Person p=new Person(age, name);
		
		//Skapa fordon 
		System.out.println("Ange Fordonstyp: "); 
		String fordonstyp = scanner.nextLine();
		System.out.println("Ange marke pa ditt fordon: "); 
		String marke = scanner.nextLine();
		System.out.println("Ange registreringsnummer pa ditt fordon: "); 
		String regnr = scanner.nextLine();
		scanner.close();
		
		Fordon f = new Fordon(regnr, fordonstyp, p, marke);
		
		//Lägg in Fordon i arrayn
		fordreg[antal]=f;
		antal++;
	
		//Skriver ut hela arrayn register
		for (int i=0; i<antal; i++) {
			System.out.println(fordreg[i].Skriv());
			}

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
