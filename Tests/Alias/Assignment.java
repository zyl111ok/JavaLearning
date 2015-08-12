/**
*引用别名测试
*/
public class Assignment{
	public static void main(String args[]){
		Tank t1=new Tank();
		Tank t2=new Tank();

		t1.level=9;
		t2.level=4;

		System.out.println("t1 level: "+t1.level+", t2 level: "+t2.level);

		//引用赋值以后，t1原来包含的指向值为9的对象的引用被覆盖,gc会进行清理
		t1=t2;
		System.out.println("t1 level: "+t1.level+", t2 level: "+t2.level);

		t1.level=27;
		System.out.println("t1 level: "+t1.level+", t2 level: "+t2.level);
	}
}