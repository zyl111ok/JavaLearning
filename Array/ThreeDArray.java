import java.util.*;
public class ThreeDArray{
	public static void raggedArray(){
		Random rand=new Random(47);
		int [][][]a=new int[rand.nextInt(7)][][];
		for(int j=0;j<a.length;j++){
			a[j]=new int[rand.nextInt(5)][];
			for(int i=0;i<a[j].length;i++){
				a[j][i]=new int[rand.nextInt(5)];
				for(int k=0;k<a[j][i].length;k++){
					a[j][i][k]=rand.nextInt(5);
				}
			}
		}
		System.out.println(Arrays.deepToString(a));
	}
	public static void main(String args[]){
		raggedArray();
		int [][][] a=new int[2][2][4];
		System.out.println(Arrays.deepToString(a));
	}
}