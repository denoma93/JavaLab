
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
	
	public void add(String regnr, String marke, String fordonstyp, Person owner) { 
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
	public void remove(int position) {
			if(position >= 0 && position <= size()){
					fordreg[position]=null;
					
					for(int i=position;i<this.size()-1;i++){
						fordreg[i]=fordreg[i+1];
					}
				antal--;
				System.out.println("Fordonet är nu borttaget från registret.");
			}
			else {
				System.out.println("Det finns inget fordon registrerat på den platsen.");	
			}
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
	public int size() {
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
	public int maxSize() {
		System.out.println("Max size of register is: ");
		return fordreg.length;
	}
	
	// skrivUt: Returnerar information om ett fordon
	// pre: position laglig (0 <=pos && pos < size())
	// post: fordonet på position pos returnerad
	public void skrivUt(int pos) {
		if(fordreg[pos]!=null) {
			System.out.println(fordreg[pos].Skriv());
		}	
		else {
			System.out.println ("Det finns inget fordon registrerat på den platsen.");	
		}
	}
	
	//Skriver ut det som är sparat i hela arrayn. Egen påkommen metod, ej från uppgiftsbeskrivningen.
	public void printArray() {
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
