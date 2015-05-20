import java.nio.*;
public class UsingBuffers{
	private static void sysmmetricScramble(CharBuffer buffer){
		while(buffer.hasRemaining()){
			buffer.mark();
			char c1=buffer.get();
			char c2=buffer.get();
			buffer.reset();
			buffer.put(c2).put(c1);

		}
	}
	public static void main(String args[]){
		char[] data="UsingBuffers".toCharArray();
		ByteBuffer bb=ByteBuffer.allocate(data.length*2);
		CharBuffer cb=bb.asCharBuffer();
		cb.put(data);
		//invokign its toString() method
		System.out.println(cb.rewind());
		sysmmetricScramble(cb);
		System.out.println(cb.rewind());
		sysmmetricScramble(cb);
		System.out.println(cb.rewind());
	}
}