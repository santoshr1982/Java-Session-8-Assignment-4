package com.Thread.classes;

public class MainClass extends Thread{

public static void main(String[] args) throws InterruptedException {
		
		//Creating the object for the Priority class which implements the runnable interface.
		ChildThreadDemo objThread1 = new ChildThreadDemo();
		
		//Creating the object for new threads and passing the parameter of the object of the class.
		Thread T1 = new Thread(objThread1);
		Thread T2 = new Thread(objThread1);
		
		
		//Starting all the threads.
		T1.start();
		T2.start();
		
		T1.join();
		T2.join();
		
		
	}
	
}
