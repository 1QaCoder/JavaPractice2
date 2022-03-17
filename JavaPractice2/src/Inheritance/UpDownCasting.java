package Inheritance;

public class UpDownCasting {

	public static void main(String[] args) {
		//Upcasting and Downcasting uses in inheritance
		//Upcasting -can done implicitly -access the parent class members but not all from child's class
		BaseClass b=new SubBaseClass();
		
		b.s="Welcome"; 
		System.out.println(b.s);
		b.baseMethod();
		b.method(); //executes subBase class method or child class method
		
		
		//DownCasting -can done explicitly -access the parent class members and child's class members 
		 SubBaseClass sb=(SubBaseClass)b;
		 sb.s="Hello";
			System.out.println(sb.s);
			
			sb.baseMethod();
			
		sb.id=24;
		System.out.println(sb.id);
		
		
		sb.subBaseMethod();
		
		sb.method();//executes subbase class method/ child method- overrides the method 
		
		
	}

}
