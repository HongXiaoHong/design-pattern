package peron.hong.create.singleton;
/**
 * ����ģʽ
 * @author ������     
 * @date   2019��4��16�� ����1:53:14   
 * @version V1.0
 */
public class Singleton {

	// ����һ���������ڱ��浥����ʵ�� ����ʹ��static��ֻ֤��һ������
	private static Singleton instance;
	// ��������˽�л� ֻ���ڸ����д���ʵ��/����
	private Singleton() {
		super();
	}
	// ����ʽ����ģʽ Ҳ���ǵ�Ҫ�õ���ʱ��Ž��г�ʼ��
	// ����ʹ��static �����ʹ��static ��û�а취ʹ��
	public static Singleton getSingleton() {
		// ���Ϊ�� ����г�ʼ��
		if (instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}
