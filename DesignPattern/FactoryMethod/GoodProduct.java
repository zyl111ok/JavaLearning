public class GoodProduct extends Product{
	private double price =100.0;
	@Override
	public void getPrice(){
		System.out.println("我的价格是: "+price);
	}
}