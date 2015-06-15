public class ConCreator extends Creator{
	@Override
	public Product productFactory(String type){
		Product product=null;
		if(type.equals("bad")){
			product=new BadProduct();
		}
		else if(type.equals("good")){
			product=new GoodProduct();
		}
		return product;
	}
}