public class BadProduct extends Product{
	private double price=0.1;
	@Override
	public void getPrice(){
		System.out.println("我的价格是: "+price);
	}
}