import java.util.concurrent.*;
import java.util.*;
public class ActiveObjectDemo{
	private ExecutorService ex=Executors.newSingleThreadExecutor();
	private Random rand=new Random(47);
	private void pause(int fator){
		try{
			Thread.sleep(100+rand.nextInt(fator));
		}catch(InterruptedException e){
			System.out.println("sleep() interrupted");
		}
	}
	public Future<Integer> calculateInt(final int x,final int y){
		return ex.submit(new Callable<Integer>(){
			public Integer call(){
				System.out.println("starting "+x+" + "+y);
				pause(500);
				return x+y;
			}
		});
	}
	public Future<Float> calculateFloat(final float x,final float y){
		return ex.submit(new Callable<Float>(){
			public Float call(){
				System.out.println("starting "+x+" + "+y);
				pause(2000);
				return x+y;
			}
		});
	}
	public void shutdown(){ex.shutdown();}
	public static void main(String args[]){
		ActiveObjectDemo d1=new ActiveObjectDemo();
		List<Future<?>> results=new CopyOnWriteArrayList<Future<?>>();
		for(float f=0.0f;f<1.0f;f+=0.2f)
			results.add(d1.calculateFloat(f,f));
		for(int i=0;i<5;i++)
			results.add(d1.calculateInt(i,i));
		System.out.println("All asych calls made");
		while(results.size()>0){
			for(Future<?> f:results)
				if(f.isDone()){
					try{
						System.out.println(f.get());
					}catch(Exception e){
						throw new RuntimeException(e);
					}
					results.remove(f);
				}
		}
		d1.shutdown();
	}
}