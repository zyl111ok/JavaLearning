public class TestExchange{
	
	public static void main(String args[]){
		int a=100,b=50;
		int arr[]={a,b};
		System.out.println(String.format("转换前:a= %d,b= %d",a,b));
		swap(a,b);
		System.out.println(String.format("值传递交换: a=%d,b=%d",a,b));
		swapPointer(a,b);
		System.out.println(String.format("包装类传递交换 a=%d,b=%d",a,b));
		swap(arr);
		System.out.print("数组传递交换 :");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	//包装类交换
	public static void swapPointer(Integer a,Integer b){
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	
	//值传递交换
	public static void swap(int a,int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	//数组传递交换
	public static void swap(int []arr){
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
}