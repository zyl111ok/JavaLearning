public class CommonMessage extends AbstractMessage{
	public CommonMessage(MessageImplementor impl){
		super(impl);
	}
	/**
	*������ͨ����Ϣ
	*@param message ������Ϣ����
	*@param toUser ������Ϣ����
	*/
	@Override
	public void sendMessage(String message,String toUser){
		message="������ͨ����Ϣ: "+message;
		impl.send(message,toUser);

	}
}