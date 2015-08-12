/**
*变量的非法向前引用练习
*/
public class TestStaticValueInit{
	static{
		//可以这样直接赋值，但是不能访问它
		i=0;
		//这句话会提示"非法向前引用"
		System.out.println(i);
	}
	static int i=1;
}