package java_Loops;

public class NestedLoops {

	public static void main(String[] args) {
		
		for(int idx = 0; idx < 10; idx++) {
			
			for(int j = 0; j <10; j+=2) {
				for(int i = 0; i <1; i++) {
				System.out.println("the value of idx was " + idx + " value of j is " + j + " value of i is "+ i);
				}
			}
		}
	}

}
