import java.io.*;
public class Echo{
	public static void main(String args[])throws IOException{
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=stdin.readLine())!=null && s.length()!=0){
			String temp=s.toUpperCase();
			System.out.println(temp);
		}
	}
}