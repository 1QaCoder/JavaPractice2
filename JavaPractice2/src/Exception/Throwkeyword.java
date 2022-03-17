package Exception;

import java.io.IOException;

public class Throwkeyword {
	//In Java, exceptions allows us to write good quality codes where the errors are checked at the compile time instead of runtime.
	//The Java throw keyword is used to throw an exception explicitly.
	public static void main(String[] args) throws Throwable {
		
		Throwkeyword t=new Throwkeyword();
	
		t.method1();
		t.method();
		}

	private void method() {
		int a=1;
		if(a>10) {
			System.out.println("a>10");
		}
		else {
		 throw new ArithmeticException("its not valid");  
		}
	}
	
	
	//The Java throws keyword is used to declare an exception.
	// throws keyword is used to handle checked exception like IOException.....
	private void method1() throws IOException {
		System.out.println("this is method1");	
		
	}
	
}
