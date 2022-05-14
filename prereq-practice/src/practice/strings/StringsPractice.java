package practice.strings;

public class StringsPractice {

	public static void main(String[] args) {
		// problem 1
//		String a = "hello";
//		
//		String str = "ABCDEFG";
//		String extractedString = str.substring(1);
//		
//		System.out.println(extractedString);

//	}
		// problem 2
//	String a = "hello";
//	String b = "there";
//	
//	if(!a.equals("hello")) {
//	}
//	if (b.equalsIgnoreCase("There")){
//		System.out.println("Printed there");
//	}
// problem 3 charAt index of a word
//		String a = "hello";
//		String b = "there";
//
//		a.charAt(3);
//		System.out.println(a.charAt(4));
		//problem 4
		//indexOf method indexOf(String s)  or can have it start at an index
//		String str = "Hello there yogi";
//		
//		int a = str.indexOf("there");
//		System.out.println(a);
//		//start at an index using indexOf(String_searching_for, index to start at)
//		String str1 = "Hello there yogi there";
//		
//		int b = str1.indexOf("there", 7);
//		System.out.println(b);
		
		//problem 5 last index of
		String str = "Hello there yogi there";
		int a = str.lastIndexOf("yogi");
		System.out.println(a);
		
//		String str = "Hello yogi there yogi there";
//		
//		int a = str.indexOf("yogi");
//		int b = str.lastIndexOf("yogi");
//		
//		System.out.println("Index of yogi " + a );
//		System.out.println("last index of yogi " + b );
//		
//			
	}

}
