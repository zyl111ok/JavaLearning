import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.concurrent.*;
import java.io.*;
public class NIOInterruption{
	public static void main(String args[])throws Exception{
		ExecutorService exec=Executors.newCachedThreadPool();
		ServerSocket server=new ServerSocket(8080);
		InetSocketAddress isa=new InetSocketAddress("localhost",8080);
		SocketChannel sc1=SocketChannel.open(isa);
		SocketChannel sc2=SocketChannel.open(isa);
		Future<?> f=exec.submit(new NIOBlocked(sc1));
		exec.execute(new NIOBlocked(sc2));
		exec.shutdown();
		Thread.sleep(1000);
		f.cancel(true);
		Thread.sleep(1000);
		sc2.close();
	}
}