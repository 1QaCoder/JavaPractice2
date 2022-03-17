package Collections;

import java.util.PriorityQueue;

public class QueueProgram {
//Java Queue interface orders the element in FIFO(First In First Out) manner.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueProgram q=new QueueProgram();
		q.mehtod();
		
	}

	private void mehtod() {
		PriorityQueue<String> q=new PriorityQueue<String>();  
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("C");
		q.add("D");
		System.out.println(q);
		
		//q.peek();//Retrieve head element
		System.out.println(q.peek());
		
		q.poll();//Retrieve and remove head element
		System.out.println(q);
		
		
		
		
	}

}
