package cn.gd.cz.hong.structure.flyweight;

public class HpPrinter implements Printer {

    @Override
    public void print(Document doc) {
        System.out.println("����һ�����մ�ӡ�� �Żݲ���ͨ ��ӭʹ��");
        System.out.println("�����ڴ�ӡ���ǣ�" + doc.getName());
    }

}
