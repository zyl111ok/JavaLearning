import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.*;

public class BaseLine extends Accumulator{
	{id="BaseLine";}
	public void accumulate(){
		value+=preLoaded[index++];
		if(index>=SIZE)index=0;
	}
	public long read(){
		return value;
	}
}