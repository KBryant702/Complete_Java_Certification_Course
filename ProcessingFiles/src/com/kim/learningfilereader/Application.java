
package com.kim.learningfilereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
	
		File file = new File("myFile.txt");
		//BufferedReader and FileReader no longer needed to be defined here now they are defined in the try with resources

		//Try with resources automatically closes these resources
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);){
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			//catches a reading or writing error(Input OutPut errors
		} catch (IOException e) {
			System.out.println("Problem reading the file" + file.getName());
			
		}
	}

}