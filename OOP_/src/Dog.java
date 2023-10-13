
public class Dog {
	
	String name;
	String type;
	int age;
	static int totalFeet = 4;
	

	public Dog() {
		
	}
	
	public Dog(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public void bark() {
		System.out.println("Dog"+ name + "is barking");
	}

	public static void displayTotalFeet() {
		System.out.println("Total Feet= " + totalFeet);
	}
	
}
