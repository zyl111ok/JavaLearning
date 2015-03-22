/**
*模板方法模式使用练习
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
				System.out.println("旋转");
			}
			else{
				System.out.println("不旋转");
			}
		}
		catch(ClassNotFoundException e){
			System.out.println("Class Not Found");
		}
	}
	
	public abstract String toString();
	
	protected abstract double doSquaring();
	
	private void testtoString(){System.out.println("字符串转换方法被执行");}
	
	private void testMethod(){System.out.println("求面积方法被执行");}
}