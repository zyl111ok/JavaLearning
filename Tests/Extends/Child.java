/**
*Test static extends 
*/
public class Child extends Super{
	public static void main(String args[]){
		Super s=new Child();
		s.method1();
		Child.method2();
	}
}