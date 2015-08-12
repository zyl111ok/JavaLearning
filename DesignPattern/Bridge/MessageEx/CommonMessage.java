public class CommonMessage extends AbstractMessage{
	public CommonMessage(MessageImplementor impl){
		super(impl);
	}
	/**
	*发送普通类消息
	*@param message 发送消息内容
	*@param toUser 发送消息对象
	*/
	@Override
	public void sendMessage(String message,String toUser){
		message="发送普通类消息: "+message;
		impl.send(message,toUser);

	}
}