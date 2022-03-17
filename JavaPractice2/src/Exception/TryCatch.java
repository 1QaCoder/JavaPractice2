package Exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		-EXCEPTIONAL HANDLING 
//		- try,catch,throw,throws,finally.
		
		//The Exception Handling in Java is one of the powerful mechanism to handle the 
		//runtime errors so that the normal flow of the application can be maintained.
		
		//1) Checked Exception- Checked exceptions are checked at compile-time.
		//2) Unchecked Exception-Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
		//3)Errors-Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.
		{	try {
				int a=10/0;
				System.out.println(a);
				
			}
			catch(ArithmeticException e) {
				System.out.println("Its Arithmatic Exception");
			}
		  System.out.println("-------------------------");    
		}
		
		try {
			int []a=new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("Its Arithmatic Exception");//multiple catch blocks
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Its Array IndexOut OfBounds Exception");
		}
		  catch(Exception e)  
        {  
         System.out.println(" Exception occurs");  
        }             
     System.out.println("-------------------------");    
     
     //Java finally block is always executed whether an exception is handled or not.
     //Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.
     
     
     //catch block is handling the exception 
      try {
    	 String s=null;
    	 int i=Integer.parseInt(s);
    	 System.out.println(i);	 
     }
     catch(NumberFormatException e) {	 
    	 System.out.println("Its Number Format Exception");
     }
     finally {
    	 System.out.println("1......Its always printed whether catch blocks hanndles the exception or not");
     }

   	//catch block is not handling the exception 
     {	try {
			int a=10/0;
			System.out.println(a);
			
		}
		catch(NullPointerException e) {
			System.out.println("Its null poinetr Exception");
		}
     		finally {
    	 System.out.println("2....Its always printed whether catch blocks hanndles the exception or not");
     	}
	}

     
     
     
     
     
     
     
     
	}

}
