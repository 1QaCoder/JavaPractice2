package Inheritance;

public class InheritanceParent extends InheritanceA{
	int number=500;
	public void data() {
		System.out.println("parentdata()");
		
		
	}
	
	void info(int age,String city) {
		age=45;
		city="NJ";
		System.out.println(" parentFetures(int age,String city)");
		System.out.println(age+ "  "+city);
	}
	void job(int id) {
		id=12345;
		System.out.println("parentJob");
		System.out.println(id);
	}
	
	  InheritanceParent() {
		System.out.println("parent class constructor");
	}
}
