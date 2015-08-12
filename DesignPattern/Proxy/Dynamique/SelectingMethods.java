import java.lang.reflect.*;
public class SelectingMethods{
	public static void main(String args[]){
		SomeMethods proxy=(SomeMethods)Proxy.newProxyInstance(SomeMethods.class.getClassLoader(),
			new Class[]{SomeMethods.class},new MethodSelector(new Implementation()));
		proxy.boring1();
		proxy.boring2();
		proxy.interesting("afdas");
		proxy.boring3();
	}
}