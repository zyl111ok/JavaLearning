public class TestHolder{
	public static void main(String args[]){
		Holder<Integer> holderInt=new Holder<Integer>();
		Holder<Long> holderLong=new Holder<Long>();
		Holder<Double> holderDouble=new Holder<Double>();
		Holder<Byte> holderByte=new Holder<Byte>();
		
		byte by=1;
		holderInt.set(12);
		holderLong.set(172812l);
		holderDouble.set(2.32);
		holderByte.set(by);
		
		int a=holderInt.get();
		double d=holderDouble.get();
		long l=holderLong.get();
		byte b=holderByte.get();
		
		System.out.println(a+"  "+d+"  "+l+"  "+b);
	}
}