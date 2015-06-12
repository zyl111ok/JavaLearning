public class WaxOn implements Runnable{
	private Car car;
	public WaxOn(Car c){car=c;}
	public void run(){
		try{
			while(!Thread.interrupted()){
				System.out.print("Wax On! ");
				Thread.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		}catch(InterruptedException e){
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax On task");
	}
}