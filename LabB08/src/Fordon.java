
public class Fordon {
	
	 String regnr;
	 String owner;
	 String fordonstyp;
	 String marke;
 
//konstruktor
	Fordon(String regnr, String fordonstyp, String owner, String marke){
		 
	this.regnr=regnr;
	this.fordonstyp=fordonstyp;
	this.owner=owner;
	this.marke=marke;	
	}
	
//Metod som returnerar fordons egenskaper
	public void fordon(String regnr, String fordonstyp, String owner, String marke) {
	System.out.println("text "+this.regnr+" voila");//ej färdig fras för alla attribut!
	//String returstring="text "+this.regnr+" voila";
	
	}
}



/*
Ett fordon ska ha egenskaperna fordonstyp, märke, registreringsnummer och ägare. Alla dessa 
egenskaper ska få värden när ett fordon skapas (Klassen Fordon har ett 
associationsförhållande med klassen Person). I den här klassen ska också en metod som 
returnerar fordonets alla egenskaper finnas. (Hjälp: typ return ”text ”+ this.regNr+” text” osv
*/