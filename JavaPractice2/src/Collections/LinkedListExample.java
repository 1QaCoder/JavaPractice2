package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    //java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure
	//Java LinkedList class can be used as a list, stack or queue.
	private void method() {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Apple");
		l.add("Orange");
		l.add(1,"Kiwi");//value added at first index
		l.addFirst("Berry");// value added at first 
		l.addLast("Grapes");// value added at last
		System.out.println(l);
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("11");//add method to add element
		l1.add("22");
		l.addAll(0, l1);//to add one  list to another  
		System.out.println(l);
		
		l.remove(1);// remove 1 index element
		System.out.println(l);
		l.removeFirst();//remove first element
		System.out.println(l);
		l.clear();//clear the list
		System.out.println("-----"+l);
		
		
	}
	
	public static void main(String[] args) {
		LinkedListExample ll=new LinkedListExample();
		ll.method();

	}

	

}
