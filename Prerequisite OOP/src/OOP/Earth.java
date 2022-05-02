package OOP;
public class Earth {
	public static void main(String args[]) {
		
		//creating structure of new human called tom
		Human tom;
		tom = new Human();
		tom.age = 5;
		tom.eyeColor = "Brown";
		tom.heightInInches = 32;
		tom.name = "Tom Zsabo";
		
		tom.speak();
		
		
		Human joe = new Human();
		
		joe.age = 12;
		joe.eyeColor = "Blue";
		joe.heightInInches = 60;
		joe.name = "Joe Grossi";
		
		joe.speak();		
	}
}
