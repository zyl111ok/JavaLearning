/**
*����¼��ɫ�Է������ṩ��ӿڣ�Ϊ���������ṩխ�ӿ�
*/
public class Originator{
	private String state;

	public String getState(){
		return state;
	}

	public void setState(String state){
		this.state=state;
		System.out.println("��ֵ״̬: "+state);
	}
	/**
	*��������������һ���µı���¼����
	*/
	public MementoIF createMemento(){
		return new Memento(state);
	}
	/**
	*�����˻ָ�������¼�����¼��״̬
	*/
	public void restoreMemento(MementoIF memento){
		setState(((Memento)memento).getState());
	}

	private class Memento implements MementoIF{

		private String state;
		/**
		*���췽��
		*/
		private Memento(String state){
			this.state=state;
		}

		private String getState(){
			return state;
		}

		private void setState(String state){
			this.state=state;
		}
	}
}