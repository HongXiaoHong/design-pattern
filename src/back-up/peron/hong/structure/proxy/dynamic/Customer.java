package peron.hong.structure.proxy.dynamic;

import java.lang.reflect.Proxy;

import peron.hong.structure.proxy.LandAgent;
import peron.hong.structure.proxy.Seller;
/*
 * ģ���û����н���
 */
public class Customer {

	public static void main(String[] args) {
		// ����ǵز������� Ҳ���Ƿ�Դ��ӵ����
		LandAgent landSeller = new LandAgent();
		Handler handler = new Handler(landSeller);
		Seller proxySeller = (Seller)Proxy.newProxyInstance(LandAgent.class.getClassLoader(), new Class[] {Seller.class}, handler);
		proxySeller.sell();
	}

}/*
result��
�ſ���ʹ���ж϶�ִ�еķ��������жϣ��Ƿ�ִ��
PRE Process
���ز���---���Ƿ��ز��̣���Դ�����⣬�����ϰ壡����
POST Process
---------------------------------------
����ժ������
��̬����ĳɹ�����
Square��˾��Ʒ��Android Restful ���������Retrofit
Spring AOP ��Ĭ��ʹ�ö�̬�������û��ʵ�ֽӿ���ʹ��CGLIB�޸��ֽ��룩
---------------------------------------
�ɲο����µ���ַ
https://www.jianshu.com/p/6e962d1e7ddd
*///:~
