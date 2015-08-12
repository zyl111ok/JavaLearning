/**
*判断一个四位数是否是吸血鬼数字的算法
*吸血鬼4位数字:自身选两个数字作为两位数，与另外两个数字组成的两位数之积为自身的数字 如1260=21*60
*/
public class VampireNum{
	/**
	*将一个四位数转换由各个位数字组成的字符串数组
	*/
	private static String[] parser(int num){
		String pos[]=new String[4];
		char c[]=new Integer(num).toString().toCharArray();
		for(int i=0;i<4;i++)
			pos[i]=c[i]+"";
		return pos;
	}
	/**
	*将数字重组成两位数
	*/
	private static int doubleDigit(String [] pos,int index1,int index2){
		String temp=pos[index1]+pos[index2];
		return Integer.parseInt(temp);
	}
	/**
	*判断一个四位数是否是吸血鬼数字
	*/
	private static boolean isVampire(int num){
		boolean isVampire=false;
		String pos[]=parser(num);
		outer:
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(j==i)continue;
				else{
					int m=0;
					while(m==i||m==j)
						m++;
					int n=0;
					while(n==i||n==j||n==m)
						n++;
					int forward=doubleDigit(pos,i,j);
					int backward1=doubleDigit(pos,m,n);
					int backward2=doubleDigit(pos,n,m);
					if(num==forward*backward1||num==forward*backward2){
						isVampire=true;
						break outer;
					}
				}
			}
		}
		return isVampire;
		
	}
	public static void main(String args[]){
		System.out.print("四位数吸血鬼数字有: ");
		for(int i=1000;i<10000;i++){	
			if(isVampire(i))
				System.out.print(i+" ");
		}
		System.out.println();

	}
}