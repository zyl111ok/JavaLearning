public class BufferedReader extends FilterReader{
	public BufferedReader(Reader reader){
		super(reader);
	}
	@Override
	public void read(){
		super.read();
		System.out.println("bufferedReader");
	}
	public void readLine(){
		super.read();
		System.out.println("\\\n");
	}
}