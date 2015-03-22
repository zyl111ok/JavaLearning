public class Circle extends Shape{
	private double radio;
	public Circle(double radio){
		this.radio=radio;
	}
	@Override
	protected double doSquaring(){
		return Math.PI*radio*radio;
	}
	@Override
	public String toString(){
		return "Circle";
	}
}