package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapProgram {
	//A map contains values on the basis of key, i.e. key and value pair. 
	//Each key and value pair is known as an entry. A Map contains unique keys.
	 // Map map=new HashMap();  
	
	public static void main(String[] args) {
		MapProgram mp=new MapProgram();
		mp.method();
		

	}

	private void method() {
		// TODO Auto-generated method stub
		 Map<Integer,String> m=new HashMap<Integer,String>();
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
		System.out.println(m.containsValue("F"));
		System.out.println(m.isEmpty());
		m.replace(5, "B", "Z");
		System.out.println(m);
		
		
		 
	}

}
