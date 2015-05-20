import java.io.*;
public class Blips{
	public static void main(String args[])throws IOException,ClassNotFoundException{
		System.out.println("Constructing objects:");
		Blip1 b1=new Blip1();
		Blip2 b2=new Blip2();
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Bilps.out"));
		System.out.println("Saving objects:");
		o.writeObject(b1);
		o.writeObject(b2);
		o.close();

		ObjectInputStream in=new ObjectInputStream(new FileInputStream("Bilps.out"));
		System.out.println("Recovering b1: ");
		b1=(Blip1)in.readObject();
		System.out.println("Recovering b2: ");
		b2=(Blip2)in.readObject();
	}
}