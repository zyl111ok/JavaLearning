/**
*Test FinalData in static field or not
*/
import static com.zyl2015.utils.Prints.Printer.*;
import java.util.*;
public class FinalData{
	private final int value1;
	private static final int value2=new Random(47).nextInt(100);
	public FinalData(int i){
		value1=new Random(i).nextInt(100);
		//! --error! compiler refused
		//! --value2=new Random(i).nextInt(100);
	}
	public String toString(){
		return "value1: "+value1+"value2: "+value2;
	}

	public static void main(String args[]){
		FinalData f1=new FinalData(50);
		sprintln(f1);
		FinalData f2=new FinalData(60);
		sprintln(f2);
	}
}