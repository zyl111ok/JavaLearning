public class BigFish{
	private static long counter=1;
	private final long id=counter++;
	private BigFish(){}
	public String toString(){
		return this.getClass().getSimpleName()+id;
	}

	public static Generator<BigFish> generator=new Generator<BigFish>(){
		public BigFish next(){
			return new BigFish();
		}
	};
}