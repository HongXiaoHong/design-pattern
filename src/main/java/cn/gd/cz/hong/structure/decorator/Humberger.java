package cn.gd.cz.hong.structure.decorator;

/**
 * 汉堡包的类
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月9日 上午10:30:56
 */
public class Humberger {

    protected String name;

    public Humberger() {
        super();
    }

    public void show() {
        System.out.println("我是汉堡：" + name);
    }
}
