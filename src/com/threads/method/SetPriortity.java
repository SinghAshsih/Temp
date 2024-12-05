package com.threads.method;

public class SetPriortity extends Thread {
	public SetPriortity(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "   - Priority : "
					+ Thread.currentThread().getPriority() + "  - Count:  " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SetPriortity low = new SetPriortity("Low Priority Thread");
		SetPriortity medium = new SetPriortity("Medium Priority Thread");
		SetPriortity high = new SetPriortity("High Priority Thread");
		low.setPriority(MAX_PRIORITY);
		medium.setPriority(NORM_PRIORITY);
		high.setPriority(MAX_PRIORITY);
		low.start();
		medium.start();
		high.start();
	}
}
