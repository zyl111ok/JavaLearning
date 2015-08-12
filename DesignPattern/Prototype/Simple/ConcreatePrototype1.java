public class ConcreatePrototype1 extends Prototype{
	@Override
	public Prototype clone(){
		Prototype prototype=new ConcreatePrototype1();
		return prototype;
	}
}