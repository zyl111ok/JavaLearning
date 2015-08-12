/**
*Component
*根节点抽象表达s
*/
public abstract class Company{
	private String name;
	public Company(){}
	public Company(String name){
		this.name=name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	protected abstract void add(Company company);

	protected abstract void remove(Company company);

	protected abstract void display(int depth);
}