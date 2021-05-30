package com.vm.java.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Producerconsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> bq=new LinkedBlockingQueue<Integer>();
		Producer producer=new Producer(bq);
		Consumer consumer=new Consumer(bq);		
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
	
		

	}

}
