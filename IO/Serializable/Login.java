import java.io.*;
import java.util.*;
public class Login implements Serializable{
	private Date date=new Date();
	private String username;
	private transient String password;
	public Login(String name,String pwd){
		username=name;
		password=pwd;
	}
	public String toString(){
		return "login info:\nusername: "+username+"\ndate: "+date+"\npassword: "+password;
	}
	public static void main(String args[])throws Exception{
		Login a=new Login("zyl111ok","zyl950115");
		System.out.println("login a="+a);
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Login.out"));
		o.writeObject(a);
		o.close();
		Thread.sleep(1000);
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("Login.out"));
		System.out.println("Recovering object at "+new Date());
		a=(Login)in.readObject();
		System.out.println("Login a= "+a);
	}
}