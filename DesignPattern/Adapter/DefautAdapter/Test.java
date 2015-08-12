public class Test{
	public static void main(String args[]){
		AbstractService as=new ServiceAdapee();
		System.out.println(as.serviceOperation3()+as.serviceOperation2());
	}
}