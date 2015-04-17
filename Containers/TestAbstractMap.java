import java.util.*;
public class TestAbstractMap extends AbstractMap<String,String>{
	//defined abstract method entrySet(),readOnly Map
	private static String Contries[][]={{"ALGERIA","Algiers"},{"CHAD","N'djamena"},{"NIGER","Niamey"},{"JORDAN","Amman"}};
	public static class DefinedEntry implements Map.Entry<String,String>{
		protected int index;
		DefinedEntry(int index){
			this.index=index;
		} 
		public boolean equals(Object o){
			return Contries[index][0].equals(o);
		}
		public String getKey(){return Contries[index][0];}
		public String getValue(){return Contries[index][1];}
		public String setValue(String value){
			throw new UnsupportedOperationException();
		}
		public int hashCode(){return Contries[index][0].hashCode();}
	};
	public static class EntrySet extends AbstractSet<Map.Entry<String,String>>{
		private int size;
		EntrySet(int size){
			this.size=size<0 ?0:((size>Contries.length)?Contries.length:size);
		}
		public int size(){return size;}
		private class Iter implements Iterator<Map.Entry<String,String>>{
			private DefinedEntry entry=new DefinedEntry(-1);
			public boolean hasNext(){return entry.index<size-1;}
			public Map.Entry<String,String> next(){
				entry.index++;
				return entry;
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		}
		public Iterator<Map.Entry<String,String>> iterator(){
			return new Iter();
		}
	};

	private static Set<Map.Entry<String,String>> entries=new EntrySet(Contries.length);
	public Set<Map.Entry<String,String>> entrySet(){return entries;} 

	public static void main(String args[]){
		TestAbstractMap map=new TestAbstractMap();
		Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,String> entry=it.next();
			System.out.print("key := "+entry.getKey()+";  value := "+entry.getValue()+"\n");
			if(entry.getKey().matches("[N].*"))
				break;
		}
	}
}