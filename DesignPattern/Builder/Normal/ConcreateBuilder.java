public class ConcreateBuilder implements Builder{
	private Product product=new Product();
	@Override
	public void buildPart1(){
		product.setPart1("±àºÅXXX");
	}
	@Override
	public void buildPart2(){
		product.setPart2("Ãû³ÆXXX");
	}
	@Override
	public Product retrieveProduct(){
		return product;
	}
}