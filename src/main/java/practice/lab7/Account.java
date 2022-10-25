package practice.lab7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double balance;

//	private Lock lock = new ReentrantLock();

    /**
     *
     * @param money
     */
    public synchronized void deposit(double money) {
        try {
//			lock.lock();
			double newBalance = balance + money;
			try {
			    Thread.sleep(10);   // Simulating this service takes some processing time
			}
			catch(InterruptedException ex) {
			    ex.printStackTrace();
			}
			balance = newBalance;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			lock.unlock(); // 确保释放锁，从而避免发生死锁。
//		}

    }


    public double getBalance() {
        return balance;
    }
}