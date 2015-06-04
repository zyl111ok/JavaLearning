import java.util.*;
import java.util.concurrent.TimeUnit.*;
import java.util.concurrent.*;
public class OrnamentalGarden{
	public static void main(String args[])throws Exception{
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exec.execute(new Entrance(i));
		Thread.sleep(3000);
		Entrance.cancel();
		exec.shutdown();
		if(!exec.awaitTermination(250,TimeUnit.MILLISECONDS))
			System.out.println("Some tasks were not terminated");
		System.out.println("Total: "+Entrance.getTotalCount());
		System.out.println("Sum of Entrances: "+Entrance.sumEntrances());
	}
}