/**
*create new template instance by using reflect
*/
public class ClassAsFactory<T>{ 
	private T x;
	static {System.out.println("loading static field");}
	public ClassAsFactory(){
		System.out.println("no paramter constructor");
	}
	public ClassAsFactory(Class <T> kind){
		try{
			x=kind.newInstance();
			System.out.println(x);
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}