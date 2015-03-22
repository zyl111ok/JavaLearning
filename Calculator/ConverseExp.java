import java.util.*;
import java.util.regex.*;
public class ConverseExp{
	//ʹ��˳����ű��ʽ��ջ������ȡ��
	private List middleExpression=new ArrayList();
	private List backExpression=new ArrayList();
	String result;
	
	public ConverseExp(String input){
		//�ڹ��캯��������׺���ʽ���������
		middleExpression=CalculateUtil.getStringArray(input);
	}
	//����׺���ʽת��Ϊ��׺���ʽ
	public void getBackExpression(){
		OperatorStack os=new OperatorStack();
		String operator;
		int position=0;
		while(true){
			if(CalculateUtil.isOperator((String)middleExpression.get(position))){
				//���������������ţ�ֱ�Ӵ����������ջ
				if(os.top==-1||((String)middleExpression.get(position)).equals("(")){
					os.push((String)middleExpression.get(position));
				}
				//���������������ţ����������ջ����ӵ�˳����У�ֱ������������
				else if(((String)middleExpression.get(position)).equals(")")){
					while(!((String)os.getTop()).equals("(")){
							operator=(String)os.pop();
							backExpression.add(operator);
							
					}
					//����"("������
					os.pop();
				}
				//�����ǰ�������ջ������������ȼ��ͣ������ջ���������˳���������ǰ�����ѹ���������ջ
				else if(CalculateUtil.getPority((String)middleExpression.get(position))<=
				CalculateUtil.getPority((String)os.getTop())&&os.top!=-1){
					operator=(String)os.pop();
					if(!operator.equals("("))
					backExpression.add(operator);
					os.push((String)middleExpression.get(position));
				}
				else{
					os.push((String)middleExpression.get(position));
				}
				position++;
			}
			else{
				backExpression.add((String)middleExpression.get(position));
				position++;
			}
			if(position>=middleExpression.size()){
				break;
			}
		}
		while(os.top!=-1){
			operator=(String)os.pop();
			backExpression.add(operator);
		}
		
		System.out.println(backExpression);
	}
	
	public void getResult(){
		getBackExpression();
		String operator1,operator2,tmp,result=null;
		OperatorStack os=new OperatorStack();
		Iterator it=backExpression.iterator();
		while(it.hasNext()){
			tmp=(String)it.next();
			if(CalculateUtil.isOperator(tmp)){
				operator1=(String)os.pop();
				operator2=(String)os.pop();
				String tmpResult=CalculateUtil.twoOperate(tmp,operator1,operator2);
				os.push(tmpResult);
			}
			else{
				os.push(tmp);
			}
		}
		result=(String)os.pop();
		System.out.println(result);
	}
	
	
	
	public void printList(){
		System.out.println(middleExpression);
	}
	public static void main(String args[]){
		String testString="12/23.4+(32+4.3)*4+51";
		ConverseExp ce=new ConverseExp("12.2+(32.1+4)*4+5");
		//ce.getBackExpression();
		ce.getResult();
	}

}