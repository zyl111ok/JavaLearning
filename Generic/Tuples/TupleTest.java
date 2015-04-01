public class TupleTest{
	static TwoTuple<String,Integer> f(){
		return Tuple.tuple("hi",3);
	}
	static TwoTuple f2(){
		return Tuple.tuple("hihi",4);
	}
	static ThreeTuple<String,Integer,Double> g(){
		return Tuple.tuple("tom",5,8.42);
	}
	static FourTuple<String,Integer,Double,Amphibian> e(){
		return Tuple.tuple("jack",23,6.4,new Amphibian());
	}
	static FiveTuple<String,Integer,Double,Amphibian,Vehicle> h(){
		return Tuple.tuple("jason",3,2.1,new Amphibian(),new Vehicle());
	}
	public static void main(String args[]){
		System.out.println(f());
		System.out.println(f2());
		System.out.println(g());
		System.out.println(e());
		System.out.println(h());
	}
}