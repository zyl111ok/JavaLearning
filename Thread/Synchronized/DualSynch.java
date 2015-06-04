public class DualSynch{
	private Object syncObject=new Object();
	public synchronized void f(){
		for(int i=0;i<5;i++){
			System.out.println("f()");
			Thread.yield();
		}
	}
	public synchronized void h(){
		for(int i=0;i<5;i++){
			System.out.println("h()");
			Thread.yield();
		}
	}
	public void g(){
		synchronized(syncObject){
			for(int i=0;i<5;i++){
				System.out.println("g()");
				Thread.yield();
			}
		}
	}
}
