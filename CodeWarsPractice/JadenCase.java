import java.util.*;
/**
*将给定字符串按照单词分割并且每个单词的首字母大写
*/
public class JadenCase{
	public static String toJadenCase(String phrase){
	  if(phrase==""||phrase==null){
		return null;
	  }
		else{
			String str=phrase;
			StringBuilder strBuilder=new StringBuilder();
			String [] strArray=str.split(" ");
    
			for(String temp:strArray){
				String s=temp.substring(0,1);
				String s1=s.toUpperCase();
				int length=temp.length();
				String result=s1+temp.substring(1,length);
				strBuilder.append(result+" ");
			}
			return strBuilder.toString();
		}
	}
	
	public static void main(String args[]){
		System.out.println(toJadenCase("most trees are blue"));
	}
}