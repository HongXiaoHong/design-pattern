package cn.gd.cz.hong.structure.decorator;

/**
 * ������
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��9�� ����10:45:43
 */
public class PepperDecorator extends Humberger {

    public PepperDecorator(Humberger humberger) {
        super.name = "����" + humberger.name;
    }
}
