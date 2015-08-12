/**
*筷子类作为被适配对象
*/
public class Chopstick{
	protected boolean taken=false;
	protected boolean washed=true;
	public synchronized void take()throws InterruptedException{
		while(taken)
			wait();
		taken=true;
	}
	public synchronized void drop()throws InterruptedException{
		taken=false;
		washed=false;
		notifyAll();
	}
}