package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		//LinkedHashSet<String> set=new LinkedHashSet();  
		 LinkedHashSetProgram h=new LinkedHashSetProgram();
		 h.method();
		 
	}

	private void method() {
		LinkedHashSet<String> s=new LinkedHashSet<String>();
		s.add("Ani");
		s.add("Avi");
		s.add("John");
		s.add(null);//accepts null values
		s.add("Avi");//keep unique values
		s.add("John");
		for(String s1:s) {
			System.out.println(s1);
		}
		
	}

}
