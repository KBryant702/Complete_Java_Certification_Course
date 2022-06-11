package collectionMethodsAndUsingComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		/*User Defined types get tricky - User defined has to specify how we want the data to be sorted*/
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Paul", 3000, "Admin"));
		hashSet.add(new Employee("Peter", 4000, "IT"));
		hashSet.add(new Employee("Bob", 2000, "Maintenence"));
		
		
		List<Employee> myList = new ArrayList<Employee> (hashSet);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		
		/*Sorting Data natural order is alphabetical 
		 For integer is is 0-100 for natural order*/
//		HashSet<String> hashSetWords = new HashSet<String>();
//		hashSetWords.add("Always");
//		hashSetWords.add("Everything");
//		hashSetWords.add("Believe");
//		hashSetWords.add("Mindset");
//		hashSetWords.add("Can");
//		hashSetWords.add("Do");
//		
//		
//		List<String> myListWords = new ArrayList<String> (hashSetWords);
//		Collections.sort(myListWords);
//		
//		System.out.println(myListWords);
//		
//		
//		HashSet<Integer> hashSet = new HashSet<Integer>();
//		hashSet.add(12);
//		hashSet.add(43);
//		hashSet.add(15);
//		hashSet.add(67);
//		hashSet.add(43);
//		hashSet.add(10);
//		
//		
//		List<Integer> myList = new ArrayList<Integer> (hashSet);
//		Collections.sort(myList);
//		
//		System.out.println(myList);
//		
		/*Convert a hashSet into list*/
//		HashSet<Integer> list1 = new HashSet<Integer>();
//		list1.add(12);
//		list1.add(43);
//		list1.add(15);
//		list1.add(67);
//		list1.add(43);
//		list1.add(10);
//		list1.add(10);
//		list1.add(10);
		
		/*The way to convert LinkedList into list or hashSet into list
		First Instantiate a new list or new collection whether it's a hashSet or list
		Then specify in the arguments of the constructor the data you would like this new object to be populated with*/
//		List<Integer> hashToList = new ArrayList<Integer>(list1);
		
	
		
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		list1.add(12);
//		list1.add(43);
//		list1.add(15);
//		list1.add(67);
//		list1.add(43);
//		list1.add(10);
//		list1.add(10);
//		list1.add(10);
//		
//		ArrayList<Integer> newList = new ArrayList<Integer>();
//		newList.add(10);
//		newList.add(67);
//		newList.add(15);
//		newList.add(11);
		/*Retain all is used to remove everything except for the values that you'd like to retain.*/
//		list1.retainAll(newList);
//		System.out.println(list1);
		
		/*Checks if list is empty*/
//		list1.clear();
//		boolean isEmpty = list1.isEmpty();
//		System.out.println(isEmpty);
		
		
		/*Check if an item exists*/
//		boolean hasValue = list1.contains(67);
//		System.out.println(hasValue);
		
		
		/*Removes all items from list1 that are in newList*/
//		list1.removeAll(newList);
		
		/*removes all data from list*/
//		list1.clear();
//		System.out.println(list1);
	}
}
