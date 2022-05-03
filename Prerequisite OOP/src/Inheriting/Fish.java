package Inheriting;

public class Fish extends Animal{

	public Fish(String animalName, int age, int weight, char gender) {
		super(animalName, age, weight, gender);
	
	}

	public void swim() {
		System.out.println("Just keep Swimming...");
	}
	
}
