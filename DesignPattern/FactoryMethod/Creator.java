public abstract class Creator{
	public abstract Product productFactory(String type);
	public void doSomething(String type){
		Product product=productFactory(type);
		if(product==null)
			System.out.println(" ‰»Î”–ŒÛØØ");
		else
			product.getPrice();
	}
}