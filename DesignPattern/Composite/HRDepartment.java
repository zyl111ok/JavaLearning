/**
*Leaf2 叶子节点二
*/
public class HRDepartment extends Company{
	public HRDepartment(){}
	public HRDepartment(String name){
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