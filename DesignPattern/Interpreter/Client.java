/**
*解释器模式，模拟java对布尔表达式的操作求值
*客户端模型
*/
public class Client{
	public static void main(String args[]){
		Context ctx=new Context();
		Variable a=new Variable("a");
		Variable b=new Variable("b");
		Constant c=new Constant(true);
		Constant d=new Constant(false);
		ctx.assign(a,true);
		ctx.assign(b,false);

		Expression exp=new Or(new Or(d,a),new And(b,new And(c,new Not(b))));
		System.out.println("a="+a.interpret(ctx));
		System.out.println("b="+b.interpret(ctx));
		System.out.println(exp.toString()+"="+exp.interpret(ctx));
	}
}