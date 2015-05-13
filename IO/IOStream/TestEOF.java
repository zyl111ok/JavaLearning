import java.io.*;
public class TestEOF{
	public static void main(String args[]){
		try{
			DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("TestEOF.java")));
			while(in.available()!=0)
				System.out.print((char)in.readByte());
		}
		catch(IOException e){
			System.err.println("IOException");
		}
	}
}