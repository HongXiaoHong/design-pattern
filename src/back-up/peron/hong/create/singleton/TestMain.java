///:
package peron.hong.create.singleton;

public class TestMain {

	public static void main(String[] args) {
//		测试懒汉式单例模式
//		Singleton singleton = Singleton.getSingleton();
//		Singleton singletonBro = Singleton.getSingleton();
//		测试饿汉式单例模式
//		HungrySingleton singleton = HungrySingleton.getSingleton();
//		HungrySingleton singletonBro = HungrySingleton.getSingleton();
//		测试同步懒汉式单例模式
//		DoubleSynchronizationSingleton singleton = DoubleSynchronizationSingleton.getSingleton();
//		DoubleSynchronizationSingleton singletonBro = DoubleSynchronizationSingleton.getSingleton();
//		测试双重同步懒汉式单例模式
//		DoubleSynchronizationSingleton singleton = DoubleSynchronizationSingleton.getSingleton();
//		DoubleSynchronizationSingleton singletonBro = DoubleSynchronizationSingleton.getSingleton();
//		测试枚举式单例模式---终极绝招
		SimgletonEnum singleton = SimgletonEnum.INSTANCE;
		SimgletonEnum singletonBro = SimgletonEnum.INSTANCE;
		
		if (singleton == singletonBro) {
			System.out.println("这两个是同一个引用   单例模式成立");
			
			/*
int a = 1<<31;
int b = (1<<31)-1;
-2147483648
2147483647
System.out.println(a);
System.out.println(b);
			 */
		} else {
			// 傻逼了 傻逼了 傻逼了 没有把新建的对象赋值回去 肯定是两个引用呀
			System.out.println("不行呀？？？");
		}
	}
}
/* output:
* 这两个是同一个引用   单例模式成立
*///:~