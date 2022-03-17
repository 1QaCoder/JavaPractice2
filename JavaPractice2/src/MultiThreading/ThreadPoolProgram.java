package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//A thread from the thread pool is pulled out and assigned a job by the service provider.
//After completion of the job, the thread is contained in the thread pool again.
//Better performance It saves time because there is no need to create a new thread.

public class ThreadPoolProgram implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		
		   ExecutorService ex = Executors.newFixedThreadPool(4);//creating a pool of 5 threads
		   for(int i=0;i<=10;i++){
			   Runnable worker = new ThreadPoolProgram();    
	            ex.execute(worker);//calling execute method of ExecutorService  
			   System.out.println("executing  "+ i + Thread.currentThread().getName());
			 
			   
		   }
		   ex.shutdown();
	        while (!ex.isTerminated()) {  System.out.println("executing Terminated"); 
	        
	        }  
	        
	  
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


}
