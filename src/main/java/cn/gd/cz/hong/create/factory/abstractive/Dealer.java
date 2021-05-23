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
 * �������
 * ���󹤳�ģʽ�������Ӳ�Ʒ���ǿ��ŵ�
 * ���ǲ�Ʒ���޸Ĳ�Ʒ���ǹرյĿ�
 * ������ʵ���󹤳�ģʽ�ǹ���ģʽ����������
 *///:~