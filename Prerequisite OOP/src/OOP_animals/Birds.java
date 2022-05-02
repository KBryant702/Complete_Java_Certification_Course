package OOP_animals;

public class Birds {
	String birdName;
	 
	public Birds(String birdName) {
		this.birdName = birdName;
	}
	public void speak() {
		System.out.println("I am a " + birdName);
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
