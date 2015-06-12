public class Producer implements Runnable{
	private int count=0;
	private Restaurant restaurant;
	public Producer(Restaurant restaurant){
		this.restaurant=restaurant;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized(this){
					while(restaurant.food!=null){
						wait();
					}
				}
				if(++count==10){
					System.out.println("Out of food, closing");
					restaurant.exec.shutdownNow();
				}
				System.out.print("Order up!  ");
				synchronized(restaurant.cust){
					restaurant.food=new Food(count);
					restaurant.cust.notifyAll();
				}
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Producer Interrupted!");
		}
	}
}