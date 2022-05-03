package Inheriting;

public class Fish extends Animal implements Swimmable{

	public Fish(String animalName, int age, int weight, char gender) {
		super(animalName, age, weight, gender);
	
	}

	@Override
	public void swim() {
			System.out.println("Just keep Swimming...");
		}


	
}
