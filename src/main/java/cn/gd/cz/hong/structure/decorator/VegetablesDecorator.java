package cn.gd.cz.hong.structure.decorator;

/**
 * ���߲�
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��9�� ����10:45:52
 */
public class VegetablesDecorator extends Humberger {

    public VegetablesDecorator(Humberger humberger) {
        super.name = "�߲�" + humberger.name;
    }
}
