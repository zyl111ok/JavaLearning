import java.io.*;
import java.util.*;
public class TextFile extends ArrayList<String>{
	public static String read(String fileName){
		StringBuilder sb=new StringBuilder();
		try{
			BufferedReader in=new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
			try{
				String s;
				while((s=in.readLine())!=null){
					sb.append(s);
					sb.append("\n");
				}
			} 
			finally{
				in.close();
			}
		}
		catch(IOException e){
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
	public static void write(String fileName,String text){
		try{
			PrintWriter out=new PrintWriter(new File(fileName).getAbsoluteFile());
			try{
				out.print(text);
			}
			finally{
				out.close();
			}
		}
		catch(IOException e){
			throw new RuntimeException(e);
		}
	}
	public TextFile(String fileName,String splitter){
		super(Arrays.asList(read(fileName).split(splitter)));
		if(get(0).equals("")) remove(0);
	}
	//default splitter
	public TextFile(String fileName){
		this(fileName,"\n");
	}

	public void write(String fileName){
		try{
			PrintWriter out=new PrintWriter(new File(fileName).getAbsoluteFile());
			try{
				for(String item:this)
					out.println(item);
			}
			finally{
				out.close();
			}
		}
		catch(IOException e){
			throw new RuntimeException(e);
		}
	}

	public static void main(String args[]){
		String file=read("TextFile.java");
		write("test2.txt",file);
		TextFile text=new TextFile("test2.txt");
		text.write("test3.txt");
	}

}