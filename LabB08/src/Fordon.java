
public class Fordon {
	
	 private String regnr;
	 private Person owner;   //detta ska alltså ha associationsförhållande till Person, dvs owner = Person.
	 private String fordonstyp;
	 private String marke;
 
//konstruktor
		Fordon(String regnr, String fordonstyp, Person owner, String marke){
			this.regnr=regnr;
			this.fordonstyp=fordonstyp;
			this.owner=owner;
			this.marke=marke;	
		}
		
		public void setOwner(Person owner) { 
			this.owner = owner; 
			}
		public Person getOwner() {
			return owner; 
			}  
	
//Metod som returnerar fordons egenskaper
	public void fordon(String regnr, String fordonstyp, String owner, String marke) {
		System.out.println("Bilens regnummer är: "+this.regnr+"fordonstypen är "+this.fordonstyp); 
		System.out.println("Bilens ägare är: "+this.owner+ "och märket på bilen är "+this.marke);
		}	
	public String Skriv() {
		return "Bilens ägare är: "+this.owner.getName()+this.owner.getAge()+ "och märket på bilen är "+this.marke +"Bilens regnummer är: "+this.regnr+"fordonstypen är "+this.fordonstyp;
	}

	}
	

/*
Ett fordon ska ha egenskaperna fordonstyp, märke, registreringsnummer och ägare. Alla dessa 
egenskaper ska få värden när ett fordon skapas (Klassen Fordon har ett 
associationsförhållande med klassen Person). I den här klassen ska också en metod som 
returnerar fordonets alla egenskaper finnas. (Hjälp: typ return ”text ”+ this.regNr+” text” osv
*/