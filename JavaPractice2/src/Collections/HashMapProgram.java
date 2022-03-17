package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapProgram {

	public static void main(String[] args) {
		HashMapProgram mp=new HashMapProgram();
		mp.method();
		

	}

	private void method() {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> m=new HashMap<Integer,String>();
		 m.put(1, "A");
		 m.put(2, "B");
		 m.put(3, "C");
		  m.put(4, "D");
		 m.put(1, "E");//removes duplicate key
		 m.put(5, "B");//values can repeat
		 System.out.println(m);

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
		  HashMap<Integer,String> hmap=new HashMap<Integer,String>(); 
		  hmap.putAll(m);//copy key and values to another map
			System.out.println(hmap); 
			System.out.println(hmap.equals(m));
			
			m.remove(2);
			 System.out.println(m);
			 m.remove(3, "C");
			 System.out.println(m);
			 
			 
			
			
			
			
			
			
			
			
			
		 
	
	}

}
