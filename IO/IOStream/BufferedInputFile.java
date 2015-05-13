import java.io.*;
import java.util.*;
public class BufferedInputFile{
	public static String read(String fileName){
		try{
			String temp;
			StringBuilder sb=new StringBuilder();
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			while((temp=br.readLine())!=null){
				sb.append(temp);
			}
			br.close();
			return sb.toString(); 
		}
		catch(IOException e){
			e.printStackTrace();
			return null;
		}
	}
	public static List<String> readTxt(String fileName){
		LinkedList<String> list=new LinkedList();
		try{
			String temp;
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			while((temp=br.readLine())!=null){
				list.add(temp);
			}
			br.close();
			return list;
		}
		catch(IOException e){
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String args[]){
		System.out.print(read("BufferedInputFile.java"));
		List<String> list=readTxt("test.txt");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}