import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
public class BufferToText{
	private static final int SIZE=1024;
	public static void main(String args[])throws Exception{
		FileChannel fc=new FileOutputStream("data1.txt").getChannel();
		fc.write(ByteBuffer.wrap("zyl is a good student".getBytes()));
		fc.close();
		fc=new FileInputStream("data1.txt").getChannel();
		ByteBuffer buff=ByteBuffer.allocate(SIZE);
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		buff.rewind();
		String encoding=System.getProperty("file.encoding");
		System.out.println("Decoded using "+encoding+": "+Charset.forName(encoding).decode(buff));

		fc=new FileOutputStream("data1.txt").getChannel();
		fc.write(ByteBuffer.wrap("zyl is a good student".getBytes("UTF-16BE")));
		fc.close();
		fc=new FileInputStream("data1.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());

		fc=new FileOutputStream("data1.txt").getChannel();
		buff=ByteBuffer.allocate(124);
		buff.asCharBuffer().put("zyl is a good student");
		fc.write(buff);
		fc.close();
		fc=new FileInputStream("data1.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
	}
}