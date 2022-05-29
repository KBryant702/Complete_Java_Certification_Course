package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {

		// Scanner class
//		for (int i = 0; i <= 3; i++) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter some Text");
//			String enteredText = input.nextLine();
//			System.out.println(enteredText);
//		}
		// File class
		try {
			File file = new File("myFile.txt");
			Scanner input;

			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
