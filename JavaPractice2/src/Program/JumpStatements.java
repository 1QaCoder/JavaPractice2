package Program;

public class JumpStatements {

	public static void main(String[] args) {
		int a=10;
		String s="Java";
		boolean b= true;
		//break 
		for (int i=0;i<=5;i++) {
			
			if(i<=2) {
				System.out.println("inside the loop");
			break;
			}
			System.out.println("out of the loop ----value of i "+i);
		}
		
		
		System.out.println("-------------------------------------------------------");
		
		//Continue
		for (int i=0;i<=5;i++) {
			
			if(i<=2) {
				System.out.println("now inside the loop");
			continue;
			}
			System.out.println("out of the loop ---value of i "+i);
		}
		
		
		
	}

}
