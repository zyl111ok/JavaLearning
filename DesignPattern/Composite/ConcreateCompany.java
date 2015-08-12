import java.util.*;
/**
*Composite
*根节点具体实现
*/
public class ConcreateCompany extends Company{
	private List<Company> cList;
	public ConcreateCompany(){
		cList=new ArrayList<Company>();
	}
	public ConcreateCompany(String name){
		super(name);
		cList=new ArrayList<Company>();
	}
	@Override
	protected void add(Company company){
		cList.add(company);
	}
	@Override
	protected void remove(Company company){
		cList.remove(company);
	}
	@Override
	protected void display(int depth){
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<depth;i++)
			sb.append("-");
		System.out.println(sb.toString()+this.getName());
		for(Company c:cList)
			c.display(depth+2);
	}
}