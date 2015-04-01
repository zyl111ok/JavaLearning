/**
*泛型接口用在内部类的例子（生成器模式）
*/
public class LittleFish{
	
	private static long counter=1;
	private  final long id=counter++;
	private LittleFish(){}
	
	public String toString(){
		return this.getClass().getSimpleName()+id;
	}

	public static Generator<LittleFish> generator(){
		return new Generator<LittleFish>(){
			public LittleFish next(){
				return new LittleFish();
			}
		};
	}
}