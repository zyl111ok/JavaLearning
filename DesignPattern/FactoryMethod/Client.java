import java.io.*;
public class Client{
	public static String getConsoleString() throws IOException{
		String temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		temp=br.readLine();
		br.close();
		return temp; 
	}
	public static void main(String args[]){
		Creator creator=new ConCreator();
		String type=null;
		System.out.println("请输入商品类型:");
		try{
			type=getConsoleString();
		}catch(IOException e){
			e.printStackTrace();
		}
		creator.doSomething(type);
		StaticCreator.doSomething(type);
	}
}