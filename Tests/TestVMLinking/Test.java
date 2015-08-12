public class Test{
	public static void main(String args[]){
		SingleTon singleTon=SingleTon.getInstance();
		System.out.println("count1="+singleTon.count1);
		System.out.println("count2="+singleTon.count2);
	}
}