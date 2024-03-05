package Count_thread;

import java.util.Iterator;

public class IncrementThread extends Thread{
	private Counter counter;
	private int incrementsThread;
	
	public IncrementThread(Counter counter, int incrementsThread) {
		this.counter = counter;
		this.incrementsThread = incrementsThread;
	}
	
	public void run() {
		for(int i=0; i < incrementsThread; i++) {
			try {
				counter.increment();
			} catch (InterruptedException e) {
				throw new RuntimeException();
			}
		}
	}


}
