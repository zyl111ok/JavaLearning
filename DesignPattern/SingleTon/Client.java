public class Client{
	public static void main(String args[])throws Exception{
		SingleTon1 st11=SingleTon1.getInstance();
		SingleTon1 st12=SingleTon1.getInstance();

		SingleTon2 st21=SingleTon2.getInstance();
		SingleTon2 st22=SingleTon2.getInstance();

		SingleTon3 st31=SingleTon3.getInstance(null);
		SingleTon3 st32=SingleTon3.getInstance(null);

		if(st11.equals(st12))
			System.out.println("同一实例！");

		if(st21.equals(st22))
			System.out.println("同一实例！");

		if(st31.equals(st32))
			System.out.println("同一实例！");
	}
}