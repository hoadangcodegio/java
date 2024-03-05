package Count_thread;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		int numThread = 6;
		int incrementsPerThread = 5;
		IncrementThread[] threads = new IncrementThread[numThread];
		
		
		for (int i=0; i < numThread; i++) {
			threads[i] = new IncrementThread(counter, incrementsPerThread);
			threads[i].start();
		}
	}

}
