import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class TransferTo{
	public static void main(String args[]){
		try{
			FileChannel in=new FileInputStream("data.txt").getChannel();
			FileChannel out=new FileOutputStream("objectdata.txt").getChannel();
			in.transferTo(0,in.size(),out);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}