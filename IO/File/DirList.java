import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList{
	public static void main(String args[]){
		File path=new File(".");
		String [] list;
		if(args.length==0)
			list=path.list();
		else 
			list=path.list(new DirFilter(args[0]));
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list)
			System.out.println(dirItem);
	}
}