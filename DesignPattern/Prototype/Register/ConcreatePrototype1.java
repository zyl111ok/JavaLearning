public class ConcreatePrototype1 implements Prototype{
	private String name;
	public Prototype clone(){
		ConcreatePrototype1 prototype=new ConcreatePrototype1();
		prototype.setName(name);
		return prototype;
	}
	public String toString(){
		return "Now in Prototype1 ,name "+name;
	}
	@Override
	public String getName(){
		return name;
	}
	@Override
	public void setName(String name){
		this.name=name;
	}
}