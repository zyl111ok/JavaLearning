public class StringFormat{
	private static int i=12;
	private static float f=3.012f;
	private static double d=3.7982;
	private static char c='a';
	
	public static void main(String args[]){
		System.out.print(String.format("i: %d\n",i));
		System.out.print(String.format("f: %5.2f\n",f));
		System.out.print(String.format("d: %f\n",d));
		System.out.print(String.format("c£º%c\n",c));
	}

}