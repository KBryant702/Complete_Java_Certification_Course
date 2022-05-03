package Inheriting;

public class Zoo {

	public static void main(String[] args) {
		
		Chicken chick1 = new Chicken("Chicken", 1, 3, 'F' );
//		Animal animal1 = new Animal("Snake", 16, 60, 'F');
		Sparrow sparrow1 = new Sparrow("Sparrow", 3, 1, 'M');
		
		
//		animal1.speak();
//		animal1.eat();
//		chick1.speak();
//		sparrow1.speak();
//		sparrow1.move();
//		sparrow1.fly();

		
		Fish fish1 = new Fish("Guppy", 1, 1, 'M');
		 moveAnimals(fish1);
		 moveAnimals(sparrow1);
//		fish1.speak();
//		fish1.swim();
//		fish1.move();
	}
	public static void moveAnimals(Animal animal) {
		animal.move();
}
}
