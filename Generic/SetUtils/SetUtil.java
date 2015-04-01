import java.util.*;
public class SetUtil{
	/**
	*将两个集合的元素合并
	*/
	public static <T> Set<T> union(Set<T> a,Set<T> b){
		Set<T> result=new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	/**
	*求两个集合的交集
	*/
	public static <T> Set<T> intersection(Set<T> a,Set<T> b){
		Set<T> result=new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	/**
	*使a集合删除与b集合相同的元素
	*/
	public static <T>Set<T> difference(Set<T> superset,Set<T> subset){
		Set<T> result=new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	/**
	*求集合a与集合b除了交集之外的元素
	*/
	public static <T>Set<T> complement(Set<T> a,Set<T> b){
		return difference(union(a,b),intersection(a,b));
	}
}