import java.util.concurrent.locks.*;
abstract class Incrementable{
	protected long counter=0;
	public abstract void increment();
}
