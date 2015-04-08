import java.io.*;
import java.util.*;
public class WordToPDF{
	private static String fileName="./a.docx";
	private static String pdfName="./a.pdf";
	private static String readFile(){
		try{
			StringBuffer str=new StringBuffer();
			String tmpStr;
			FileInputStream fis =new FileInputStream(fileName);
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			
			while((tmpStr=br.readLine())!=null){
			str.append(tmpStr);
			}
			br.close();
			return str.toString();
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}
	public static void writeFile(){
		try{
			FileOutputStream outputStream=new FileOutputStream(pdfName);
			outputStream.write(readFile().getBytes());
			outputStream.flush();
			outputStream.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String args[]){
		writeFile();
	}
}