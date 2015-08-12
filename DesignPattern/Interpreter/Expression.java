/**
*解释器模式，模拟java对布尔表达式的操作求值
*抽象表达式模型
*/
public abstract class Expression{
	//本方法解释给定的任何一个表达式
	public abstract boolean interpret(Context ctx);
	//检查两个表达式结构上是否相同
	public abstract boolean equals(Object obj);
	//返回表达式的hashcode
	public abstract int hashCode();
	//将表达式转换为字符串
	public abstract String toString();
}