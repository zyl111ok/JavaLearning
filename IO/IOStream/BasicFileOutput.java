import java.io.*;
public class BasicFileOutput{
	static String file="BasicFileOutput.out";
	static String file1="BasicFileOutput1.out";
	public static void main(String args[]) throws IOException{
		BufferedReader in=new BufferedReader(new StringReader(BufferedInputFile.read("BasicFileOutput.java")));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int lineCount=1;
		String s;
		while((s=in.readLine())!=null)
			out.println(lineCount++ +": "+s);
		in.close();
		out.close();
		
		lineCount=1;
		BufferedReader in1=new BufferedReader(new InputStreamReader(new FileInputStream("BasicFileOutput.java")));
		PrintWriter out1=new PrintWriter(new BufferedWriter(new FileWriter(file1)));
		while((s=in1.readLine())!=null)
			out1.println(lineCount++ +": "+s);
		in1.close();
		out1.close();
		System.out.println(BufferedInputFile.read(file1));
	}
}