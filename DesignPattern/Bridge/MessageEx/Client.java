public class Client{
	public static void main(String args[]){
		MessageImplementor mi1=new SMSImplementor();
		MessageImplementor mi2=new EmailImplementor();
		AbstractMessage am1=new CommonMessage(mi1);
		AbstractMessage am2=new UrgentMessage(mi1);
		am1.sendMessage("师部会议","小李子");
		am2.sendMessage("师部会议","小李子");

		am1=new CommonMessage(mi2);
		am2=new UrgentMessage(mi2);
		am1.sendMessage("师部会议","小李子");
		am2.sendMessage("师部会议","小李子");
	}
}