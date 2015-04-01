/**
*¸Û¿ÚÀà
*/
import java.util.*;
public class Harbor extends ArrayList<Freighter>{
	public Harbor(int nFreighter,int nProduct){
		for(int i=0;i<nFreighter;i++)
			add(new Freighter(nProduct));
	}
}