package peron.hong.structure.decorator;
/**
 * ������
 * @author ������     
 * @date   2019��7��9�� ����10:45:43   
 * @version V1.0
 */
public class PepperDecorator extends Humberger {
	
	public PepperDecorator(Humberger humberger) {
		super.name = "����" + humberger.name;
	}
}
