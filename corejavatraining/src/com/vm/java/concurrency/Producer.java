package com.vm.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Producer  implements Runnable{

	
	BlockingQueue<Integer> commenqueue;

	public Producer(BlockingQueue<Integer> commenqueue) {
		super();
		this.commenqueue = commenqueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		{
			System.out.println("PRODUCER :");
			commenqueue.add(i);
			System.out.println("element add"+i);
			System.out.println("queue elements are"+commenqueue);
			System.out.println("+++++++++++");
			
		}
		
	}
	

}
