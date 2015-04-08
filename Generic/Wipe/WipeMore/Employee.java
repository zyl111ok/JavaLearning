public class Employee{
	private static int count=0;
	private final int id=count++;

	public String toString(){
		return this.getClass().getSimpleName()+"  "+id;
	}
}