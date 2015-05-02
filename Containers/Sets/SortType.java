import java.util.*;
public class SortType implements Comparable<SortType>{
	protected int n;
	public SortType(int n){
		this.n=n;
	}
	public boolean equals(Object o){
		return o instanceof SortType && (this.n==((SortType)o).n);
	}
	public String toString(){
		return Integer.toString(n);
	}
	public int compareTo(SortType arg){
		return (arg.n<this.n?-1 : (arg.n==this.n?0:1));
	}
	public int getItem(){
		return this.n;
	}
}
