package com.kim.learningfilereader;

class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		//should contain closing behaviors here
		
		
		System.out.println("Closing!");
	}
	
}
public class Application2 {

	public static void main(String[] args) {

		try(MyClass var = new MyClass();){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
