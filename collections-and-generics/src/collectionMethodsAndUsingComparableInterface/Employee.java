package collectionMethodsAndUsingComparableInterface;

/*Sorting Data
User Defined types get tricky - User defined has to specify how we want the data to be sorted
User Defined Types need comparable interface and compareTo method*/
public class Employee implements Comparable<Employee>{
 String name;
 int salary;
 String department;
public Employee(String name, int salary, String department) {
	super();
	this.name = name;
	this.salary = salary;
	this.department = department;
}
//Where we specify the order employees get sorted into

@Override
public int compareTo(Employee o) {
	if(this.salary < o.salary) {
		return -1;
	}else if(this.salary > o.salary) {
		return 1;
	}
	return 0;
}
// don't forget ToString method for user friendly output
@Override
public String toString() {
	return "Employee [name = " + name + ", salary = " + salary + ", department = " + department + "]";
}

 
}
