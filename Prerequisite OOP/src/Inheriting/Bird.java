package Inheriting;

public class Bird extends Animal {
	
	public Bird(String animalName, int age, int weight, char gender) {
		super(animalName, age, weight, gender);
		
	}

	@Override
	public void move() {
		System.out.println("Flapping wings...");
		
	}
	
}
