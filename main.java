import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class main {

	public static void main(String[] args) {

		System.out.println("Start");
		
		for (int i = 0; i < 25; i++) {
			Runnable T1 = new MyThread(10000L + i);
			Runnable T2 = new MyThread(10000L + 2*i);
			
			System.out.println("Starting Executor!");
			
			ExecutorService threadExcecutor = Executors.newCachedThreadPool();
		     
		    threadExcecutor.execute(T1);
		    threadExcecutor.execute(T2);
		     
			Thread diceRoll = new Thread(T1);
			diceRoll.start();

		}
		System.out.println("Complete");
	}

}
