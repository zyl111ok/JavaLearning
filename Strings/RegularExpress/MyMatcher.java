import java.util.*;
import java.util.regex.*;
public class MyMatcher{
	
	private static String testReplace="Hi my name is zhengyl";
	private List<String> regular;
	private String testReset="tom dog big";
	private String testString="Java now has regular expressions";
	//private String regExpression[]={"^Java"};//,"s?","s*","s+","s{4}","s{1}.","s{0,3}"};
	private String regExpression[]={"\\w+","s?","\\W+"};
	
	public void addList(){
		regular=new ArrayList<String>();
		for(int i=0;i<regExpression.length;i++){
			regular.add(regExpression[i]);
		}
	}
	
	private List<String> getList(){
		return regular;
	}
	/**
	*遍历整个列表,根据正则表达式进行匹配
	*/
	public void ergodicList(){
		
		Iterator iterator=this.getList().iterator();
		while(iterator.hasNext()){
			String tmp=(String)iterator.next();
			matcher(tmp,testString);
		}
	}
	/**
	*模式匹配字符串，将每一个匹配到的字符输出
	*/
	public void matcher(String reg,String test){
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(test);
		while(m.find()){
			System.out.print(m.group()+" "+m.start()+" "+(m.end()-1)+"");
		}
		System.out.println();
	}
	
	/**
	*按照所给的正则表达式切割字符串
	*/
	public void split(String regex){
		System.out.println(Arrays.toString(testString.split(regex)));
	}
	/**
	*按照所给的正则表达式替换相应的字符串
	*/
	
	public void replace(String regAll,String regFirst,String target){
		
		String tmpAll=target.replaceAll(regAll,"f");
		String tmpFirst=target.replaceFirst(regFirst,"f");
		System.out.println("replaceAll get: "+tmpAll);
		System.out.println("replaceFirst get: "+tmpFirst);
	}
	/**
	*测试Matcher的 reset()方法
	*/
	public void testReset(String newString){
		Matcher m=Pattern.compile("[tdb][oi][mg]").matcher(testReset);
		while(m.find()){
			System.out.print(m.group()+" ");
		}
		System.out.println();
		m.reset(newString);
		while(m.find()){
			System.out.print(m.group()+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		MyMatcher mc=new MyMatcher();
		mc.addList();
		mc.ergodicList();
		mc.split("[TVGJ]ava [^abcd]ow ");
		mc.split(" ");
		mc.matcher("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\b","Arline ate eight apples and one orange while Anita hadn't any");
		mc.replace("[aeiou]","[auy]",testReplace);
		mc.testReset("tim bog dig");
	}
}