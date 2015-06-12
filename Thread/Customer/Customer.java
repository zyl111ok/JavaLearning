public class Customer implements Runnable{
	private Restaurant restaurant;
	public Customer(Restaurant restaurant){this.restaurant=restaurant;}
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized(this){
					while(restaurant.food==null){
						wait();
					}
				}
				System.out.println("Customer got "+restaurant.food);
				synchronized(restaurant.prod){
					restaurant.food=null;
					restaurant.prod.notifyAll();
				}
			}
		}catch(InterruptedException e){
			System.out.println("Customer Interrupted");
		}
	}
}