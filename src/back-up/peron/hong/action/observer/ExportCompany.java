package peron.hong.action.observer;
/**
 * ���ڹ�˾
 * @author ������     
 * @date   2019��7��14�� ����1:07:17   
 * @version V1.0
 */
public class ExportCompany extends Company {

	@Override
	public void response(int number) {
		if (number > 0) {
			System.out.println("����һ�����ֵ" + number + "�����㣬�����˳��ڲ�Ʒ���룬�����˳��ڹ�˾�����������ʡ�");
		} else if (number < 0) {
			System.out.println("����һ��ʱ�ֵ" + (-number) + "�����㣬�����˳��ڲ�Ʒ���룬�����˳��ڹ�˾�����������ʡ�");
		}
	}

}
