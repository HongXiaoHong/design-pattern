package cn.gd.cz.hong.create.prototype;

//:
public class Machine {

    public static void main(String[] args) {
        Product product = new Product();
        product.setLength(5);
        product.setWidth(4);
        product.setHeight(6);
        // metal 金属  material 材料
        product.setMaterial("metal");
        try {
            Product copy = (Product) product.clone();
            String result = String.format("copy之后得到的对象的属性值为：长度--%s，宽度--%s，高度--%s，材料--%s。", copy.getLength(), copy.getWidth(), copy.getHeight(), copy.getMaterial());
            System.out.println(result);
            System.out.println("复制之后是否相等：" + (product == copy ? "相等" : "不相等"));
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆发生异常");
            e.printStackTrace();
        }

    }

}
/* result-->
 *创建了一个产品
 *copy之后得到的对象的属性值为：长度--5，宽度--4，高度--6，材料--metal。
 *复制之后是否相等：不相等
 * 结果分析 ：String也可以得到克隆 原来String也属于浅克隆的 一部分呀
 * copy不会再调用构造器
 * 复制之后的对象是另外的对象跟原来的对象不是同一个
 *///:~