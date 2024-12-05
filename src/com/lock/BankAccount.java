package com.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private int balance = 100;
	private Lock lock = new ReentrantLock();

	// Before lock

	/*
	 * // public synchronized void withdraw(int amount) { //
	 * System.out.println(Thread.currentThread().getName() +
	 * " attempting to withdraw " + amount); // if (balance >= amount) { //
	 * System.out.println(Thread.currentThread().getName() +
	 * " proceeding with withdraw "); // // try { // Thread.sleep(3000); // } catch
	 * (InterruptedException e) { // System.out.println(e.getMessage()); // } // //
	 * balance -= amount; // System.out // .println(Thread.currentThread().getName()
	 * + " completed withdrawl . Remaning balance:  " + balance); // } else { //
	 * System.out.println(Thread.currentThread().getName() +
	 * " insufficient balance"); // } // }
	 */

	public void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
		try {
			if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
				if (balance >= amount) {
					try {
						System.out.println(Thread.currentThread().getName() + " proceeding with withdraw ");
						Thread.sleep(3000);
						balance -= amount;
						System.out.println(Thread.currentThread().getName()
								+ " completed withdrawl . Remaning balance:  " + balance);
					} catch (Exception e) {
						Thread.currentThread().interrupt();
					} finally {
						lock.unlock();
					}
				}

				else {
					System.out.println(Thread.currentThread().getName() + " insufficient balance");
				}
			} else {
				System.out.println(Thread.currentThread().getName() + " counld not acquire the lock we will try later");
			}
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}
}
