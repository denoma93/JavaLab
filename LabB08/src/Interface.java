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
	
	while(val!=0){
		switch (val) {
		case 1: //lägg till fordon. 
			//Skapa ägare
			System.out.println("Börja med att genom att ange din ålder och namn: ");
			int age = scanner.nextInt();
			String name= scanner.nextLine();
			
			//Skapa fordon 
			System.out.println("Ange Fordonstyp: "); 
			String fordonstyp = scanner.nextLine();
			System.out.println("Ange märke på ditt fordon: "); 
			String marke = scanner.nextLine();
			System.out.println("Ange registreringsnummer på ditt fordon: "); 
			String regnr = scanner.nextLine();
			Person p=new Person(age, name);
			fordreg.add(regnr, marke, fordonstyp, p);
		 break;
		  case 2: //ta bort fordon
			  fordreg.printArray();
			  	
			    System.out.print("Vilket fordon vill du ta bort? Ange fordones position i listan: ");
				Scanner tgb = new Scanner(System.in);
				int position;
				position=tgb.nextInt();
				
				fordreg.remove(position);
				fordreg.printArray();
			break;
		  case 3: //print info om ett fordon
			 System.out.println("Vilket fordon vill du läsa om? Ange position med ett heltal.");
				int pos=scanner.nextInt();
				fordreg.skrivUt(pos);
			break;
		  case 4: //print hela register
				fordreg.printArray();
		    break;
		  default: 
			System.out.println("you have to choose a number 1-4. please try again.");
		}
		System.out.println("Choose another option or press 0 to exit.");
		val =scanner.nextInt(); 	
		}
		if (val==0) {
		System.out.println("Thank you, come again!");
	}
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
	