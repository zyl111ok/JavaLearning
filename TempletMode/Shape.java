/**
*ģ�巽��ģʽʹ����ϰ
*/
public abstract class Shape{
	
	public Shape(){}
	
	public final double getSquaring(){
		testMethod();
		return doSquaring();
	}
	
	public final String draw(){
		testtoString();
		return this+"";
	}
	
	public final void rotate(Shape s){
		try{
			Class<?> c=Class.forName(""+s);
			if(c.getSimpleName().equals("Circle")){
				System.out.println("��ת");
			}
			else{
				System.out.println("����ת");
			}
		}
		catch(ClassNotFoundException e){
			System.out.println("Class Not Found");
		}
	}
	
	public abstract String toString();
	
	protected abstract double doSquaring();
	
	private void testtoString(){System.out.println("�ַ���ת��������ִ��");}
	
	private void testMethod(){System.out.println("�����������ִ��");}
}