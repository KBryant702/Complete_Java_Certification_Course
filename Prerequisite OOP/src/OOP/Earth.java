package OOP;
public class Earth {
	public static void main(String args[]) {
		Human human1 = new Human("Tom", 25, 76, "Brown");
		Human human2 = new Human("Amy", 15, 46, "Blue");
		Human human3 = new Human("Bob", 16, 60, "Green");
		
		human1.speak();
		human2.speak();
		human3.speak();
		}
//		//creating structure of new human called tom
//		Human tom;
//		tom = new Human();
//		tom.age = 5;
//		tom.eyeColor = "Brown";
//		tom.heightInInches = 32;
//		tom.name = "Tom Zsabo";
//		
//		tom.speak();
//		
//		
//		Human joe = new Human();
////		
////		joe.age = 12;
////		joe.eyeColor = "Blue";
////		joe.heightInInches = 60;
////		joe.name = "Joe Grossi";
////		
//		joe.speak();		
//	}
}
