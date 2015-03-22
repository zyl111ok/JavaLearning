import java.util.*;
import java.text.Collator;
/**
*���ַ�������Ĳ���
*/
public class testStringSort{
	private static String s[]={"bbba","abc","abbc","abcc","bads"};
	private static String s1[]={"����һ","����","����","������"};
	public static void testSortString(){
		Arrays.sort(s);
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	public static void testSortChineseNotCompartored(){
		Arrays.sort(s1);
		for(int i=0;i<s1.length;i++){
			System.out.print(s1[i]+" ");
		}
		System.out.println();
	}
	/**
	*StringTokenizer������������ʽƥ�临�ӵ�ģʽ
	*/
	public static void testStringTokenizer(){
		String tmp="I am ,,, zhengyl";
		//������췽��ʹ��Ĭ�Ϸָ����\t\n\r\f��
		StringTokenizer stoke=new StringTokenizer(tmp);
		while(stoke.hasMoreElements()){
			System.out.print(stoke.nextToken()+" ");
		}
		System.out.println();
		//������췽��ʹ���Զ���ָ��
		StringTokenizer newstoke=new StringTokenizer(tmp,",,,");
		while(newstoke.hasMoreElements()){
			System.out.print(newstoke.nextToken()+" ");
		}
		System.out.println();
		
	}
	
	
	public static void main(String args[]){
		
		//ʹ��Comparator�ӿڣ�ǿ�ƽ����Ķ����������
		testSortString();
		testSortChineseNotCompartored();
		Comparator<Object> cmp=Collator.getInstance(java.util.Locale.CHINA);
		
		Arrays.sort(s1,cmp);
		for(int i=0;i<s1.length;i++){
			System.out.print(s1[i]+" ");
		}
		System.out.println();
		testStringTokenizer();
	}
}