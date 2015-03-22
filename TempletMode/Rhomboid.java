public class Rhomboid extends Shape{
	
	private double longDiagonal;
	private double shortDiagonal;
	
	public Rhomboid(double longDiagonal,double shortDiagonal){
		this.longDiagonal=longDiagonal;
		this.shortDiagonal=shortDiagonal;
	}
	@Override
	protected double doSquaring(){
		return longDiagonal*shortDiagonal;
	}
	@Override
	public String toString(){
		return "Rhomboid";
	}
}