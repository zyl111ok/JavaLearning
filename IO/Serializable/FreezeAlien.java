import java.io.*;
public class FreezeAlien{
	public static void main(String args[])throws IOException{
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("X.file"));
		Alien quellek=new Alien();
		out.writeObject(quellek);
	}
}