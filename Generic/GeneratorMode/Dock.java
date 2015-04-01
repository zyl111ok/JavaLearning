/**
*ÂëÍ·Àà
*/
import java.util.*;
public class Dock extends ArrayList<Harbor>{
	public Dock(int nHarbor,int nFreighter,int nProduct){
		for(int i=0;i<nHarbor;i++){
			add(new Harbor(nFreighter,nProduct));
		}
	}
	public String toString(){
		StringBuilder str=new StringBuilder();
		for(Harbor h:this)
			for(Freighter f:h)
				for(Product p:f){		
					str.append(p);
					str.append("\n");
				}
		return str.toString();
	}
	public static void main(String args[]){
		System.out.println(new Dock(6,5,4));
	}
}