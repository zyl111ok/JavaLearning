public class FlyweightPattern{
	private Flyweight fly1,fly2,fly3,fly4,fly5;
	private FlyWeightFactory factory=new FlyWeightFactory();
	public FlyweightPattern(){
		fly1=factory.getFlyweight(2);
		fly2=factory.getFlyweight(2);
		fly3=factory.getFlyweight("hello");
		fly4=factory.getFlyweight("hello");
		fly5=factory.getFlyweight("hello");
	}
	public void showPattern(){
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		System.out.println("objectSize :"+factory.FlyWeightFactorySize());
	}
	public static void main(String args[]){
		FlyweightPattern flypattern=new FlyweightPattern();
		flypattern.showPattern();
	}

}