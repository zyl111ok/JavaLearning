public class Square extends Shape{
	private double length;
	
	public Square(double length){
		this.length=length;
	}
	@Override
	protected double doSquaring(){
		return length*length;
	}
	@Override 
	public String toString(){
		return "Square";
	}
} 