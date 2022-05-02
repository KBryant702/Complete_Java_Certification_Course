package Java_Basics;

//import someOtherPackage.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {
	//public access 
		//static means it belongs to this class not instance of this class.
		// void means no return method needed
		//When method is not static you must create instance of it.
		MyUtils myVar; // class called as the data type
		myVar = new MyUtils(); //required to call non static method
		//static variables should be accessed in a static way
		MyUtils. printSomeJunk(20);
		//invoke non static method.
		myVar.add10(10);
		
		
		
		
		
		
//		MyUtils.printSomeJunk(87);
////		System.out.println("PrintLine method");
//		System.out.println(MyUtils.printSomeJunk("Print Junk"));
//
////		MyUtils.sum2Numbers(10, 23);
//		int myvar = MyUtils.add10(99)+1000-50;
////		System.out.println(myvar);
//		
//		ExampleClass.doSomething();
	}

	
	
	
}
