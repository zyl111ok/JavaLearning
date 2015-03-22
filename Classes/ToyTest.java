interface HasBatteries{}
interface Waterproof {}
interface Shoots{}
interface Brake{}

class Toy{
	static{ToyTest.println("静态区域被加载");}
	Toy(){ToyTest.println("Line 6:父类构造器被调用");}
	Toy(int i){System.out.println("Line 7:父类构造器被调用");}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots,Brake{
	FancyToy(){super(1);}
}

public class ToyTest{
	protected static void println(String s){
		System.out.println(s);
	}
	private static void printInfo(Class<?> cc){
		println("Class name: "+cc.getName()+" is interface?["+cc.isInterface()+"]");
		println("Simple name: "+cc.getSimpleName());
	}
	public static void main(String args[]){
		Class<?> c=null;
		try{
			c=Class.forName("FancyToy");
			Object obj=c.newInstance();
		}
		catch(ClassNotFoundException e){
			println("Class Not Found");
			System.exit(1);
		}
		catch(InstantiationException e){
			println("Cannot instantiate");
		}
		catch(IllegalAccessException e){
			println("Cannot access");
		}
		printInfo(c);
		for(Class<?> l:c.getInterfaces()){
			printInfo(l);
		}
		Class<?> up=c.getSuperclass();
		Object obj=null;
		try{
			obj=up.newInstance();
		}
		catch(InstantiationException e){
			println("Cannot instantiate");
			System.exit(1);
		}
		catch(IllegalAccessException e){
			println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
	
}