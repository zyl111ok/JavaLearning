public class InnerThread2{
	private int countDown=5;
	private Thread t;
	public InnerThread2(String name){
		t=new Thread(name){
			public void run(){
				try{
					while(true){
						System.out.println(this);
						if(--countDown==0)return;
						sleep(10);
					}
				}
				catch(InterruptedException e){
					System.out.println("interrupted");
				}
			}
			public String toString(){
				return getName()+": "+countDown;
			}
		};
		t.start();
	}
}