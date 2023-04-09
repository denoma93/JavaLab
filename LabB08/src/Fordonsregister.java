
public class Fordonsregister {
	
	// add: lägger till nytt fordon
	// pre: ägare till ett visst fordon skapad, registret inte fullt
	// post: Fordonet tillagt i registret
	public void add(String regnr, String märke, String typ, Person ägare) {
		
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
