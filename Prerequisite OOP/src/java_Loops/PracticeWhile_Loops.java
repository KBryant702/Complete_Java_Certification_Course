package java_Loops;

public class PracticeWhile_Loops {

	public static void main(String[] args) {
		//first lesson
		//structure of a while loop :    while (test_is_true) { do_this_body}
		//while loop I tried on my own
//		int count = 0;
//		
//		
//		while(count <= 10) {
//			System.out.println("Kim " + count);
//			count++;
//		}
		//while loop example
		int count = 0;
		
		
		while(count <= 100) {
			System.out.println("Kim is Looping " + count);
			count = count +1;
			
			if(count == 30) {
			break;
			}
		}
	}

}
