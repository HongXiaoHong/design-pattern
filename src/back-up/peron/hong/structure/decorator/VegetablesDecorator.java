package peron.hong.structure.decorator;
/**
 * ���߲�
 * @author ������     
 * @date   2019��7��9�� ����10:45:52   
 * @version V1.0
 */
public class VegetablesDecorator extends Humberger {

	public VegetablesDecorator(Humberger humberger) {
		super.name = "�߲�" + humberger.name;
	}
}
