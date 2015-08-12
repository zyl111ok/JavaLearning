import java.lang.reflect.*;
public class MethodSelector implements InvocationHandler{
	private Object proxied;
	public MethodSelector(Object proxied){
		this.proxied=proxied;
	}
	public Object invoke(Object proxy,Method method,Object[] args)throws Throwable{
		if(method.getName().equals("interesting"))
			System.out.println("Proxy detected the interesting method");
		if(method.getName().equals("boring1"))
			System.out.println("Proxy detected the boring1 method");
		return method.invoke(proxied,args);
	}

}