public class StaticCreator{
	public static Product productFactory(String type){
		Product product=null;
		if(type.equals("bad")){
			product=new BadProduct();
		}
		else if(type.equals("good")){
			product=new GoodProduct();
		}
		return product;
	}
	public static void doSomething(String type){
		Product product=productFactory(type);
		if(product==null)
			System.out.println(" ‰»Î”–ŒÛ ");
		else
			product.getPrice();		
	}
}