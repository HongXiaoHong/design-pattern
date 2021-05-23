package cn.gd.cz.hong.structure.appearance;

/**
 * ���ģʽʵ����
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��9�� ����2:09:26
 */
public class Facade {

    private Register reg;
    private Interrogation inter;
    private Medicine med;

    public Facade() {
        reg = new Register();
        inter = new Interrogation();
        med = new Medicine();
    }

    public void regiter() {
        reg.register();
    }

    public void interrodate() {
        inter.interrogation();
    }

    public void takeMedicine() {
        med.takeMedicine();
    }
}
