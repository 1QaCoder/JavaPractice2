package Collections;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetProgram {
	//Java Treearr class doesn't allow null element.
	//Java Treearr class is non synchronized.
	//Java Treearr class maintains ascending order.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSetProgram t=new TreeSetProgram();
		t.method();
		

	}

	private void method() {
		TreeSet<Integer> arr=new TreeSet<Integer>();
		arr.add(11);
		arr.add(12);
		arr.add(15);
		arr.add(11);
		arr.add(8);
		arr.add(10);
		System.out.println(arr);
		
		arr.pollFirst();//remove the first value
		System.out.println(arr);
		arr.pollLast();//to remove last value
		System.out.println(arr);
	
//		
//		  Iterator i=arr.descendingIterator();  
//	         while(i.hasNext())  
//	         {  
//	             System.out.println(i.next());  
//	         }  
	     	
	         
	         System.out.println("Intial arr: "+arr);  
	           
	         System.out.println("Head arr: "+arr.headSet(11));  
	          
	         System.out.println("Subarr: "+arr.subSet(8,12));  
	           
	         System.out.println("Tailarr: "+arr.tailSet(11));  
	         
	         
	         
	         
	         
	         
	}

}
