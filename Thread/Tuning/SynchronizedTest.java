import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.*;

public class SynchronizedTest extends Accumulator{
	{id="Synchronized";}
	public synchronized void accumulate(){
		value+=preLoaded[index++];
		if(index>=SIZE)index=0;
	}
	public synchronized long read(){
		return value;
	}
}