package cn.gd.cz.hong.action.observer;

/**
 * ���ڹ�˾
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����1:07:24
 */
public class ImportCompany extends Company {

    @Override
    public void response(int number) {
        if (number > 0) {
            System.out.println("����һ�����ֵ" + number + "�����㣬�����˽��ڲ�Ʒ�ɱ��������˽��ڹ�˾�����ʡ�");
        } else if (number < 0) {
            System.out.println("����һ��ʱ�ֵ" + (-number) + "�����㣬�����˽��ڲ�Ʒ�ɱ��������˽��ڹ�˾�����ʡ�");
        }
    }

}
