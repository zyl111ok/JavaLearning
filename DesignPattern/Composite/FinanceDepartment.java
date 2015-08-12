/**
*Leaf1 叶子节点一
*/
public class FinanceDepartment extends Company{
	public FinanceDepartment(){}

	public FinanceDepartment(String name){
		super(name);
	}
	@Override
	protected void add(Company company){}
	@Override
	protected void remove(Company company){}
	@Override
	protected void display(int depth){
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<depth;i++)
			sb.append("-");
		System.out.println(sb.toString()+this.getName());
	}
}