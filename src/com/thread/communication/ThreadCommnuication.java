package com.thread.communication;

class SharedResource {
	private int data;
	private boolean hasData;

	public synchronized void produce(int value) {
		while (hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
			}

		}
		data = value;
		hasData = true;
		System.out.println("Produce:  " + value);
		notify();
	}

	public synchronized int consumer() {
		while (!hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
			}
		}
		hasData = false;
		System.out.println("Consumed: " + data);
		notify();
		return data;
	}
}

class Producer implements Runnable {
	private SharedResource resource;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			resource.consumer();

		}
	}

	public Producer(SharedResource resource) {
		this.resource = resource;
	}

}

class Consumer implements Runnable {
	private SharedResource resource;

	public Consumer(SharedResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			resource.produce(i);

		}
	}
}

public class ThreadCommnuication {
	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();
		Thread produceThread = new Thread(new Producer(sharedResource));
		Thread consumeThread = new Thread(new Consumer(sharedResource));
		produceThread.start();
		consumeThread.start();

	}
}
