public class Fabonacci{
	private static int Fabonaccis(int n){
		if(n==1||n==2)
			return 1;
		else if(n>0)
			return Fabonaccis(n-1)+Fabonaccis(n-2);
		else{
			System.out.println("ÊäÈë´íÎó");
			return -1;
		}
	}
	private static void print(String num){
		int k=Integer.parseInt(num);
		for(int i=1;i<=k;i++)
			System.out.print(Fabonaccis(i)+" ");
	}
	public static void main(String args[]){
		print(args[0]);
		System.out.println();
		byte a='9';
		System.out.println(a);

	}
}