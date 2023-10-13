import access.Cat;
import access.Circle;

public class Main {

	public Main() {
	Dog dog1 = new Dog();
	dog1.name = "Milo";
	dog1.type = "Husky";
	dog1.age = 2;
	
//	System.out.println(dog1.name);
//	System.out.println(dog1.type);
//	System.out.println(dog1.age);

	Dog dog2 = new Dog("Kasper", "Pom", 3);
//	System.out.println(dog2.name);
//	System.out.println(dog2.type);
//	System.out.println(dog2.age);
	
//	dog2.bark();
	Circle circle  = new Circle();
//	circle.changeRadius(20);
//	circle.radius = 10;
//	System.out.println(circle.getRadius());
	
//	System.out.println(circle.radius);
	
	
	//total feet nya static jd otomatis semua dog feetnya 4
//	Dog.totalFeet = Dog.totalFeet + 2;
//	System.out.println("Dog" + Dog.totalFeet);
	
//	Dog.displayTotalFeet();

//	Circle c = new Circle();
//	System.out.println(c.COLOR);
	
	
	//encasulaption
	Cat cat1 = new Cat();
	cat1.setName("Loki");
	System.out.println(cat1.getName());
	}
	
	

	public static void main(String[] args) {
		new Main();
		
	}

}
