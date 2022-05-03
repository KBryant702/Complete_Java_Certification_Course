package Inheriting;

public class Bird extends Animal {

	
	
	public Bird(String animalName, int age, int weight, char gender) {
		super(animalName, age, weight, gender);
		
	}
	public void fly() {
		System.out.println("I am a flyer");
		
	}
	public void swim() {
		System.out.println("I prefer swimming");
	}
	 public void running() {
		 System.out.println("I was running!");
	 }
}
