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
		Birds bird2 = new Birds("Ostrich");
		Birds bird3 = new Birds("Penguin");
		bird1.talk();
		bird1.fly();
		bird2.talk();
		bird2.running();
		bird3.talk();
		bird3.swim();
		
		Fish fish1 = new Fish("Guppy");
		fish1.talk();
		fish1.swim();
	}

}
