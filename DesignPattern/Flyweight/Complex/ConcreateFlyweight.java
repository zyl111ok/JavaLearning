public class ConcreateFlyweight implements Flyweight{
	private Character intrinsicState=null;

	public ConcreateFlyweight(Character state){
		this.intrinsicState=state;
	}

	public void operation(String state){
		System.out.println("Intrinsic state= "+this.intrinsicState);
		System.out.println("Extrinsic state= "+state);
	}
}