package AbstarctionInheritance;

public abstract class AbstractClass {// abstract class
	//A class which is declared with the abstract keyword is known as an abstract class in Java. 
	//It can have abstract and non-abstract methods (method with the body).
	abstract void test(); //abstract method
	
	AbstractClass(){ //constructor 
		System.out.println("this is constructor");
	}
	
	void test2() { //non abstract method
		System.out.println("this is test 2 method");
	}
	
	
	
	

}
