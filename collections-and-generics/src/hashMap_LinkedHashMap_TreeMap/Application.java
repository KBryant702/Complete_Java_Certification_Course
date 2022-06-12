package hashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		
		/*TreeMap maintains natural order of the entries. With String that is alphabetical order, Numbers it numerical order.
		  
		 */
		TreeMap<String, String> dictionary = new TreeMap<String, String>();
		dictionary.put("Brave", " ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exeptionally clever or talented");
		dictionary.put("Joy", "a feeling of great pleasure and happiness");
		dictionary.put("Confidence", "the state of feelin certain about the truth of something.");
	
	
		for(Map.Entry<String, String> entry :dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}

		
	}
		
		/* LinkedHasMap is similar to a HashMap but it preserves the order of insertion*/
//		LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
//		dictionary.put("Brave", " ready to face and endure danger or pain; showing courage.");
//		dictionary.put("Brilliant", "exeptionally clever or talented");
//		dictionary.put("Joy", "a feeling of great pleasure and happiness");
//		dictionary.put("Confidence", "the state of feelin certain about the truth of something.");
	
//		for(String word : dictionary.keySet()){
//			System.out.println(dictionary.get(word));
//		}
//		for(Map.Entry<String, String> entry :dictionary.entrySet()) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
//		
//	}
//}
		
	/*HashMap
	 * HashMap data structure is like a dictionary with words and their definitions. Referred to as a key value store, meaning keys and values, 
	 * keys point to values like words point to their definitions. Key would be the words and definition would be the value
	 * keys and values together are called an entry set.
	 * Every row of data is considered an entry. No Primitive data types allowed in the angle brackets.
	 * There is no preserved order in a HashMap  with the results but a LinkedHashMap preserves the order*/
	
	
		
		/*Inside angle brackets <identify the key, then the data type for the value> Words are Strings and so are the definitions*/
//		HashMap<String, String> dictionary = new HashMap<String, String>();
//		dictionary.put("Brave", " ready to face and endure danger or pain; showing courage.");
//		dictionary.put("Brilliant", "exeptionally clever or talented");
//		dictionary.put("Joy", "a feeling of great pleasure and happiness");
//		dictionary.put("Confidence", "the state of feelin certain about the truth of something.");
//		
	/*Can't use dictionary to iterate over. have use the dictionary dot to invoke the key set method. */
//		//.keySet makes it possible to iterate over the keysets in a HashMap.
//		for(String word : dictionary.keySet()){
//			System.out.println(word + ": " + dictionary.get(word));
//		}
//		
//		
//	}
//}
