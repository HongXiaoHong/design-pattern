package peron.hong.action.visitor;
/**
 * �ɿڿ��ֹ�˾
 * @author ������     
 * @date   2019��7��14�� ����7:21:43   
 * @version V1.0
 */
public class Cocacola extends Company {

	@Override
	public void visit(LemonSquash lemonSquash) {
		System.out.println("����ˮ : ѩ��");
		System.out.println("ԭ�����ǣ�"+ lemonSquash.material);
	}

	@Override
	public void visit(Cola cola) {
		System.out.println("���� : �ɿڿ���");
		System.out.println("ԭ�����ǣ�"+ cola.material);
	}

}
