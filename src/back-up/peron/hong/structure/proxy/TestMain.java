package peron.hong.structure.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestMain {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
//		for (int i = 0; i < list.size(); i++) {
//		    list.remove(i);
//		}
		/**
		 * ���F�@�ӵĽY������
		 * �ڄh�����^������
		 * ���M�l��׃�� ���������]��������׃ ���h������������Ԫ��
		 * 
		 * result : [b, d]
		 */

//		for (String s : list) {
//			if (s.equals("a"))
//				list.remove(s);
//		}
		/**
		 * ���������쳣��ԭ������Ϊ
		 * 
		 * jdkΪ�˷�ֹʹ��foreach�﷨�������ϵ�ʱ�����ɾ��
		 * foreach�﷨��ʵ����ʹ��iterator���б���
		 * ��ΪʲôҪ��ֹ��
		 * ��Ϊ�ڱ�����ʱ�򼯺ϱ���ļ��Ϸ����仯
		 * ���Ǳ�����ʱ��������û��������Ӧ�ĸı�
		 * ������ʱ����ɾ������ֲ�һ���Ľ��
		 * ����Ҫ�ž� ����ʹ��Iterator����Ͳ�һ����
		 * �������ж���������ά��
		 * ����ɾ���Ĺ�����Ҳ�����������˸���
		 * ɾ�����Գɹ�
		 * result: Exception in thread "main" java.util.ConcurrentModificationException
		 * at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909) at
		 * java.util.ArrayList$Itr.next(ArrayList.java:859) at
		 * peron.hong.structure.proxy.TestMain.main(TestMain.java:18)
		 */

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			iter.next();
			iter.remove();
		}
		/**
		 * ������ȵ���next�����Ļ� Ҳ�ǻ�����쳣��
		 * Exception in thread "main" java.lang.IllegalStateException
	at java.util.ArrayList$Itr.remove(ArrayList.java:872)
	at peron.hong.structure.proxy.TestMain.main(TestMain.java:44)
		 * result: []
		 */
		System.out.println(list);
	}

}
