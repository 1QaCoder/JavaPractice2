package Collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapProgram {
	//It provides an efficient means of storing key-value pairs in sorted order.
	
	
	public static void main(String[] args) {
		
		TreeMapProgram tm=new TreeMapProgram();
				tm.method();
		

	}

	private void method() {
		// TODO Auto-generated method stub
		 TreeMap<Integer,String> m=new TreeMap<Integer,String>();
		 m.put(3, "C");
		 m.put(1, "A");
		 m.put(5, "B");//values can repeat
		 m.put(2, "B");
		 m.put(4,"D");
		 m.put(1, "E");//removes duplicate key
		// Java TreeMap cannot have a null key but can have multiple null values.
		// m.put(null, null);
		 m.put(9, null);//accepts multiple null values
		 m.put(10, null);

		for(Entry mp:m.entrySet()) {
			System.out.println(mp.getKey()+"  "+mp.getValue());
		}
			 
		 System.out.println(m.descendingKeySet());
		 System.out.println(m.descendingMap());
		 System.out.println("HeadMap"+m.headMap(2));
		 System.out.println("tailMap"+m.tailMap(3));
		 System.out.println("SubMap"+m.subMap(2, false, 5, true));
		 
			 
			
			
			
			
			
			
			
			
			
		 
	
	}
	
	

}
