package client;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
//Generic Class 
	public static void main(String[] args) {
		//Where the variable types are passed for the container
	Container<Integer, String> container = new Container<>(12, "Hello");	
	int val1 = container.getItem1();
	String val2 = container.getItem2();
	System.out.println(val1 + val2);
	
	Set<String> mySet1 = new HashSet<String>();
	mySet1.add("First");
	mySet1.add("Second");
	mySet1.add("Whatever");
	
	Set<String> mySet2 = new HashSet<String>();
	mySet2.add("First");
	mySet2.add("Second");
	mySet2.add("Computer");
	
	Set<String> resultSet = union(mySet1, mySet2);
	
	Iterator itr = resultSet.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
	
	//Generic method
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
		
	}
	
}
		
		//Java compiler warns of type safe error during compile time. 
		//This strictness is why generic were added to the ArrayList class.
		//
//		ArrayList<String> myList = new ArrayList<>();
//		myList.add("hello");
//		
//		String myVal = myList.get(0);
//		
//	}
//
//}
