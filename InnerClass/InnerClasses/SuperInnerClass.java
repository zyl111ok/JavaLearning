package InnerClasses;
import Interfaces.*;
public class SuperInnerClass{
	protected static void getImpls(){
		System.out.println("���Ǹ��ྲ̬����");
	}
	protected TestInterfaceImpl getImpl(){
		return new TestInterfaceImpl();
	}
	protected class TestInterfaceImpl implements TestInner{
		@Override 
		public void method(){
			System.out.println("����InnerClasses����ʵ��TestInterface�ӿڵ��ڲ���");
		}
	}
}