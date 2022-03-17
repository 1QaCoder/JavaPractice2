package Program;

public class LogicalAndBitwiseOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d=a+b;
		System.out.println(a>b); // bitwise > operator
		System.out.println(a<b); // bitwise > operator
		System.out.println(c=a); // bitwise = operator
		System.out.println(d==c); // to compare values  == operator
		
		// Logical Operators
		//Logical And 
		System.out.println(a>b && a>c); // false && false = flase
		System.out.println(a>b && a<c); // false && true = flase
		System.out.println(a<b && a>c); // true && false = flase
		System.out.println(a<b && a<c); // true && true = true
		
		//Logical OR ||
		System.out.println(a>b || a>c); // false && false = flase
		System.out.println(a>b || a<c); // false && true= true
		System.out.println(a<b || a>c); // true && false = true
		System.out.println(a<b || a<c); // true && true = true
		
	}

}
