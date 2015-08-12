/**
*饿汉式单例模式
*/
public class SingleTon1 {
	private SingleTon1(){}
	private static final SingleTon1 instance=new SingleTon1();
	public static SingleTon1 getInstance(){
		return instance;
	} 
}