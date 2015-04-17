import java.util.*;
public class TestGenericArray{
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		List<Peel<Banana>>[] ls;
		List[] la=new List[10];
		ls=(List<Peel<Banana>>[])la;
		ls[0]=new ArrayList<Peel<Banana>>();
	}
}