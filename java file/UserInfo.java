import java.io.*;
import java.util.*;
public class UserInfo{
	private FileOutputStream outputStream;
	private FileInputStream  inputStream;
	private Map<String,String> usermap;
	private String userStart="login:state#";
	private File userFile;
	
	public UserInfo(){
		try{
			File file=CreatFile.getFile();
			userFile=new File(file,"userInfo.txt");
			userFile.createNewFile();
			initalFile();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private void initalFile(){
		try{
			outputStream=new FileOutputStream(userFile);
			outputStream.write(userStart.getBytes());
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
	
	public  String getUserInfo(){
		StringBuffer str=new StringBuffer();
		String tmpStr;
		try{
			inputStream=new FileInputStream(userFile);
			InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
			BufferedReader br=new BufferedReader(inputStreamReader);
			while((tmpStr=br.readLine())!=null){
				str.append(tmpStr);
			}
			br.close();
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
	
	public Map<String,String> buildUserMap(String userStart){
		String tmp[]=userStart.split("#");
		usermap=new HashMap<String,String>();
		for(String s:tmp){
			String tmp1[]=s.split(":");
			usermap.put(tmp1[0],tmp1[1]);
		}
		return usermap;
	}
	
	public void updateUserInfo(Map<String,String> map){
		StringBuffer str=new StringBuffer();
		Iterator iterator=map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<String,String> entry=(Map.Entry<String,String>)iterator.next();
			str.append(entry.getKey()+":"+entry.getValue()+"#");
		}
		try{
			outputStream=new FileOutputStream(userFile);
			outputStream.write(str.toString().getBytes());
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
}