import java.io.*;
import java.util.Date;
public class Husband implements Cloneable,Serializable{
	private Wife wife;
	private Date  birthday;

	public Husband(){
		wife=new Wife();
		birthday=new Date();
	}

	public Wife getWife(){
		return wife;
	}

	public Date getBirthday(){
		return birthday;
	}

	public Object clone(){
		Husband husband=null;
		try{
			husband=(Husband)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}finally{
			return husband;
		}
	}

	public Object deepClone()throws IOException,ClassNotFoundException{
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);

		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return ois.readObject(); 
	}

} 