package traversingListsAndCustomTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		//Arraylist and List are both lists.
		//looping over animals array
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
		//2 ways to loop over this array
		
		// 1. for loop
//		for (int i = 0; i < animals.size(); i++ ) {
//			System.out.println(animals.get(i));
//		}
//		
//	
//		//great for arraylist and collections
//		// 2. for each loop
//		for(String value : animals ) {
//			System.out.println(value);
//		}
//	}

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle2 = new Vehicle ("Toyota","Camry", 12000, false);
		
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep","Wrangler", 25000, true));
		
//		for(Vehicle car : vehicles) {
			
//			System.out.println(car.getMake());
//			System.out.println(car.getModel());
//			System.out.println(car.getPrice());
////to string method in the object class is a better way to get a reader friendly output
//			System.out.println(car);
//		}
		
		LinkedList<Vehicle> vehicles1 = new LinkedList<Vehicle>();
		Vehicle vehicle3 = new Vehicle ("Toyota","Landcruiser", 32000, true);
		
		vehicles1.add(new Vehicle("Volkswagon", "Bus", 10000, false));
		vehicles1.add(vehicle3);
		vehicles1.add(new Vehicle("Subaru","Impreeza", 22000, false));
//		for(Vehicle car1 : vehicles1) {
//			System.out.println(car1);
//		}
		printElements(vehicles);
		printElements(vehicles1);
		printElements(animals);
	}
		public static void printElements(List someList) {
			for (int i = 0; i < someList.size(); i++ ) {
				System.out.println(someList.get(i));
			
		}
	}
}
