package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapProgram {
	//Java LinkedHashMap may have one null key and multiple null values.
	//Java LinkedHashMap maintains insertion order.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMapProgram mp=new LinkedHashMapProgram();
		mp.method();
		

	}

	private void method() {
		// TODO Auto-generated method stub
		 LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
		 m.put(3, "C");
		 m.put(1, "A");
		 m.put(5, "B");//values can repeat
		 m.put(2, "B");
		 m.put(4,"D");
		 m.put(1, "E");//removes duplicate key
		 m.put(null, null);
		 m.put(null, "G");//may have one null key 
		 m.put(null, "H");
		 m.put(9, null);//accepts multiple null values
		 m.put(10, null);

		for(Entry mp:m.entrySet()) {
			System.out.println(mp.getKey()+"  "+mp.getValue());
		}
		
		//m.entrySet();
		System.out.println(m.size());
		System.out.println(m.containsValue("A"));
		System.out.println(m.isEmpty());
		m.replace(5, "B", "Z");
		System.out.println(m);
		m.putIfAbsent(6, null);//accepts null value
		 System.out.println(m);
			
		 m.remove(2);
		 System.out.println(m);
		 m.remove(3, "C");
		 System.out.println(m);
			 
		 System.out.println("Keys"+m.keySet());
		 System.out.println("Values"+m.values());
		 System.out.println("Pair"+m.entrySet());
		 
		 
			 
			
			
			
			
			
			
			
			
			
		 
	
	}
	

}
