import java.io.*;
public class Blip2 implements Externalizable{
	public Blip2(){
		System.out.println("Blip2 Constructor");
	}
	public void writeExternal(ObjectOutput out)throws IOException{
		System.out.println("Blip2.writeExternal");
	}
	public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException{
		System.out.println("Blip2.readExternal");
	}
}