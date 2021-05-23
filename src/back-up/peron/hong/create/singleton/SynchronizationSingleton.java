package peron.hong.create.singleton;
/**
 * ����ģʽ--�̰߳�ȫʽ Ч�ʱȽϵ� ���������̷��� �����ȵ���һ���̷߳�������ܷ���
 * @author ������     
 * @date   2019��4��16�� ����5:28:38   
 * @version V1.0
 */
public class SynchronizationSingleton {

	// ����һ���������ڱ��浥����ʵ�� ����ʹ��static��ֻ֤��һ������
	// volatile��֤ instance �������߳���ͬ��
	private volatile static SynchronizationSingleton instance;
	// ��������˽�л� ֻ���ڸ����д���ʵ��/����
	private SynchronizationSingleton() {
		super();
	}
	// ����ʽ����ģʽ Ҳ���ǵ�Ҫ�õ���ʱ��Ž��г�ʼ��
	// ����ʹ��static �����ʹ��static ��û�а취ʹ��
	public synchronized static SynchronizationSingleton getSingleton() {
		// ���Ϊ�� ����г�ʼ��
		if (instance==null) {
			instance = new SynchronizationSingleton();
		}
		return instance;
	}
}
