import java.util.*;
import java.io.*;
import java.util.regex.*;
public class FileReader{
	
	private File userFile; 
	
	public FileReader(){
		if(userFile==null){
			initialFile();
		}
	}
	private void initialFile(){
		userFile=new File("./RegularExpress.java");
	}
	/**
	*�˷������ڶ�ȡjava�ļ������ַ���
	*/
	private String reader(){
		StringBuffer str=new StringBuffer();
		String tmp="";
		try{
			FileInputStream inputStream=new FileInputStream(userFile);
			InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
			BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
			while((tmp=bufferedReader.readLine())!=null){
				str=str.append(tmp);
			}
			bufferedReader.close();
			return str.toString();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	/**
	*����������ʽƥ�䣬��ӡ��ע��
	*/
	private void printNote(String reg,String target){
		Matcher m=Pattern.compile(reg).matcher(target);
		while(m.find()){
			System.out.print(m.group()+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		FileReader fr=new FileReader();
		fr.printNote("\\/\\/[^\n]+",fr.reader());
	}
}