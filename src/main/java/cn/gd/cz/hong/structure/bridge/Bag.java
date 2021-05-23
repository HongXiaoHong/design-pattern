package cn.gd.cz.hong.structure.bridge;

/**
 * 这个是包包
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月8日 下午11:41:58
 */
public class Bag {

    private Color color;
    private String name;

    public Bag() {
        super();
    }

    public Bag(Color color, String name) {
        super();
        this.color = color;
        this.name = name;
    }

    public void getName() {
        color.getColor();
        System.out.println("种类名字是：" + name);
    }
}
