package cn.gd.cz.hong.structure.decorator;

/**
 * ��Ա ���ۺ�����
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��9�� ����10:48:39
 */
public class Clerk {

    public static void main(String[] args) {
        Base base = new Base();
        VegetablesDecorator veg = new VegetablesDecorator(base);
        veg.show();

        PepperDecorator pep = new PepperDecorator(veg);
        pep.show();
    }

}
