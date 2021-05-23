package cn.gd.cz.hong.action.iterator;

import java.util.Iterator;

/**
 * ��ʳ��
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����5:23:16
 */
public class Foodie {

    public static void main(String[] args) {
        ChocolateList chocolateList = new ChocolateList(10);
        chocolateList.addChocolate(new Chocolate("������"));
        chocolateList.addChocolate(new Chocolate("������"));
        chocolateList.addChocolate(new Chocolate("Բ��"));
        chocolateList.addChocolate(new Chocolate("��Բ��"));
        chocolateList.addChocolate(new Chocolate("����"));
        Iterator<Chocolate> it = chocolateList.iterator();
        while (it.hasNext()) {
            Chocolate next = it.next();
            System.out.format("ȡ���ɿ���%s, ����\n", next.name);
        }
    }

}
/**
 * result:
 * ȡ���ɿ���������, ����
 * ȡ���ɿ���������, ����
 * ȡ���ɿ���Բ��, ����
 * ȡ���ɿ�����Բ��, ����
 * ȡ���ɿ�������, ����
 *///:~