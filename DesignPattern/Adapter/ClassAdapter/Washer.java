/**
*作为适配器对象
*/
public class Washer extends Chopstick implements Vaisselle{
	@Override 
	public synchronized void clean()throws Exception{
		while(washed)
			wait();
		washed=true;
	} 
}