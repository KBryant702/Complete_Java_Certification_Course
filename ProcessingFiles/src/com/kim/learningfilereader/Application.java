package com.kim.learningfilereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
	
		File file = new File("myFile5.txt");
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader(file);
			//buffers characters into lines from the file reader object reading line by line
			bufferedReader = new BufferedReader(fileReader);
			
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
		}finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Unable to close file" + file.getName());
			}
		}
	}

}
