public class Client{
	public static void main(String args[]){
		Reader re=new FileReader();
		//��͸��Ҫ�������µķ���
		BufferedReader br=new BufferedReader(re);
		br.read();
		br.readLine();
		LineNumberReader ln=new LineNumberReader(re);
		ln.read();
		ln.readNumber();
		//͸����Ҫ��,����ԭ�еĸ��Ƿ���
		Reader r=new FileReader();
		Reader r1=new BufferedReader(r);
		r1.read();
		Reader r2=new LineNumberReader(r);
		r2.read();
	}
}