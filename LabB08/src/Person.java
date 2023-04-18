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
}



/*
Denna klass ska användas i programmet för att lagra information om ett fordons ägare. Den 
information vi behöver i det här läget är ägarens namn och ålder
*/
