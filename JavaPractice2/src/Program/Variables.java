package Program;

public class Variables {
	
	static int s=10;
	public static void main(String[] args) {
		System.out.println(s +" static variable");
		
		
		int a=20;
			System.out.println(a+"  instance variable");
			Variables v=new Variables();
			v.num();

	}
	
	void num() {
		int b=30;
		System.out.println(b +" local variable");
	}

}
