public class BadProduct extends Product{
	private double price=0.1;
	@Override
	public void getPrice(){
		System.out.println("�ҵļ۸���: "+price);
	}
}