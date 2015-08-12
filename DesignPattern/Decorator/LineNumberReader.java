public class LineNumberReader extends FilterReader{
	public LineNumberReader(Reader reader){
		super(reader);
	}
	@Override
	public void read(){
		super.read();
		System.out.println("LineNumberReader");
	}
	public void readNumber(){
		super.read();
		System.out.println("123");
	}

}