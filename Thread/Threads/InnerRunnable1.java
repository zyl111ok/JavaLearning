public class InnerRunnable1{
	private int countDown=5;
	private Inner inner;
	private class Inner implements Runnable{
		Thread t;
		Inner(String name){
			t=new Thread(this,name);
			t.start();
		}
		public void run(){
			try{
				while(true){
					System.out.println(this);
					if(--countDown==0) return;
					Thread.sleep(10);
				}
			}
			catch(InterruptedException e){
				System.out.println("interruptedException");
			}
		}
		public String toString(){
			return t.getName()+": "+countDown;
		}
	}
	public InnerRunnable1(String name){
		inner=new Inner(name);
	}
}