/**
*解释器模式，模拟java对布尔表达式的操作求值
*非终结符表达式模型
*/
public class Not extends Expression{
	private Expression exp;

	public Not(Expression exp){
		this.exp=exp;
	}

	@Override
	public boolean equals(Object obj){
		if(obj!=null && obj instanceof Not){
			return exp.equals(((Not)obj).exp);
		}
		return false;
	}

	@Override
	public int hashCode(){
		return this.toString().hashCode();
	}

	@Override
	public boolean interpret(Context ctx){
		return !exp.interpret(ctx);
	}

	@Override
	public String toString(){
		return "(Not "+ exp.toString()+")";
	}
}