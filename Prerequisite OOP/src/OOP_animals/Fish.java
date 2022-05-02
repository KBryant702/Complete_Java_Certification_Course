package OOP_animals;

public class Fish {
	String fishName;
	

	public Fish(String fishName) {
		this.fishName = fishName;
	}
	public void talk() {
		System.out.println("I am a "+ fishName);
		}
	public void swim() {
		System.out.println("Just keep Swimming...");
	}
	
}
