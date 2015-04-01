import java.util.*;
public class Product{
	
	private final int id;
	private String description;
	private double price;
	
	public Product(int IDnumber,String desc,double price){
		
		id=IDnumber;
		description=desc;
		this.price=price;
		System.out.println(toString());
	}
	
	public String toString(){
		return id+":"+description+", price $"+price;
	}

	public void priceChange(double change){
		price+=change;
	}

	public static Generator<Product> generator=new Generator<Product>(){
		private Random rand=new Random(47);
		public Product next(){
			return new Product(rand.nextInt(1000),"test",Math.round(rand.nextDouble()*1000.0)+0.73);
		}
	};

}