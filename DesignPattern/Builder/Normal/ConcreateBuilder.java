public class ConcreateBuilder implements Builder{
	private Product product=new Product();
	@Override
	public void buildPart1(){
		product.setPart1("���XXX");
	}
	@Override
	public void buildPart2(){
		product.setPart2("����XXX");
	}
	@Override
	public Product retrieveProduct(){
		return product;
	}
}