/**
*�ж�һ����λ���Ƿ�����Ѫ�����ֵ��㷨
*��Ѫ��4λ����:����ѡ����������Ϊ��λ��������������������ɵ���λ��֮��Ϊ��������� ��1260=21*60
*/
public class VampireNum{
	/**
	*��һ����λ��ת���ɸ���λ������ɵ��ַ�������
	*/
	private static String[] parser(int num){
		String pos[]=new String[4];
		char c[]=new Integer(num).toString().toCharArray();
		for(int i=0;i<4;i++)
			pos[i]=c[i]+"";
		return pos;
	}
	/**
	*�������������λ��
	*/
	private static int doubleDigit(String [] pos,int index1,int index2){
		String temp=pos[index1]+pos[index2];
		return Integer.parseInt(temp);
	}
	/**
	*�ж�һ����λ���Ƿ�����Ѫ������
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
		System.out.print("��λ����Ѫ��������: ");
		for(int i=1000;i<10000;i++){	
			if(isVampire(i))
				System.out.print(i+" ");
		}
		System.out.println();

	}
}