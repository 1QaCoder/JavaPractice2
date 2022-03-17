package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingExample {
	//Multithreading in Java is a process of executing multiple threads simultaneously.
	//There are two ways to create a thread:
	//By extending Thread class
	//By implementing Runnable interface.
	
	
	public static void main(String[] args) throws InterruptedException {

		Thread t=new Thread();
		Thread t1=new Thread();
		Thread t2=new Thread();
		//System.out.println(t);
		// the start() method moves the thread to the active state  
		t.start(); 
		t.setName("Java");
		System.out.println(t.getName());
		t.setName("Hi");
		System.out.println(t.getName());
	//	t.run();
		
		//Thread.sleep(1000);//Thread.sleep() methods execute, it always halts the execution of the current thread.
		
		System.out.println("getid-"+t.getId());
		System.out.println("is Alive "+t.isAlive());
		System.out.println("get State "+t.getState());
		
		//Priority
		System.out.println("getPriority t-   "+t.getPriority());
		System.out.println("getPriority t1-   "+t1.getPriority());
		System.out.println("getPriority t2-   "+t2.getPriority());
		t.setPriority(9);
		t1.setPriority(4);
		t2.setPriority(8);
		System.out.println("getPriority t-   "+t.getPriority());
		System.out.println("getPriority t1-   "+t1.getPriority());
		System.out.println("getPriority t2-   "+t2.getPriority());
		
		t2.setDaemon(true);
		System.out.println(t2.isDaemon());
		
		   
		   
		
		
	}

}
