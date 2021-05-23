package peron.hong.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 
 * @author 洪晓鸿     
 * @date   2019年7月1日 下午11:08:51   
 * @version V1.0
 */
public class Handler implements InvocationHandler {

	private Object target;
	/**
	 * 限制客户端只能使用有构造器创建对象
	 * @param target
	 */
	public Handler(Object target) {
		super();
		this.target = target;
	}


	/**
	 * 核心方法
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (proxy!=null) {
			// class com.sun.proxy.$Proxy0
			System.out.println(proxy.getClass());
			System.out.println("对象：");
		}
		if (method.getName().equals("sell")) {
			System.err.println("嗯可以使用判断对执行的方法进行判断，是否执行");
			// 我们可以在这里加上调用方法之前 以及 之后的处理
			System.out.println("PRE Process");
			method.invoke(target, args);
			System.out.println("POST Process");
		}
		return null;
	}

}
