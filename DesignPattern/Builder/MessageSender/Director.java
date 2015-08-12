public class Director{
	Builder builder;
	public Director(Builder builder){
		this.builder=builder;
	}
	public void construct(String toAddress,String fromAddress){
		builder.buildTo(toAddress);
		builder.buildFrom(fromAddress);
		builder.buildSubject();
		builder.buildBody();
		builder.buildSendDate();
		builder.sendMessage();
	}
}