import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		
		//ArrayList
		//Faster for retrieving Data
		//Arraylist must make a new larger array when the data grows beyond the size
		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("there");
		
		//words.remove(1);
		
		String item1 = words.get(0);
		String item2 = words.get(1);
		System.out.println(item1 +" "+ item2);
		
		//LinkedList
		//Faster for manipulating Data
		//Linkedlist when adding more info like a train you just add another car to the end.
		//Some Wrapper Classes are Double Float Integer not the primitive type double float integer
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(45);
		numbers.add(1000);
		numbers.remove(2);
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		
	}

}
