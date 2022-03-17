package Program;

public class LoopStatements {

	public static void main(String[] args) {
		int i[]= {10,20,30,40,50};
		char []s={'A','B','C','D','E'};
		
		
		//for loop 
		for(int b=0;b<=4;b++)
		{
			System.out.println(i[b]);
		}
		System.out.println("-------------------------------------------------------");
		
		//do while loop
		int a=0;
		do {
			 
			 System.out.println("value of a is "+a); 
			 System.out.println(i[a]); 
			 a++;
			
		}while(a<=3);
		System.out.println("-------------------------------------------------------");
		
		//while loop
		int b=0;
		while(s[4]>=s[b]){
			
			 System.out.println("value of b is "+b); 
			 System.out.println(s[b]); 
			 if(b==4)
				 break;
			 b++;
			 
			}
		System.out.println("-------------------------------------------------------");
		
		
		
		
		
	}

	

}
