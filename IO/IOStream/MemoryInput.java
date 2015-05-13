import java.io.*;
public class MemoryInput{
	public static void main(String args[]){
		try{
			StringReader in=new StringReader(BufferedInputFile.read("MemoryInput.java"));
			int c;
			while((c=in.read())!=-1)
				System.out.print((char)c+" ");
			System.out.println();
		}

		catch(IOException e){
			System.out.println("IOException");
		}
	}
}