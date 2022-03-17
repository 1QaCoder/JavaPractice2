package Polymorphosm;


public class MethodOverloading {
	
	//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
	
//	There are two ways to overload the method in java
//	By changing number of arguments
//	By changing the data type
	
	int a,b;
	
	public void method() { //method with no arguments no parameters
		System.out.println("simple method");
		
	}
	public void method(int a,String s) { //method with parameters
		a=10;
		s="java";
		System.out.println(a+" "+s);
		
	}
	
	public int method(int a,int b) { //method with parameters and argument returns a vlue
		this.a=a;
		this.b=b;
		return a+b;
		
	}
	
	public String  method(String s) { //method with single parameter
		 s="welcome";
		 return s;
	
	}
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.method();
		System.out.println(mo.method(11,12));
		System.out.println(mo.method(null));
		mo.method(0, null);
		
	}

}
