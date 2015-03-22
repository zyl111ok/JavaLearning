import java.io.*;
public class CreatFile{
	private static File mDirFile=new File("./txts");
	
	private CreatFile(){
	}
	
	public static File getFile(){
		if(!mDirFile.exists()){
			mDirFile.mkdirs();
		}
		return mDirFile;
	}
}