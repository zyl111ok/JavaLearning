public class Teacher extends Person{
	private static int counter=0;
	private final int id=counter++;
	public String toString(){
		return "Teacher"+id;
	}
}
