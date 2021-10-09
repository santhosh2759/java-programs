package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {

	public static void main(String[] args) {
		Callable<Integer> callable = new MyCallable();
		FutureTask<Integer> task = new FutureTask<>(callable);
		Thread t = new Thread(task);
		t.start();
		try {
			Integer integer = task.get();
			System.out.println(integer);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}

class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("Callable executed.....");
		return 1;
	}
	
}
