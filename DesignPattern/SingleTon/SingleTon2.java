/**
*����ʽ����ģʽ���̰߳�ȫ��
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
