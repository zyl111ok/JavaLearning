import java.nio.*;
public class IntBufferDemo{
	private static final int SIZE=1024;
	public static void main(String args[]){
		ByteBuffer bb=ByteBuffer.allocate(SIZE);
		IntBuffer ib=bb.asIntBuffer();
		//Store an array of int:
		ib.put(new int[]{11,42,47,99,143,811,1016});
		//Absolute location read and write
		System.out.println(ib.get(3));
		ib.put(3,1811);
		ib.flip();
		while(ib.hasRemaining()){
			int i=ib.get();
			System.out.println(i);
		}

	}
}