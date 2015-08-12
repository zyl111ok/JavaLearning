public class UrgentMessage extends AbstractMessage{
	public UrgentMessage(MessageImplementor impl){
		super(impl);
	}
	/**
	*发送紧急类类消息
	*@param message 发送消息内容
	*@param toUser 发送消息对象
	*/
	@Override
	public void sendMessage(String message,String toUser){
		message="发送紧急类消息: "+message;
		message=message+hurry();
		impl.send(message,toUser);

	}
	/**
	*新增方法
	* @return 消息加急内容 
	*/
	public String hurry(){
		return "十万火急";
	} 
}