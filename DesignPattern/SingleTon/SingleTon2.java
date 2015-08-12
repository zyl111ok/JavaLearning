/**
*懒汉式单例模式，线程安全版
*/
public class SingleTon2{
	private static SingleTon2 instance=null;
	private SingleTon2(){}
	public static synchronized SingleTon2 getInstance(){
		if(instance==null){
				instance=new SingleTon2();
		}
		return instance;
	} 
}
