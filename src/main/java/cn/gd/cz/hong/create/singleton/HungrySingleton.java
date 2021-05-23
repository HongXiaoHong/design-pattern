package cn.gd.cz.hong.create.singleton;

/**
 * 单例模式
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年4月16日 下午1:53:14
 */
public class HungrySingleton {

    // 创建一个引用用于保存单个的实例 这里使用static保证只有一个引用
    private static HungrySingleton instance = new HungrySingleton();

    // 将构造器私有化 只能在该类中创建实例/对象
    private HungrySingleton() {
        super();
    }

    // 饿汉式单例模式 对象创建的时候就初始化
    // 必须使用static 如果不使用static 则没有办法使用
    public static HungrySingleton getSingleton() {
        return instance;
    }
}
