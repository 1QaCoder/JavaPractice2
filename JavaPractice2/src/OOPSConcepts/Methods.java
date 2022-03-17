package OOPSConcepts;

public class Methods {

	public static void main(String[] args) {
		//2 types of methods 
		//1 predefined method
		System.out.println("System.out.println() is predefined  method");
		// 2 user deefined method
		Methods m=new Methods();
		m.method();
	}
	void method() {
		System.out.println("when User creates method - called UserDefined method ");
	}
}
