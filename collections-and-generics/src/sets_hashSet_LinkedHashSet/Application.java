package sets_hashSet_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 24);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
//		System.out.println(animal1.equals(animal4));
		
		//compared the hashcode
//		System.out.println(animal1.hashCode());
//		System.out.println(animal4.hashCode());
		
		for(Animal  value : animals ) {
			System.out.println(value);
		}
		
	}
}
		//similar to a List but prevents duplicates
		// HashSet does not maintain the order the objects were added like an ArrayList does.
//		HashSet<Integer> values = new HashSet<Integer>();
//		values.add(12);
//		values.add(43);
//		values.add(15);
//		values.add(67);
//		values.add(43);
//		
//		for(Integer value : values) {
//			System.out.println(value);
//		}
//		HashSet<String> words = new HashSet<String>();
//		words.add("Random");
//		words.add("Animal");
//		words.add("People");
//		words.add("Random");
//		words.add("Random");
//		
//		for(String word : words) {
//			System.out.println(word);
//		}
//		//LinkedHashSet Maintains order of insertion while not allowing duplicates
//		LinkedHashSet<String> wordOrdered = new LinkedHashSet<String>();
//		wordOrdered.add("Never");
//		wordOrdered.add("Gonna");
//		wordOrdered.add("Give");
//		wordOrdered.add("Give");
//		wordOrdered.add("You");
//		wordOrdered.add("Up");
//		wordOrdered.add("Up");
//		
//		for(String wordOrder : wordOrdered) {
//			System.out.println(wordOrder);
//		}
//	}

//}
