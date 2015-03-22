/**
*为转换并计算后缀表达式方法类提供工具的类
*/
import java.util.*;
public class CalculateUtil{
	/**
	*该方法用来判断给出的字符是否是操作符
	*/
	public static boolean isOperator(String str){
		
		if(str.equals("+")||str.equals("-")||str.equals("(")||str.equals(")")
			||str.equals("*")||str.equals("/"))
		return true;
		else
		return false;
	}
	/**
	*该方法用于判断运算符的优先级
	*/
	public static int getPority(String str){
		
		if(str.equals("+")||str.equals("-")){
			return 1;
		}
		else if(str.equals("/")||str.equals("*")){
			return 2;
		}
		else if(str.equals("(")||str.equals(")")){
			return -1;
		}
		else
			return 0;
	}
	/**
	*将栈顶取出的两个数进行运算
	*/
	
	public static String twoOperate(String operator,String top1,String top2){
		
		String op=operator;
		double x=Double.parseDouble(top1);
		double y=Double.parseDouble(top2);
		double z=0;
		
		switch(operator){
			case "+":
			z=x+y;
			break;
			case "-":
			z=x-y;
			break;
			case "*":
			z=x*y;
			break;
			case "/":
			z=x/y;
			break;
			default:
			z=0;
		}
		return z+"";
		
	}
	/**
	*将字符串表达式转换成所需要的动态数组，并实现了数字合并
	*/
	public static List getStringArray(String input){
		char [] tmpChar=input.toCharArray();
		List<String> list=new ArrayList<String>(); 
		StringBuffer str=new StringBuffer();
		int index=0;
		int stringIndex=0;
		while(index<tmpChar.length){
			if(tmpChar[index]!='+'&&tmpChar[index]!='-'&&tmpChar[index]!='('&&tmpChar[index]!=')'&&tmpChar[index]!='*'&&tmpChar[index]!='/'){
					str=new StringBuffer();
					//把数字合并（1 2 3合并成123，1 . 3合并成1.3）
					while(tmpChar[index]!='+'&&tmpChar[index]!='-'&&tmpChar[index]!='('&&tmpChar[index]!=')'&&tmpChar[index]!='*'&&tmpChar[index]!='/'){
						str.append(tmpChar[index]);
						index++;
						if(index==tmpChar.length){
							break;
						}	
					}
					list.add(str.toString());
			}
			else{
				list.add(tmpChar[index]+"");
				index++;
			}
		}
		System.out.println(list);
		return list;
	}
}