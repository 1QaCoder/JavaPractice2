package Collections;

import java.util.HashSet;

public class HashSetProgram {
//The initial default capacity of HashSet is 16
	
	
		public static void main(String []arg) {
			 HashSetProgram h=new HashSetProgram();
			 
			h.method();
			
			}

		private void method() {
			HashSet<String> s=new HashSet<String>();
			s.add("Ani");
			s.add("Avi");
			s.add("John");
			s.add(null);//accepts null values
			s.add("Avi");//manage duplicate values
			s.add("John");
			for(String s1:s) {
				System.out.println(s1);
			}
			System.out.println(s.size());
//			s.spliterator();
//			System.out.println(s);
		
	
		}
			

	

}
