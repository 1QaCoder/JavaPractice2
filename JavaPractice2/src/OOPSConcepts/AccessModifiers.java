package OOPSConcepts;

public class AccessModifiers {

	public static void main(String[] args) {
		//4 types of access modifiers  public,protected,private ,default
		
		AccessModifiers a=new AccessModifiers();
		a.method();
		ObjectCreation m1=new ObjectCreation(); 
		m1.method2(); // public method can access globally
		m1.method();
		a.method5();
		}
		
	
	private void method() {
		System.out.println("Private method can only access within the class");
		
	}
	
	void method5() {
		System.out.println("Default access modifier scope is within package  ");
	}
}
