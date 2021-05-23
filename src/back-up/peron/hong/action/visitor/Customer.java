package peron.hong.action.visitor;
/**
 * �˿�
 * @author ������     
 * @date   2019��7��14�� ����7:30:26   
 * @version V1.0
 */
public class Customer {

	public static void main(String[] args) {
		ObjectStrcture strct = new ObjectStrcture();
		strct.add(new Cola());
		strct.add(new LemonSquash());
		// �����ǿɿڿ��ֹ�˾����
		strct.setVisitor(new Cocacola());
		strct.accept();
		// �����ǰ��¿��ֹ�˾����
		strct.setVisitor(new Pepsico());
		strct.accept();
	}

}
/**
result:
���� : �ɿڿ���
ԭ�����ǣ�ˮ�������ǽ�����ɰ�ǡ�����ɫ��������̼�����ᡢ������ʳ�����ϡ�
����ˮ : ѩ��
ԭ�����ǣ�ˮ�������ѽ�����ɰ�ǣ�ʳƷ��Ӽ���������̼�������ᣬ�������ƣ��������ƣ���ʳ���㾫��
���� : ���¿���
ԭ�����ǣ�ˮ�������ǽ�����ɰ�ǡ�����ɫ��������̼�����ᡢ������ʳ�����ϡ�
����ˮ : ��ϲ
ԭ�����ǣ�ˮ�������ѽ�����ɰ�ǣ�ʳƷ��Ӽ���������̼�������ᣬ�������ƣ��������ƣ���ʳ���㾫��
*/