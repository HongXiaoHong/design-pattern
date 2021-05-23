package peron.hong.create.singleton;
/**
 * 单例模式--线程安全式 效率比较低 如果多个进程访问 必须先等上一个线程访问完才能访问
 * @author 洪晓鸿     
 * @date   2019年4月16日 下午5:28:38   
 * @version V1.0
 */
public class SynchronizationSingleton {

	// 创建一个引用用于保存单个的实例 这里使用static保证只有一个引用
	// volatile保证 instance 在所有线程中同步
	private volatile static SynchronizationSingleton instance;
	// 将构造器私有化 只能在该类中创建实例/对象
	private SynchronizationSingleton() {
		super();
	}
	// 懒汉式单例模式 也就是当要用到的时候才进行初始化
	// 必须使用static 如果不使用static 则没有办法使用
	public synchronized static SynchronizationSingleton getSingleton() {
		// 如果为空 则进行初始化
		if (instance==null) {
			instance = new SynchronizationSingleton();
		}
		return instance;
	}
}
