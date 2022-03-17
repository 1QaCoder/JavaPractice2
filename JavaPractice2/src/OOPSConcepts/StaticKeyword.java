package OOPSConcepts;

public class StaticKeyword {
	static int a=10;//static variable
	static {System.out.println("static block");} //static block invoked
	public static void main(String[] args) {
	
		System.out.println(a);
		method();// can call method without creating an object 
		
		

	}
	
	static void method() { //static method
		System.out.println("this is static method");
	}

}
