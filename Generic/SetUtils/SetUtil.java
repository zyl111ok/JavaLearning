import java.util.*;
public class SetUtil{
	/**
	*���������ϵ�Ԫ�غϲ�
	*/
	public static <T> Set<T> union(Set<T> a,Set<T> b){
		Set<T> result=new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	/**
	*���������ϵĽ���
	*/
	public static <T> Set<T> intersection(Set<T> a,Set<T> b){
		Set<T> result=new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	/**
	*ʹa����ɾ����b������ͬ��Ԫ��
	*/
	public static <T>Set<T> difference(Set<T> superset,Set<T> subset){
		Set<T> result=new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	/**
	*�󼯺�a�뼯��b���˽���֮���Ԫ��
	*/
	public static <T>Set<T> complement(Set<T> a,Set<T> b){
		return difference(union(a,b),intersection(a,b));
	}
}