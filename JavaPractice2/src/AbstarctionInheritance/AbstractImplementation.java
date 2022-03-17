package AbstarctionInheritance;

public class AbstractImplementation extends AbstractClass {
	void test() {
		System.out.println("this is test method from AbstractClass");
	}
	public static void main(String[] args) {
		AbstractClass a=new AbstractImplementation();
		a.test();
		a.test2();
		

	}

}
