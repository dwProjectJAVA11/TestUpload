package Abs;

public class AnimalEx {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animalSound(dog);
		animalSound(cat);
		
//		cat.sound();
//		dog.sound();
		
		System.out.println("-------------------------\n");
		
		Animal animal = null;
		
		animal = dog;
		animal.sound();
		
		animal = cat;
		animal.sound();
		
	}
	
	static void animalSound(Animal animal)
	{
		animal.sound();
		animal.breathe();
	}

}
