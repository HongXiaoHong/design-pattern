///:
package peron.hong.create.singleton;

public class TestMain {

	public static void main(String[] args) {
//		��������ʽ����ģʽ
//		Singleton singleton = Singleton.getSingleton();
//		Singleton singletonBro = Singleton.getSingleton();
//		���Զ���ʽ����ģʽ
//		HungrySingleton singleton = HungrySingleton.getSingleton();
//		HungrySingleton singletonBro = HungrySingleton.getSingleton();
//		����ͬ������ʽ����ģʽ
//		DoubleSynchronizationSingleton singleton = DoubleSynchronizationSingleton.getSingleton();
//		DoubleSynchronizationSingleton singletonBro = DoubleSynchronizationSingleton.getSingleton();
//		����˫��ͬ������ʽ����ģʽ
//		DoubleSynchronizationSingleton singleton = DoubleSynchronizationSingleton.getSingleton();
//		DoubleSynchronizationSingleton singletonBro = DoubleSynchronizationSingleton.getSingleton();
//		����ö��ʽ����ģʽ---�ռ�����
		SimgletonEnum singleton = SimgletonEnum.INSTANCE;
		SimgletonEnum singletonBro = SimgletonEnum.INSTANCE;
		
		if (singleton == singletonBro) {
			System.out.println("��������ͬһ������   ����ģʽ����");
			
			/*
int a = 1<<31;
int b = (1<<31)-1;
-2147483648
2147483647
System.out.println(a);
System.out.println(b);
			 */
		} else {
			// ɵ���� ɵ���� ɵ���� û�а��½��Ķ���ֵ��ȥ �϶�����������ѽ
			System.out.println("����ѽ������");
		}
	}
}
/* output:
* ��������ͬһ������   ����ģʽ����
*///:~