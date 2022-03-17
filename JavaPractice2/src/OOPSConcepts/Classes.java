package OOPSConcepts;

public class Classes { //declaration- class className 

	public static void main(String[] args) {
	Classes c= new Classes();//object created to access methods from the  same class	
	c.method1();
	
	ObjectCreation m1=new ObjectCreation(); //object created to access methods from the ObjectCreation class
	m1.method2();
	}
	

	public void method1() { // void method with no parameters
		System.out.println("this is method 1");
	}
	

}

