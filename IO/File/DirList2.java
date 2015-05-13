import java.util.*;
import java.util.regex.*;
import java.io.*;
public class DirList2{
	public static void main(final String args[]){
		File path=new File(".");
		String [] list;
		if(args.length==0)
			list=path.list();
		else
			list=path.list(new FilenameFilter(){
				private Pattern pattern=Pattern.compile(args[0]);
				public boolean accept(File dir,String name){
					return pattern.matcher(name).matches();
				}
			});
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list)
			System.out.println(dirItem);
	}
}