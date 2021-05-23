package cn.gd.cz.hong.create.singleton;

/**
 * 单例模式--双重线程安全式
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年4月16日 下午5:28:38
 */
public class DoubleSynchronizationSingleton {

    // 创建一个引用用于保存单个的实例 这里使用static保证只有一个引用
    private static DoubleSynchronizationSingleton instance;

    // 将构造器私有化 只能在该类中创建实例/对象
    private DoubleSynchronizationSingleton() {
        super();
    }

    // 懒汉式单例模式 也就是当要用到的时候才进行初始化
    // 必须使用static 如果不使用static 则没有办法使用
    public static DoubleSynchronizationSingleton getSingleton() {
        // 如果为空 才进入同步
        if (instance == null) {
            synchronized (DoubleSynchronizationSingleton.class) {
                // 取得锁之后再次判断是否已经初始化 没有则进行初始化
                if (instance == null) {
                    // 初始化
                    instance = new DoubleSynchronizationSingleton();
                }
            }
        }
        return instance;
    }
}
