public class ConcreatePrototype implements Prototype{
	private String name;
	public Prototype clone(){
		ConcreatePrototype prototype=new ConcreatePrototype();
		prototype.setName(name);
		return prototype;
	}
	public String toString(){
		return "Now in Prototype ,name "+name;
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