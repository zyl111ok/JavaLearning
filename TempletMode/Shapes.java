import java.util.*;
public class Shapes{

	private static void testCast(){
		Shape shape=new Rhomboid(3.6,4.1);
		System.out.println(shape.draw());
		Rhomboid rb=(Rhomboid)shape;
		System.out.println(rb.draw());
		//!类型转换错误Circle cc=(Circle)shape;
		//!System.out.println(cc.draw());
	}
	public static void main(String args[]){
		List<Shape> shapeList=Arrays.asList(new Triangle(2.4,3.7),new Circle(3),
		new Square(5),new Rhomboid(5.2,4.3));
		for(Shape shape:shapeList){
			System.out.print(shape.draw()+"的面积是"+shape.getSquaring()+"");
			System.out.println();
			shape.rotate(shape);
		}
		testCast();
	}
} 