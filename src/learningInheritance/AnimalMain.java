package learningInheritance;

public class AnimalMain {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		DomesticAnimal domesticAnimal = new DomesticAnimal();
		
		animal.eat();
		animal.sleep();
		
		dog.bark();
		dog.eat();
		dog.howl();
		dog.sleep();
		
		cat.eat();
	
		

	}

}
