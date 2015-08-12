public class ConcreatePrototype extends Prototype{
	@Override
	public Prototype clone(){
		Prototype prototype=new ConcreatePrototype();
		return prototype;
	}
}