package Polymorphosm;

import Inheritance.BaseClass;
import Inheritance.SubBaseClass;

public class MethodOverrideing extends BaseClass {//for method overriding we need to extend child class to parent class 
	//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
	
	public static void main(String[] args) {
		//creating object of child class
		MethodOverrideing mo=new MethodOverrideing();
		mo.method();//Accessing methods which are present in parent class
		mo.baseMethod();
		s="String";
		System.out.println(s);
	}

}
