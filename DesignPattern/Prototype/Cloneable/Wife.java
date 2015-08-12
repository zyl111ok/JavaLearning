import java.util.Date;
import java.io.*;
public class Wife implements Serializable{
	private String name;
	private Date birthday;

	public Wife(){
		name="·ï½ã";
		birthday=new Date();
	}

	public Date getBirthday(){
		return birthday;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

}