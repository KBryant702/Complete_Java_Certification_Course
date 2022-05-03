package Inheriting;

public class Zoo {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Hippo", 10, 1000, 'F');
		Animal animal2 = new Animal("Tiger", 15, 460, 'M');
		Animal animal3 = new Animal("Snake", 16, 60, 'F');
		
		animal1.speak();
		animal1.walk();
		animal2.speak();
		animal3.speak();
		animal3.eat();
		
		Bird bird1 = new Bird("Robin", 2, 1, 'F');
		Bird bird2 = new Bird("Ostrich",5, 100, 'M' );
		Bird bird3 = new Bird("Penguin", 3, 40, 'F');
		bird1.speak();
		bird1.fly();
		bird1.sleep();
		bird2.speak();
		bird2.eat();
		bird2.running();
		bird3.speak();
		bird3.swim();
		
		Fish fish1 = new Fish("Guppy", 1, 1, 'M');
		fish1.speak();
		fish1.eat();
		fish1.swim();
	}

}
