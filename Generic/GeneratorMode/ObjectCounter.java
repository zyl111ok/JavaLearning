public class ObjectCounter{
	
	private static int counter=0;
	private final int id=counter++;
	private int id(){return id;}
	public String toString(){
		return "ObjectCounter"+id;
	}
}