public class Test{
	public volatile int inc=0;

	public void increase(){
		inc++;
	}

	public static void main(String args[]){
		final Test test=new Test();
		for(int i=0;i<10;i++){
			new Thread(){
				public void run(){
					for(int j=0;j<1000;j++)
						test.increase();
				};
			}.start();
		}

		while(Thread.activeCount()>1)//guarentee all the thread finished
			Thread.yield();
		System.out.println(test.inc);
	}
}