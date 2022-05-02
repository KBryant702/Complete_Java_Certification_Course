package OOP_animals;

public class Zoo {

	public static void main(String[] args) {
		Animals animal1 = new Animals("Hippo", 10, 1000, 'F');
		Animals animal2 = new Animals("Tiger", 15, 460, 'M');
		Animals animal3 = new Animals("Snake", 16, 60, 'F');
		
		animal1.speak();
		animal1.walk();
		animal2.speak();
		animal3.speak();
		animal3.eat();
		
		Birds bird1 = new Birds("Robin");
		bird1.speak();
		bird1.fly();
		Birds bird2 = new Birds("Ostrich");
		bird2.speak();
		bird2.running();
		Birds bird3 = new Birds("Penguin");
		bird3.speak();
		bird3.swim();
	}

}
