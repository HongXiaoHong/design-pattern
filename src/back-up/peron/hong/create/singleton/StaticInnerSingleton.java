package peron.hong.create.singleton;
/**
 * ͨ����̬�ڲ���ʵ�ֵ���
 * @author ������     
 * @date   2019��12��6�� ����10:10:23   
 * @version V1.0
 */
public class StaticInnerSingleton {

	/**
	 * ˽�л�������
	 */
	private StaticInnerSingleton() {
		System.out.println("����ģʽ��ʼ��");
	}
	
	/**
	 * ��ȡ��������
	 * @return
	 */
	public static StaticInnerSingleton getSingleton() {
		return Inner.singleton;
	}
	
	/**
	 * ͨ����̬�ڲ������ 
	 * @author ������     
	 * @date   2019��12��6�� ����10:17:00   
	 * @version V1.0
	 */
	private static class Inner {
		private static final StaticInnerSingleton singleton = new StaticInnerSingleton();
	}
	
	/**
	 * ����һ��
	 * @param args
	 */
	public static void main(String[] args) {
		StaticInnerSingleton s0 = getSingleton();
		StaticInnerSingleton s1 = getSingleton();
		if (s0==s1) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
	}

}
