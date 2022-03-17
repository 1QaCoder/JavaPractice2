package OOPSConcepts;

public class ConstructorsExample {
	int x,y,z;
	String s;
	 ConstructorsExample() { //default constructor
		 System.out.println("default consructor");
		
	}
	ConstructorsExample(int a,int b) { //parameterized constructor
		x=a;
		y=b;
		int  c=a+b;
		System.out.println(c);
		
	}

	public int ConstructorsExample() {
		int a=20;
	return a;
	}
	void display() {
		//this.ConstructorsExample();
		System.out.println("="+this.ConstructorsExample());
	}
	ConstructorsExample(String s,int z,int y ) { //constructor with diffrent data type
	this.s="hi";
	this.z=z;
	this.y=y;
	
	}

	void display1( ) {
		//this.ConstructorsExample();
		
		System.out.println(s);
		System.out.println(y);
		System.out.println(z);
	}

	public static void main(String[] args) {
		ConstructorsExample e=new ConstructorsExample();
		new ConstructorsExample(12,20);
		
		
		e.display();
		ConstructorsExample e2=new ConstructorsExample("h",1,2);
		e2.display1();
	}

}
