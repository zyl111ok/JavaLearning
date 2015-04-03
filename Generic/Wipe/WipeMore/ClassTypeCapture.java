/**
*using this method to avoid wiping
*/
import java.util.*;
public class ClassTypeCapture<T> {
	Class<T> kind;
	public ClassTypeCapture(Class<T> kind){
		this.kind=kind;
	}
	public boolean f(Object arg){
		return kind.isInstance(arg);
	}
	public static  void print(Object obj){
		System.out.println(obj);
	}
	public static void main(String args[]){
		ClassTypeCapture<Building> ctc=new ClassTypeCapture(Building.class);
		print(ctc.f(new Building()));
		print(ctc.f(new House()));
		ClassTypeCapture<House> ctc1=new ClassTypeCapture(House.class);
		print(ctc1.f(new Building()));
		print(ctc1.f(new House()));
		String arg[]={"hello"," my name is curry"};
		Test.main(arg);

	}
}