package cn.gd.cz.hong.action.observer;

/**
 * ����һ���
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����1:07:07
 */
public class RmbRate extends Rate {

    public static void main(String[] args) {
        System.out.println("������ʱ仯");
        Company importCompany = new ImportCompany();
        Company exportCompany = new ExportCompany();
        Rate rate = new RmbRate();
        rate.add(importCompany);
        rate.add(exportCompany);
        rate.change(10);
        rate.change(-5);
    }
}
/**
 * result:
 * ������ʱ仯
 * ����һ�����ֵ10�����㣬�����˽��ڲ�Ʒ�ɱ��������˽��ڹ�˾�����ʡ�
 * ����һ�����ֵ10�����㣬�����˳��ڲ�Ʒ���룬�����˳��ڹ�˾�����������ʡ�
 * ����һ��ʱ�ֵ5�����㣬�����˽��ڲ�Ʒ�ɱ��������˽��ڹ�˾�����ʡ�
 * ����һ��ʱ�ֵ5�����㣬�����˳��ڲ�Ʒ���룬�����˳��ڹ�˾�����������ʡ�
 */