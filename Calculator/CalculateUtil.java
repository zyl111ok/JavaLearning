/**
*Ϊת���������׺���ʽ�������ṩ���ߵ���
*/
import java.util.*;
public class CalculateUtil{
	/**
	*�÷��������жϸ������ַ��Ƿ��ǲ�����
	*/
	public static boolean isOperator(String str){
		
		if(str.equals("+")||str.equals("-")||str.equals("(")||str.equals(")")
			||str.equals("*")||str.equals("/"))
		return true;
		else
		return false;
	}
	/**
	*�÷��������ж�����������ȼ�
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
	*��ջ��ȡ������������������
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
	*���ַ������ʽת��������Ҫ�Ķ�̬���飬��ʵ�������ֺϲ�
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
					//�����ֺϲ���1 2 3�ϲ���123��1 . 3�ϲ���1.3��
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