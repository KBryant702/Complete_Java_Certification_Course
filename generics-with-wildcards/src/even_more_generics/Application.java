package even_more_generics;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		//List of Employees not Accountants
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		
		//List of Accountants not a list of Employees
		ArrayList<Accountant> accountants = new ArrayList<Accountant>();
		accountants.add(new Accountant());
	//Throws a type mistmatch  Error
		// employees = accountants;
		
		//Legal java code with Wildcard
		//Most flexible wildcard use but all items are treated as Objects. More like raw type scenario
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<Accountant> accountants2 = new ArrayList<Accountant>();
		employees2 = accountants2;
		
		//Upper Bound
		//List that accepts data from type employee and children of employee. 
		//Employee is the Upper Bound. It is the highest type that can go into this list
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<Accountant>();
		employees3 = accountants3;
		
		//Lower Bound
		//Prevents subclasses from making it into the list. Only Employees or parent classes of employee(like object)
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		ArrayList<Object> accountants4 = new ArrayList<Object>();
		employees4 = accountants4;
		
		makeEmployeeWork(accountants);
	
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Accountant emp : (ArrayList<Accountant>)employees) {
			emp.work();
		}
	}
}
		
		
		
		
		/*1. Traditional polymorphism cant be thought of the same way when dealing with generic classes.*/
//		Object myObject = new Object();
//		String myVar = "hello";
//		myObject = myVar;
//		
//		
//		Employee emp = new Employee();
//		Accountant acc = new Accountant();
//		emp = acc;
//		
//	}
//}
