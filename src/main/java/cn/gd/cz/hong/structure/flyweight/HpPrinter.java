package cn.gd.cz.hong.structure.flyweight;

public class HpPrinter implements Printer {

    @Override
    public void print(Document doc) {
        System.out.println("我是一个惠普打印机 优惠不普通 欢迎使用");
        System.out.println("您现在打印的是：" + doc.getName());
    }

}
