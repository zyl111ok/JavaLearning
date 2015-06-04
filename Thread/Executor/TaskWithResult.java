import java.util.concurrent.*;
import java.util.*;
public class TaskWithResult implements Callable<String>{
	private int id;
	public TaskWithResult(int id){
		this.id=id;
	}
	public String call(){
		return "result of TaskWithResult "+id;
	}
}