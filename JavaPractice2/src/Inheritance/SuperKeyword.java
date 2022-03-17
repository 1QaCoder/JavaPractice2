package Inheritance;

public class SuperKeyword extends  InheritanceParent{
	
	 // super keyword is use access the data from immediate parent class 
	 
	public void data() {
		System.out.println("child data()");
		super.data();// by using super keyword we are accessing parent method
		
	}
	
	void info(int age,String city) {
		age=25;
		city="NJ";
		System.out.println(" childs (int age,String city)");
		System.out.println(age+ "  "+city);
		super.info(0, null);
	}
	void job(int id) {
		id=12;
		System.out.println("childs Job");
		System.out.println(id);
		
	}
	
	void method() {
		 
		System.out.println(super.number); // invoking variable from parent variable
	}
	
	SuperKeyword(){
		super();// invoking parent class constructor method
		System.out.println("child constructor");
	}
	public static void main(String[] args) {
		
		SuperKeyword s=new  SuperKeyword();
		
		 s.method();
		 s.data();
		new  SuperKeyword();
		s.info(0,null);
		 
		
	}

}
