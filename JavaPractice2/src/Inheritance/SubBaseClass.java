package Inheritance;

public class SubBaseClass extends BaseClass {

	
	int id;
	
	@Override
	public void method() {
		System.out.println("This method() from SubBase class");
	}
	
	void subBaseMethod() {
		System.out.println("This suBaseMethod() from subBase class");
	}
}
