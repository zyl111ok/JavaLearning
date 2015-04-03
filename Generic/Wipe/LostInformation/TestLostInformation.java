import java.util.*;
public class TestLostInformation{
	public static void main(String args[]){
		List<Frob> list=new ArrayList<Frob>();
		Map<Frob,Fnorkle> map=new HashMap<Frob,Fnorkle>();
		Quark<Fnorkle,String,Frob> quark=new Quark<Fnorkle,String,Frob>();
		Particle<Long,Double> particle=new Particle<Long,Double>();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));
	}
}