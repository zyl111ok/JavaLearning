/**
*java反射机制练习
*/
import java.lang.reflect.*;
public class TestReflect{
	/**
	*得到目标类的属性
	*/
	public Object getProperty(Object owner,String fieldName)throws Exception{
		
		Class c=owner.getClass();
		Field field=c.getDeclaredField(fieldName);
		Object property=field.get(c);
		
		return property;
	}
	
	public Object invokeMethod(Object owner,String methodName,Object[] args)throws Exception{
		Class c=owner.getClass();
		Class[] argsClass=new Class[args.length];
		
		for(int i=0;i<args.length;i++){
			argsClass[i]=args[i].getClass();
		}
		Method method=c.getMethod(methodName,argsClass);
		
		return method.invoke(owner,args);
	}
	
	public static void main(String args[]){
		
		TestReflect t=new TestReflect();
		Object []ids=new Object[]{1,2,3.4};
		Class c;
		try{
			 c=Class.forName("Reflector");
			 System.out.printlpn(t.invokeMethod(c.getConstructor(int.class).newInstance(5),"Calculate",ids));
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}