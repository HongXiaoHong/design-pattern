package peron.hong.action.visitor;
/**
 * ����Ԫ��
 * @author ������     
 * @date   2019��7��14�� ����7:15:30   
 * @version V1.0
 */
public class Cola implements Element {

	public String material = "ˮ�������ǽ�����ɰ�ǡ�����ɫ��������̼�����ᡢ������ʳ�����ϡ�";
	@Override
	public void accecpt(Company visitor) {
		visitor.visit(this);
	}

}
