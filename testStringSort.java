import java.util.*;
import java.text.Collator;
/**
*对字符串排序的测试
*/
public class testStringSort{
	private static String s[]={"bbba","abc","abbc","abcc","bads"};
	private static String s1[]={"张三一","李四","张三","张三二"};
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
	*StringTokenizer不能用正则表达式匹配复杂的模式
	*/
	public static void testStringTokenizer(){
		String tmp="I am ,,, zhengyl";
		//这个构造方法使用默认分割符“\t\n\r\f”
		StringTokenizer stoke=new StringTokenizer(tmp);
		while(stoke.hasMoreElements()){
			System.out.print(stoke.nextToken()+" ");
		}
		System.out.println();
		//这个构造方法使用自定义分割符
		StringTokenizer newstoke=new StringTokenizer(tmp,",,,");
		while(newstoke.hasMoreElements()){
			System.out.print(newstoke.nextToken()+" ");
		}
		System.out.println();
		
	}
	
	
	public static void main(String args[]){
		
		//使用Comparator接口，强制将中文对象进行排序
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