package peron.hong.action.visitor;
/**
 * ���¿��ֹ�˾
 * @author ������     
 * @date   2019��7��14�� ����7:21:43   
 * @version V1.0
 */
public class Pepsico extends Company {

	@Override
	public void visit(LemonSquash lemonSquash) {
		System.out.println("����ˮ : ��ϲ");
		System.out.println("ԭ�����ǣ�"+ lemonSquash.material);
	}

	@Override
	public void visit(Cola cola) {
		System.out.println("���� : ���¿���");
		System.out.println("ԭ�����ǣ�"+ cola.material);
	}

}
