package processingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		Scanner Input
//		for (int i = 0; i <=3; i++ ) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter some Text: ");
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
//		
//		}
		// read from file
		try {
			File file = new File("MyFile.txt");
			Scanner input;

			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			//e.printStackTrace();

		}
		MYFileUtils myUtil = new MYFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(9));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
