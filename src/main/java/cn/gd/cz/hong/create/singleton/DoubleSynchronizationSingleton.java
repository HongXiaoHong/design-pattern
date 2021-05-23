package cn.gd.cz.hong.create.singleton;

/**
 * ����ģʽ--˫���̰߳�ȫʽ
 *
 * @author ������
 * @version V1.0
 * @date 2019��4��16�� ����5:28:38
 */
public class DoubleSynchronizationSingleton {

    // ����һ���������ڱ��浥����ʵ�� ����ʹ��static��ֻ֤��һ������
    private static DoubleSynchronizationSingleton instance;

    // ��������˽�л� ֻ���ڸ����д���ʵ��/����
    private DoubleSynchronizationSingleton() {
        super();
    }

    // ����ʽ����ģʽ Ҳ���ǵ�Ҫ�õ���ʱ��Ž��г�ʼ��
    // ����ʹ��static �����ʹ��static ��û�а취ʹ��
    public static DoubleSynchronizationSingleton getSingleton() {
        // ���Ϊ�� �Ž���ͬ��
        if (instance == null) {
            synchronized (DoubleSynchronizationSingleton.class) {
                // ȡ����֮���ٴ��ж��Ƿ��Ѿ���ʼ�� û������г�ʼ��
                if (instance == null) {
                    // ��ʼ��
                    instance = new DoubleSynchronizationSingleton();
                }
            }
        }
        return instance;
    }
}
