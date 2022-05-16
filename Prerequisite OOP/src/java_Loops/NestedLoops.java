package java_Loops;

public class NestedLoops {

	public static void main(String[] args) {
		
		int counter = 0;
		for(int idx = 0; idx < 100; idx++) {
			//it is easier to think of loops from inside out. Look at the inner most loop first
			for(int j = 0; j <10; j+=2) { // max two loops it slows down the program too much.
				System.out.println("the value of idx was " + idx + " value of j is " + j);
				counter++;
			}
		}
		System.out.println("Counter: "+ counter);
	}

}
