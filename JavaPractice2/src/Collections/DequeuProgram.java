package Collections;


import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuProgram {
	//java Dedue Interface is a linear collection that supports element insertion and removal at both ends.
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DequeuProgram d=new  DequeuProgram();
		 d.method();
	}

	private void method() {
		 Deque<String> d = new ArrayDeque<String>();  
		 d.add("A");
			d.add("B");
			d.add("C");
			d.add("C");
			d.add("D");
			System.out.println(d);
			
			//d.peek();//Retrieve head element
			System.out.println(d.peek());
			
			d.poll();//Retrieve and remove head element
			System.out.println(d);	
			
			d.addFirst("Z");
			System.out.println(d);	
			System.out.println(d.getFirst());
			System.out.println(d);	
			d.offerFirst("Y");
			System.out.println(d.peekFirst());
			System.out.println(d);	
			System.out.println(d.pollFirst());
			
			System.out.println(d);	
			
			d.addLast("M");
			System.out.println(d);	
			d.pollLast();
			System.out.println(d);	
			
	}

}
