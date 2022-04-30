package Java_Basics;

import someOtherPackage.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {
		MyUtils.printSomeJunk(87);
//		System.out.println("PrintLine method");
		System.out.println(MyUtils.printSomeJunk("Print Junk"));

//		MyUtils.sum2Numbers(10, 23);
		int myvar = MyUtils.add10(99)+1000-50;
//		System.out.println(myvar);
		
		ExampleClass.doSomething();
	}

	
	
	
}
