public class Triangle extends Shape{
	private double bottom;
	private double high;
	
	public Triangle(double bottom,double high){
		this.bottom=bottom;
		this.high=high;
	}
	@Override 
	public double doSquaring(){
		return bottom*high/2;
	}
	@Override 
	public String toString(){
		return "Triangle";
	}
}