package Exception;

public final class FinalFinally { //final class we cannot inherited
	
	//final	finally	finalize
	//final is the keyword and access modifier which is used to apply restrictions on a class, method or variable.
	//finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.
	//finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.
	
	

	public static void main(String[] args) {
		final int a= 20;
	//	a=30; give compile time error due to final keyword
		System.out.println(a);
		FinalFinally f=new FinalFinally();
		f.method();
		System.out.println("Address is- "+f.hashCode());//hash code is used to get stack address
		f=null;
		System.gc();
		System.out.println("Called garbege collector");
	//	System.out.println(" new Address is- "+f.hashCode());
		
	}
	final void method() {// final method we cannot override
		System.out.println("this is final method");
	}
	 // defining the finalize method   
    protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }     
	
	
}
