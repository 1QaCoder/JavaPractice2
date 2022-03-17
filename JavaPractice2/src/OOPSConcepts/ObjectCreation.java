package OOPSConcepts;

public class ObjectCreation {
	
	int a,b,c;
	String name;
	public static void main(String arg[]) {
		ObjectCreation m1=new ObjectCreation(); //m1 is reference variable of class ObjectCreation --
		m1.method1();
	
		new ObjectCreation().method2(); //Anonymous object creation
		
		System.out.println(new ObjectCreation().method2());
		m1.getData(10,"Java");
		m1.setData();
		ObjectCreation m2=new ObjectCreation();// can create multiple objects for single class 
		m2.getData(20, "Hi"); //get the values from method  
		m2.setData();//set values to variables
	}

	
	public void method1() { // void method with no parameters
		System.out.println("this is method 1");
	}
	
	public int method2() { //method with return value
		System.out.println("this is method 2");
		return 20;
	}
	
	public void getData(int i,String s) { //void method with parameters
		a=i;
		name=s;
		
	}
		
	public void  setData() {
		
		System.out.println(	a +"  "+name);
	}
		
		protected void  method() {
		
			System.out.println("Protected method can be accessible within the  package");
	}
}
