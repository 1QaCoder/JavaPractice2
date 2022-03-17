package AbstarctionInheritance;

public class ImplementationOfInteface implements Interfaces {
	
	public static void main(String[] args) {
		ImplementationOfInteface iOI=new ImplementationOfInteface();
	  System.out.println(iOI.id());
		
		iOI.name("Interface");
	}

	@Override //override all methods from interface 
	public int  id() {
		
		return 123;
	}

	@Override
	public void name(String n) { //implementation of methods 
		String nm=n;            //method body
		System.out.println(nm);
	}

}
