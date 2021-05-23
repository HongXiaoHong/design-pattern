package peron.hong.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 
 * @author ������     
 * @date   2019��7��1�� ����11:08:51   
 * @version V1.0
 */
public class Handler implements InvocationHandler {

	private Object target;
	/**
	 * ���ƿͻ���ֻ��ʹ���й�������������
	 * @param target
	 */
	public Handler(Object target) {
		super();
		this.target = target;
	}


	/**
	 * ���ķ���
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (proxy!=null) {
			// class com.sun.proxy.$Proxy0
			System.out.println(proxy.getClass());
			System.out.println("����");
		}
		if (method.getName().equals("sell")) {
			System.err.println("�ſ���ʹ���ж϶�ִ�еķ��������жϣ��Ƿ�ִ��");
			// ���ǿ�����������ϵ��÷���֮ǰ �Լ� ֮��Ĵ���
			System.out.println("PRE Process");
			method.invoke(target, args);
			System.out.println("POST Process");
		}
		return null;
	}

}
