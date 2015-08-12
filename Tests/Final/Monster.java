public class Monster{
	private String name;
	public Monster(String name){
		this.name=name;
	}
	public void bark(){
		System.out.println(name+" : "+this.hashCode());
	}
}