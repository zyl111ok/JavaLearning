import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.charset.*;
public class AvailableCharSets{
	public static void main(String args[]){
		SortedMap<String,Charset> charsets=Charset.availableCharsets();
		Iterator<String> it=charsets.keySet().iterator();
		while(it.hasNext()){
			String csName=it.next();
			System.out.print(csName+" ");
			Iterator aliases=charsets.get(csName).aliases().iterator();
			if(aliases.hasNext())
				System.out.print(": ");
			while(aliases.hasNext()){
				System.out.print(aliases.next()+" ");
				if(aliases.hasNext())
					System.out.print(", ");
			}
			System.out.println();
		}
	}
}