package java_Loops;

public class SteppingThruLoopDebugger {

	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int i = 0; i <=100; i++) {
			System.out.println(i);
			int temp = counter +1;
			counter = temp;
		}

	}

}