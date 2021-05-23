package peron.hong.create.singleton;
/**
 * ����ģʽ
 * @author ������     
 * @date   2019��4��16�� ����1:53:14   
 * @version V1.0
 */
public class HungrySingleton {

	// ����һ���������ڱ��浥����ʵ�� ����ʹ��static��ֻ֤��һ������
	private static HungrySingleton instance = new HungrySingleton();
	
	// ��������˽�л� ֻ���ڸ����д���ʵ��/����
	private HungrySingleton() {
		super();
	}
	
	// ����ʽ����ģʽ ���󴴽���ʱ��ͳ�ʼ��
	// ����ʹ��static �����ʹ��static ��û�а취ʹ��
	public static HungrySingleton getSingleton() {
		return instance;
	}
}
