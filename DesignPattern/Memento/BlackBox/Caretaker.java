public class Caretaker{
	
	private MementoIF memento;
	/**
	*����¼ȡֵ����
	*/
	public MementoIF retrieveMemento(){
		return memento;
	}
	/**
	*����¼��ֵ����
	*/
	public void saveMemento(MementoIF memento){
		this.memento=memento;
	}
}