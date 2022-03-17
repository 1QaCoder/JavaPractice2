package OOPSConcepts;

public class ThisNewKeyword {
	int a;
	String s;
	public static void main(String[] args) {
		//this keyword is used to invoke current  class variables or constructor methods/variables
		ThisNewKeyword t=new ThisNewKeyword(); //new keyword is used to create an instance of the class .whenever we use new keyword it allocates memory to the object 
		t.method(10, "hello");
		t.display();
		
		new ThisNewKeyword(20); //
		
	}
	
	void method(int a,String s) {
		this.a=a;
		this.s=s;
		
	}
	void display() {
		System.out.println(a+"   "+s);
	}
	
	
	ThisNewKeyword(){
		System.out.println("this is constructor");
	}
	ThisNewKeyword(int m){
		this(); // here this() calls the ThisKeyword() constructor 
		System.out.println("this is  parameterized constructor  " +m);
	}
	
}
