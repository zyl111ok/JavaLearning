import java.io.*;
public class ThawAlien{
	public static void main(String args[])throws Exception{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(new File("X.file")));
		Object mystery=in.readObject();
		System.out.println(mystery.getClass());
	}
}