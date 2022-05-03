package Inheriting;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String animalName, int age, int weight, char gender) {
		super(animalName, age, weight, gender);
		
	}

	@Override
	public void fly() {
			System.out.println("I'm soaring through the air!");
		}
	

}
