import java.nio.*;
import java.io.*;
import java.nio.channels.*;

public class LockAndModify extends Thread{
	private ByteBuffer buff;
	private int start,end;
	private FileChannel fc;

	LockAndModify(ByteBuffer mbb,int start,int end,FileChannel fc){
		this.start=start;
		this.end=end;
		mbb.limit(end);
		mbb.position(start);
		buff=mbb.slice();
		this.fc=fc;
		start();
	}

	public void run(){
		try{
			FileLock fl=fc.lock(start,end,false);
			System.out.println("locked:"+start+" to "+end);
			while(buff.position()<buff.limit()-1)
				buff.put((byte)(buff.get()+1));
			fl.release();
			System.out.println("Released: "+start+" to "+end);
		}
		catch(IOException e){
			throw new RuntimeException(e);
		}
	}

}