import java.util.Date;
public abstract class AutoMessage{
	private String to;
	private String from;
	private String subject;
	private String body;
	private Date sendDate;

	public void send(){
		System.out.println("收件人地址: "+to);
		System.out.println("发件人地址: "+from);
		System.out.println("标题： "+subject);
		System.out.println("内容： "+body);
		System.out.println("发送日期: "+sendDate);
	}

	public String getTo(){
		return to;
	}

	public void setTo(String to){
		this.to=to;
	}

	public String getFrom(){
		return from;
	}

	public void setFrom(String from){
		this.from=from;
	}

	public void setSubject(String subject){
		this.subject=subject;
	}

	public String getSubject(){
		return subject;
	}

	public String getBody(){
		return body;
	}

	public void setBody(String body){
		this.body=body;
	}

	public Date getSendDate(){
		return sendDate;
	}
	public void setSendDate(Date sendDate){
		this.sendDate=sendDate;
	}
}