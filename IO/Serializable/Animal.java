import java.io.*;
import java.util.*;
public class Animal implements Serializable{
	private String name;
	private House preferredHouse;
	public Animal(String nm,House h){
		name=nm;
		preferredHouse=h;
	}
	public String toString(){
		return name+"["+super.toString()+"], "+preferredHouse+"\n";
	}
}