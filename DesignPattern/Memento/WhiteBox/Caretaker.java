/**
*�����˽�ɫ��,���汸��¼���󣬲��޸�Ҳ���鿴����¼���������
*/
public class Caretaker{
	private Memento memento;
	/**
	*����¼��ȡֵ����
	*/
	public Memento retrieveMemento(){
		return this.memento;
	}
	/**
	*����¼�ĸ�ֵ����
	*/
	public void saveMemento(Memento memento){
		this.memento=memento;
	}
}