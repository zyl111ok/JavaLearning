public class Inits{
	public void method(){
		int x;
		//编译器报错:局部变量没有被初始化就使用
		//局部变量在定义式不会被赋值为默认值
		System.out.println(""+x);
	}
}