public class UrgentMessage extends AbstractMessage{
	public UrgentMessage(MessageImplementor impl){
		super(impl);
	}
	/**
	*���ͽ���������Ϣ
	*@param message ������Ϣ����
	*@param toUser ������Ϣ����
	*/
	@Override
	public void sendMessage(String message,String toUser){
		message="���ͽ�������Ϣ: "+message;
		message=message+hurry();
		impl.send(message,toUser);

	}
	/**
	*��������
	* @return ��Ϣ�Ӽ����� 
	*/
	public String hurry(){
		return "ʮ���";
	} 
}