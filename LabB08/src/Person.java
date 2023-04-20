public class Person {
	private int age;
	private String name;
	
	public Person(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
}
	public static void main(String[] args) {
		Person p = new Person(26,"nils");
		System.out.println("du heter"+p.getName()+"och är"+p.getAge()+ "år");
	}
		
}



/*
Denna klass ska användas i programmet för att lagra information om ett fordons ägare. Den 
information vi behöver i det här läget är ägarens namn och ålder
*/
