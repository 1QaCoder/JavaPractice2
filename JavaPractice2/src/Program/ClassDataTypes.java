package Program;

import org.w3c.dom.TypeInfo;

public class ClassDataTypes { //created a class -class className

	public static void main(String[] args) {
		//Mainly 2 types of data type
		//primitive data type 
		int  a=10;
		System.out.println(a +" integer data type");
		System.out.println(((Object)a).getClass().getName());
	 
		System.out.println();
		char c='C';  
		System.out.println(c+" char data type");
		System.out.println(((Object)c).getClass().getName());
		System.out.println();
		
		float f=10.5f;
		System.out.println(f+" float data type");
		System.out.println(((Object)f).getClass().getName());
		System.out.println();
		
		double d=10000000.5;
		System.out.println(d+" double data type");
		System.out.println(((Object)d).getClass().getName());
		System.out.println();
		
		boolean t= true; //true or false
		System.out.println(t+" boolean data type");
		System.out.println(((Object)t).getClass().getName());
		System.out.println();
		
		
		//non-primitive data type 
		String s="Hello";
		System.out.println(s+" String data type");
		System.out.println(((Object)s).getClass().getName());
		System.out.println();
	}

}
