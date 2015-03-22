package InnerClasses;
import Interfaces.*;
public class SuperInnerClass{
	protected static void getImpls(){
		System.out.println("这是父类静态方法");
	}
	protected TestInterfaceImpl getImpl(){
		return new TestInterfaceImpl();
	}
	protected class TestInterfaceImpl implements TestInner{
		@Override 
		public void method(){
			System.out.println("这是InnerClasses包中实现TestInterface接口的内部类");
		}
	}
}