package Program;

public class UnaryOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		boolean c=true;
		//unary operator
		a++; //postfix
		System.out.println(a);
		b--;  //postfix
		System.out.println(b);
		++a;  //pretfix
		--b; //pretfix
		System.out.println(a);
		System.out.println(b);	
		
		System.out.println(~a);//tilda changes to negative add by one
		System.out.println(~-b);//tilda changes negative to positive reduce value by one 
		System.out.println(!c);// negation 
		
	}

}
