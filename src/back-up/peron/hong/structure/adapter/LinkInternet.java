package peron.hong.structure.adapter;
/**
 * 
 * @author ������     
 * @date   2019��7��3�� ����5:11:59   
 * @version V1.0
 *///:)
public class LinkInternet {

	public static void main(String[] args) {
		System.out.println("��Ҫ������ ��ϧ�����ֻ����WiFi");
		System.out.println("WiFi̫���� ��Ҫ��ը�� ��Ҫ�������� ");
		System.out.println("��ϧ����������ᱡ��û�����߽ӿ�  ������ʹ������usbת������");
		WireConverter coverter = new WireConverterImpl();
		coverter.surfTheInternet();
		System.out.println("̫ˬ�� �����ٿ���ѽ ����");
	}

}
/**
result :
��Ҫ������ ��ϧ�����ֻ����WiFi
WiFi̫���� ��Ҫ��ը�� ��Ҫ�������� 
��ϧ����������ᱡ��û�����߽ӿ�  ������ʹ������usbת������
�������ӽ����Ժ� ��ʼ�������ݣ�
������ת��Ϊusb��������
���ӵ����Ե�usb����д���
��usb���������������°�װ��ͨ�����ߴ���
̫ˬ�� �����ٿ���ѽ ����
*///:~