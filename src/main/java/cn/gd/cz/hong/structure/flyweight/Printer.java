package cn.gd.cz.hong.structure.flyweight;

/**
 * 会打印的东西
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月9日 下午11:33:11
 */
public interface Printer {

    // 通过传入可变 也就是不共享的元素或者说是对象吧
    void print(Document doc);
}
