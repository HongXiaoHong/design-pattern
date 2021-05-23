package cn.gd.cz.hong.create.singleton;

/**
 * 使用枚举类型创建一个单例
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年5月6日 下午4:28:22
 */
public enum SimgletonEnum {

    /**
     * 需要使用自定义的构造器对其进行初始化
     * 用   , 隔开不同的枚举
     * 用   ; 隔开枚举类型与 枚举类型的属性和方法
     */
    INSTANCE(1),
    ;
    /**
     * 一下的操作跟普通类一样
     */
    private int key;

    SimgletonEnum(int key) {
        // 不可以加上修饰符 访问控制修饰符也不行呢
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
