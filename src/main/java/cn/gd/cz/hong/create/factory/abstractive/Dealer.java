package cn.gd.cz.hong.create.factory.abstractive;

import cn.gd.cz.hong.create.util.ReadXml;

public class Dealer {

    public static void main(String[] args) {
        Farm farm = (Farm) ReadXml.getObject("config/configAbstractive.xml");
        Animal animal = farm.newAnimal();
        Plant plant = farm.newPlant();
        System.out.println("animal:");
        animal.play();
        System.out.println("plant:");
        plant.show();

    }

}
/* result:
 *animal:
 *I am a pig +.+
 *plant:
 *I am an apple  >.<
 *
 * 结果分析
 * 抽象工厂模式对新增加产品族是开放的
 * 但是产品族修改产品就是关闭的咯
 * 所以其实抽象工厂模式是工厂模式的特例罢了
 *///:~