package com.Thread.classes;

public class ChildThreadDemo  extends Thread implements Runnable{
	
	public int intCount=0;
	public synchronized void Count()
	{
		
		intCount++;
		
	}
	
	@Override
	public void run() {
		int i = 0;
		while(i <= 10)
		{
			
			System.out.println("The value of i is " + i +"." + Thread.currentThread().getName());
			i++;
			Count();
			System.out.println("The count is " + intCount + ".");
		}
		
		
	}

	
	
}
