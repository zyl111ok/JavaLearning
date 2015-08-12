/**
*负责人角色类,保存备忘录对象，不修改也不查看备忘录对象的内容
*/
public class Caretaker{
	private Memento memento;
	/**
	*备忘录的取值方法
	*/
	public Memento retrieveMemento(){
		return this.memento;
	}
	/**
	*备忘录的赋值方法
	*/
	public void saveMemento(Memento memento){
		this.memento=memento;
	}
}