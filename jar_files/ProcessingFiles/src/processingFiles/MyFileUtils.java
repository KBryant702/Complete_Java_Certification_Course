package processingFiles;

public class MyFileUtils {
	public int subtract10FromLargerNumber (int number) throws FooRuntimeException{
		if(number <10) {
			throw new FooRuntimeException("The number passed was smaller than 10");
		}
		return number - 10;
	}
	//define my own exception class
	public class FooRuntimeException extends Exception{
		public FooRuntimeException(String message) {
			super(message);
		}
	}
}
