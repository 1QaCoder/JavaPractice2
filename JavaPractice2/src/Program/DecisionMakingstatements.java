package Program;

public class DecisionMakingstatements {

	public static void main(String[] args) {
		int a=10;
		String s="Java";
		boolean b= true;
		//if statement
		if(b)
			System.out.println("b is true");
		System.out.println("-------------------------------------------------------");
		
		//if else statement
		if(a==20)
			System.out.println("a is equal to 20");
		else
			System.out.println("a is not equal to 20");
		System.out.println("-------------------------------------------------------");
		
		//nested if elseif else statement
		if(a==20)
			System.out.println("a is equal to 20");
		else if(a==30)
			System.out.println("a is equal to 30");
		else if(a==20)
			System.out.println("a is equal to 40");
		else
			System.out.println("value of a is 10");
		System.out.println("-------------------------------------------------------");
		
		//Switch statement
		switch(s){
			case "python":
				System.out.println("its python");
				break;
			case "javaScript":
				System.out.println("javaScript");
				break;
			case "selenium":
				System.out.println("selenium");
				break;
			default:
				System.out.println(s);
				
			
		}

	}

}
