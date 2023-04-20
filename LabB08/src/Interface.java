import java.util.Scanner;
public class Interface {

	public static void main(String[] args) {
		
		Fordonsregister fordreg = new Fordonsregister(3);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello and welcome to fordonsregistrering! Please select a number to start...");
		System.out.println("1: Add fordon till register.");
		System.out.println("2: Remove fordon from register.");
		System.out.println("3: Visa info om ett fordon.");
		System.out.println("4: Visa hela fordonsregistret.");
		System.out.println("Choose 0 to exit.");
		
		int val = scanner.nextInt(); 
		//Klistra in text till menyn, används INTE i metoderna i sig!!
	while(val!=0){
		switch (val) {
		case 1: //lägg till fordon. klistra in från add()
			//Skapa ägare
			System.out.println("Skapa ny owner genom att ange din Age och Name: ");
			int age = scanner.nextInt();
			String name= scanner.nextLine();
			
			//Skapa fordon 
			System.out.println("Ange Fordonstyp: "); 
			String fordonstyp = scanner.nextLine();
			System.out.println("Ange marke pa ditt fordon: "); 
			String marke = scanner.nextLine();
			System.out.println("Ange registreringsnummer pa ditt fordon: "); 
			String regnr = scanner.nextLine();
			Person p=new Person(age, name);
			fordreg.add(regnr, marke, fordonstyp, p);
		 break;
		  case 2: //ta bort fordon
			 System.out.println("here is where fordon is removed from register!");
			// remove();
			break;
		  case 3: //print info om ett (specifikt?) fordon
			 System.out.println("here is where info about a specific fordon will be displayed!");
			  //getFordon();
			break;
		  case 4: //print hela register
			 // System.out.println("here is where the whole register will be displayed!");
				fordreg.printArray();
		    break;
		  default: 
			System.out.println("you have to choose a number 1-4. please try again.");
		}
		System.out.println("Choose another option or press 0 to exit.");
		val =scanner.nextInt(); 	
		//här blir det fel efter att val 1 har gjorts.
		}
		if (val==0) {
		System.out.println("Thank you, come again!");
	}
	//scanner.close();
}
}

/*
 Denna klass ska innehålla ett menybaserat textgränssnitt till Fordonsregistret. I menyn
ska följande alternativ kunna väljas:

Lägg till ett fordon
I en metod ska information om fordonet och dess ägare tas in från användaren och
fordonet läggas in i registret.

Ta bort ett fordon
I en metod ska ett fordon på en angiven position tas bort ur registret.

Skriv ut information om ett fordon
I en metod ska information om ett fordon på en angiven position skrivas ut.

Skriv ut hela fordonsregistret
I en metod ska information om alla fordon i registret skrivas ut.

Storleken på fordonsregistret ni skapar är valfri.
 */
	