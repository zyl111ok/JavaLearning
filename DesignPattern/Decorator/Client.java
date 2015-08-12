public class Client{
	public static void main(String args[]){
		Reader re=new FileReader();
		//半透明要求，增加新的方法
		BufferedReader br=new BufferedReader(re);
		br.read();
		br.readLine();
		LineNumberReader ln=new LineNumberReader(re);
		ln.read();
		ln.readNumber();
		//透明性要求,采用原有的覆盖方法
		Reader r=new FileReader();
		Reader r1=new BufferedReader(r);
		r1.read();
		Reader r2=new LineNumberReader(r);
		r2.read();
	}
}