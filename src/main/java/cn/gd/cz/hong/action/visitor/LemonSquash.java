package cn.gd.cz.hong.action.visitor;

/**
 * ������ˮ
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����7:14:18
 */
public class LemonSquash implements Element {

    public String material = "ˮ�������ѽ�����ɰ�ǣ�ʳƷ��Ӽ���������̼�������ᣬ�������ƣ��������ƣ���ʳ���㾫��";

    @Override
    public void accecpt(Company visitor) {
        visitor.visit(this);
    }

}
