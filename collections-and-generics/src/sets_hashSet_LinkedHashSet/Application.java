package sets_hashSet_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		//similar to a List but prevents duplicates
		// HashSet does not maintain the order the objects were added like an ArrayList does.
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(43);
		
		for(Integer value : values) {
			System.out.println(value);
		}
		HashSet<String> words = new HashSet<String>();
		words.add("Random");
		words.add("Animal");
		words.add("People");
		words.add("Random");
		words.add("Random");
		
		for(String word : words) {
			System.out.println(word);
		}
		//LinkedHashSet Maintains order while not allowing duplicates
		LinkedHashSet<String> wordOrdered = new LinkedHashSet<String>();
		wordOrdered.add("Never");
		wordOrdered.add("Gonna");
		wordOrdered.add("Give");
		wordOrdered.add("Give");
		wordOrdered.add("You");
		wordOrdered.add("Up");
		
		for(String wordOrder : wordOrdered) {
			System.out.println(wordOrder);
		}
	}

}
