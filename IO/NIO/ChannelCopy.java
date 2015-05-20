import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class ChannelCopy{
	private static final int SIZE=1024;
	public static void main(String args[]){
		try{
			FileChannel in=new FileInputStream("data.txt").getChannel();
			FileChannel out=new FileOutputStream("objectdata.txt").getChannel();
			ByteBuffer buff=ByteBuffer.allocate(SIZE);
			while((in.read(buff))!=-1){
				buff.flip();//before writing
				out.write(buff);
				buff.clear();//before next reading
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}