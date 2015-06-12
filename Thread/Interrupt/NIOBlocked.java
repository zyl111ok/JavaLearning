import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.concurrent.*;
import java.io.*;
public class NIOBlocked implements Runnable{
	private final SocketChannel sc;
	public NIOBlocked(SocketChannel sc){this.sc=sc;}
	public void run(){
		try{
			System.out.println("Waiting for read()"+this);
			sc.read(ByteBuffer.allocate(1));
		}catch(ClosedByInterruptException e){
			System.out.println("ClosedByInterruptException ");
		}catch(AsynchronousCloseException e){
			System.out.println("AsynchronousCloseException");
		}
		catch(IOException e){
			throw new RuntimeException(e);
		}
		System.out.println("Exiting NIOBlocked.run() "+this);
	}
}