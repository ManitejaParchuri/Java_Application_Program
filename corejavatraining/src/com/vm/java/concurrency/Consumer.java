package com.vm.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> commenqueue;

	public Consumer(BlockingQueue<Integer> commenqueue) {
		super();
		this.commenqueue = commenqueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				System.out.println("Consumer :");
				System.out.println("Element  taken from is :"+commenqueue.take());
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
