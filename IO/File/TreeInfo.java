 import java.util.*;
 import java.util.regex.*;
 import java.io.*;
 public class TreeInfo implements Iterable<File>{
 	public List<File> files=new ArrayList<File>();
 	public List<File> dirs=new ArrayList<File>();

 	public Iterator<File> iterator(){
 		return files.iterator();
 	}

 	public void addAll(TreeInfo other){
 		files.addAll(other.files);
 		dirs.addAll(other.dirs);
 	}

 	public String toString(){
 		return "dirs: "+ dirs.toString()+"\n\nfiles: "+files.toString();
 	}

 	public static TreeInfo walk(String start,String regex){
 		return recurseDirs(new File(start),regex);
 	}

 	public static TreeInfo walk(File start,String regex){
 		return recurseDirs(start,regex);
 	}

 	public static TreeInfo walk(File start){
 		return recurseDirs(start,".*");
 	}

 	public static TreeInfo walk(String start){
 		return recurseDirs(new File(start),".*");
 	}

 	public static TreeInfo recurseDirs(File startDir,String regex){
 		TreeInfo result=new TreeInfo();
 		for(File item:startDir.listFiles()){
 			if (item.isDirectory()) {
 				result.dirs.add(item);
 				//µÝ¹é±éÀúÄ¿Â¼
 				result.addAll(recurseDirs(item,regex));
 			}
 			else if(item.getName().matches(regex))
 				result.files.add(item);
 		}
 		return result;
 	}

 	public static void main(String args[]){
 		if(args.length==0)
 			System.out.println(walk("."));
 		else
 			for(String arg:args)
 				System.out.println(walk(arg));
 	}
 }