import java.util.*;
public class DefinedHashMap<K,V> extends AbstractMap<K,V>{
	static final int SIZE=997;
	static final String country[][]={{"China","Beijing"},{"JaPan","Tokyo"}};
	@SuppressWarnings("unchecked")
	LinkedList<MapEntry<K,V>>[] buckets=new LinkedList[SIZE];
	public V put(K key,V value){
		V oldValue=null;
		int index=Math.abs(key.hashCode())%SIZE;
		if(buckets[index]==null)
			buckets[index]=new LinkedList<MapEntry<K,V>>();
		LinkedList<MapEntry<K,V>> bucket=buckets[index];
		MapEntry<K,V> pair=new MapEntry<K,V>(key,value);
		boolean found=false;
		ListIterator<MapEntry<K,V>> it=bucket.listIterator();
		while(it.hasNext()){
			MapEntry<K,V> iPair=it.next();
			if(iPair.getKey().equals(key)){
				oldValue=iPair.getValue();
				it.set(pair);//Replace old value with new one
				found=true;
				break;
			}
		}
		if(!found)
			buckets[index].add(pair);
		return oldValue;
	}
	public V get(Object key){
		int index=Math.abs(key.hashCode())%SIZE;
		if(buckets[index]==null)
			return null;
		for(MapEntry<K,V> iPair:buckets[index])
			if(iPair.getKey().equals(key))
				return iPair.getValue();
		return null;
	}
	public Set<Map.Entry<K,V>> entrySet(){
		Set<Map.Entry<K,V>> set=new HashSet<Map.Entry<K,V>>();
		for(LinkedList<MapEntry<K,V>> bucket:buckets){
			if(bucket==null) continue;
			for(MapEntry<K,V> mpair:bucket)
				set.add(mpair);
		}
		return set;
	}
	public static void main(String args[]){
		DefinedHashMap<String,String> m=new DefinedHashMap<String,String>();
		for(int index=0;index<country.length;index++){
			m.put(country[index][0],country[index][1]);
		}
		System.out.println(m);
		System.out.println(m.entrySet()); 
	}
}