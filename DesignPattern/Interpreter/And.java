/**
*解释器模式，模拟java对布尔表达式的操作求值
*非终结符表达式模型
*/
public class And extends Expression{
	private Expression left,right;

	public And(Expression left,Expression right){
		this.left=left;
		this.right=right;
	}

	@Override
	public boolean equals(Object obj){
		if(obj!=null && obj instanceof And){
			return left.equals(((And)obj).left) && right.equals(((And)obj).right);
		}
		return false;
	}

	@Override
	public int hashCode(){
		return this.toString().hashCode();
	}

	@Override
	public boolean interpret(Context ctx){
		return left.interpret(ctx) && right.interpret(ctx);
	}

	@Override
	public String toString(){
		return "("+left.toString()+" AND "+right.toString()+")";
	}
}