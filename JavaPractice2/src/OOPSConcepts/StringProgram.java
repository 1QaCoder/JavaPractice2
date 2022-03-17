package OOPSConcepts;

public class StringProgram {

	public static void main(String[] args) {
		// string is basically an object that represents sequence of char values.
		
		// String literal
		String s="java";
		String j="JAVA";
		
		//string object by using new keyword
		String s1=new String(" Welcome");
		System.out.println(s1.charAt(2));//get the char at 2 place
		
		//string has different methods length,concat ,compareTo
		String s3=s1+s; //Concatenation
		System.out.println(s3);
		
		String s4=s.concat(s1);//Concatenation
		System.out.println(s4);
		
		System.out.println(s.equalsIgnoreCase(j));//true 
		System.out.println(s.equals(j));//false
		System.out.println(s.compareTo(j));//false
		String[]a=s1.split("e");
		for(String b:a) {
		System.out.println(b);
		}
		
		
		
		

	}

}
