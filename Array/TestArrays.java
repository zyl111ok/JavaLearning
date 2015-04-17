import java.util.*;
public class TestArrays{
	public static void main(String args[]){
		int i[] =new int[7];
		int j[] =new int[10];
		int p[] =new int[7];

		Arrays.fill(i,10);
		System.out.println(Arrays.toString(i));
		System.arraycopy(i,1,j,3,i.length-1);
		System.arraycopy(i,0,p,0,i.length);
		System.out.println(Arrays.equals(i,p));
		System.out.println(Arrays.toString(j));
	}
}