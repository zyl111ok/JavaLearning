/**
*��ĿҪ�󣺽��ַ�����ÿһ������ƽ��������װ���µ��ַ��� �磺��9119���811181 
*/
public class SquareDigit{
	
	public static int squareDigit(int n){
		
		StringBuilder str=new StringBuilder();
		String targetString=n+"";
		int[] target=new int[targetString.length()];
		
		for(int i=0;i<targetString.length();i++){
			target[i]=Integer.parseInt(targetString.substring(i,++i));
			str.append((int)Math.pow(target[--i],2)+"");
		}
		
		return Integer.parseInt(str.toString());
	}

	public static void main(String args[]){
		System.out.println(squareDigit(9119));
	}
}