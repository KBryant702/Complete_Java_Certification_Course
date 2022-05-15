package loopsProject;

public class LoopsPractice {

	public static void main(String[] args) {
	 String str = "We have a large inventory of things in our warehouse falling in "+
	"the category:apparel and the slightly " +
			 "more in demand category:makeup along with the category:furniture and... ";
// use substring (String start, String end)
	 //indexOf(String s, int i)
	 //while(true) {}
	 printCategories(str);
	
	}
	
	public static void printCategories(String str) {
		int i = 0;
		while(true) {
			int found = str.indexOf("category:", i);
			if (found == -1) break;
			int start = found +9; //start of actual category
			int end = str.indexOf(" ", start);
			
			System.out.println(str.substring(start, end));
			i = end +1;
		}
	}
}
