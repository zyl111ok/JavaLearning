import java.util.*;
public class GeneratorList implements Generator<Coffee>,Iterable<Coffee>{
	
	private int size; 
	
	private Random rand=new Random(47);
	
	private Class[] types={Latte.class,Mocha.class,Breve.class,Americano.class};

	public GeneratorList(){}

	public GeneratorList(int size){
		this.size=size;
	}

	public Coffee next(){
		try{
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		}
		catch(IllegalAccessException e){
			e.printStackTrace();
			return null;
		}
		catch(InstantiationException e){
			e.printStackTrace();
			return null;
		}
	}

	public Iterator<Coffee> iterator(){
		return new GeneratorIterator();
	}

	public class GeneratorIterator implements Iterator<Coffee>{
		private int count=size;
		public boolean hasNext(){
			return count>0;
		}
		public Coffee next(){
			count--;
			return GeneratorList.this.next();
		}
		public void remove(){
			//unimplemented;
		}
	};

	public static void main(String args[]){
		GeneratorList generatorList=new GeneratorList();
		for(int i=0;i<5;i++){
			System.out.println(generatorList.next());
		}
		for(Coffee c:new GeneratorList(5)){
			System.out.println(c);
		}
	}
}