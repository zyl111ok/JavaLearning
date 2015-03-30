public class TestExchange{
	
	public static void main(String args[]){
		int a=100,b=50;
		int arr[]={a,b};
		System.out.println(String.format("ת��ǰ:a= %d,b= %d",a,b));
		swap(a,b);
		System.out.println(String.format("ֵ���ݽ���: a=%d,b=%d",a,b));
		swapPointer(a,b);
		System.out.println(String.format("��װ�ഫ�ݽ��� a=%d,b=%d",a,b));
		swap(arr);
		System.out.print("���鴫�ݽ��� :");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	//��װ�ཻ��
	public static void swapPointer(Integer a,Integer b){
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	
	//ֵ���ݽ���
	public static void swap(int a,int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	//���鴫�ݽ���
	public static void swap(int []arr){
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
}