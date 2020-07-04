package hw4Q3Inheritance02;

public class TestAnimal {

	public static void main(String[] args) {

		System.out.println("\n------------------------------------------------------");
		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("\n------------------------------------------------------");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
	}

}
