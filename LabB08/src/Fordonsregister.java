
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
	
	public void add(String regnr, String marke, String fordonstyp, Person owner) { //KLAR
		
//		Person p=new Person(age, name);
		Fordon f = new Fordon(regnr, fordonstyp, owner, marke);
		
		//Lägg in Fordon i arrayn
		fordreg[antal]=f;
		antal++;
	
		//Skriver ut hela arrayn fordreg
		for (int i=0; i<antal; i++) {
			System.out.println(fordreg[i].Skriv());
			}
	}	
			
	// remove: tar bort ett fordon
	// pre: position laglig (0 <=pos && pos < size())
	// post: fordon på position pos borttagen
	// ägare på högre positioner har skiftats ner för att undvika
	// “hål” i lagringsutrymmet.
	public void remove(int pos) {//JOSEFIN

	    }
	
	// getFordon: hämtar fordonet på position pos i registret
	// pre: position laglig (0 <=pos && pos < size())
	// post: Fordonet på position pos returnerad
	public Fordon getFordon(int pos) {
		if(0>=pos&&pos>size()) {
			return fordreg[pos];
		}
		else {
			return null;
		}
	}
	
	// size: returnerar antalet fordon i registret
	// pre: true
	// post: antalet fordon i registret returnerat
	public int size() {//KLAR
		int count=0;
		for (int i=0; i<antal; i++) {
			if(fordreg[i]!=null) {	
			count++;
			}	
		}
		return count;
	}
	
	// maxSize: returnerar maximal storlek på registret
	// pre: true
	// post: maximal storlek för registret returnerad
	public int maxSize() {//KLAR
		System.out.println("Max size of register is: ");
		return fordreg.length;
	}
	
	// skrivUt: Returnerar information om ett fordon
	// pre: position laglig (0 <=pos && pos < size())
	// post: fordonet på position pos returnerad
	public String skrivUt(int pos) {//KLAR
		return fordreg[pos].getFordon();
		
		}	
	
	
	//Skriver ut det som är sparat i hela arrayn
	public void printArray() {//KLAR
		for (int i=0;i<antal; i++) {
			System.out.println(fordreg[i].Skriv());  
		}
	}
	
}

/*
 Det är denna klass som innehåller själva registret. Storleken på registret ska skickas med när
man skapar det och klassen ska också hålla reda på hur många fordon som för närvarande
finns i registret (Klassen Fordonsregister har ett aggregatförhållande med klassen Fordon).
ovan metoder ska också finnas i klassen.
 */
