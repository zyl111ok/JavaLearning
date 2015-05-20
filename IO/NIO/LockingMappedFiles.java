import java.nio.*;
import java.io.*;
import java.nio.channels.*;
public class LockingMappedFiles{
	private static final int LENGTH=0x8FFFFFF;
	private static FileChannel fc;
	public static void main(String args[])throws Exception{
		fc=new RandomAccessFile("test.dat","rw").getChannel();
		MappedByteBuffer out=fc.map(FileChannel.MapMode.READ_WRITE,0,LENGTH);
		for(int i=0;i<LENGTH;i++)
			out.put((byte)'x');
		new LockAndModify(out,0,0+LENGTH/3,fc);
		new LockAndModify(out,LENGTH/2,LENGTH/2+LENGTH/4,fc);
	}
}