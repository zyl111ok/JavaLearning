public class FilterReader implements Reader{
	private Reader reader;
	public FilterReader(Reader reader){
		this.reader=reader;
	}
	@Override
	public void read(){
		reader.read();
	}
}