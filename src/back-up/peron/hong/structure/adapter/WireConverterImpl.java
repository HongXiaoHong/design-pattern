package peron.hong.structure.adapter;
/**
 * ����ת����
 * @author ������     
 * @date   2019��7��3�� ����5:06:57   
 * @version V1.0
 */
public class WireConverterImpl implements WireConverter {

	private Usb usb;
	/**
	 * ͨ�� ���ߵ����� ��ת�����İ�����
	 * ���ߵ�����ת����usb���д���
	 * usb�е�����ת��Ϊ�����е����ݽ��д���
	 */
	@Override
	public void surfTheInternet() {
		System.out.println("�������ӽ����Ժ� ��ʼ�������ݣ�");
		System.out.println("������ת��Ϊusb��������");
		usb = new UsbImpl();
		usb.transfer();
		System.out.println("��usb���������������°�װ��ͨ�����ߴ���");
	}

}
