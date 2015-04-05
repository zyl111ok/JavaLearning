import java.util.*;
public class InstantiateGenericType{
	public static void main(String args[]){
		try{
			Class.forName("ClassAsFactory");
		}
		catch(ClassNotFoundException e){
			throw new RuntimeException();
		}
		List<ClassAsFactory<Employee>> list=new ArrayList<ClassAsFactory<Employee>>();
		for(int i=0;i<5;i++){
			list.add(new ClassAsFactory<Employee>(Employee.class));
		}

	}
}