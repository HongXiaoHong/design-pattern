package peron.hong.create.factory.temp;

import org.junit.Test;

/**
 * ����ģʽ
 * @author ������     
 * @date   2019��3��13�� ����10:46:14   
 * @version V1.0
 */
public class Factory {

	@Test()
	public void test () {
		// ͨ�������ķ�����ȡͼ��
		Shape circle = getShape(0);
		// ����ͼ�εĻ��ķ���
		circle.draw();
	}
	/**
	 * ������ķ�����ͨ������һ���������һ������
	 * �����Ҫ����һ����Ʒ�������������
	 *   ����Ҫʵ��Shape�ӿڣ�Ȼ���ڸ÷���������²�Ʒ�Ĵ���
	 *   �ô��ǲ����Լ������Ϳ���ʹ�ö���
	 *   ��������϶ȹ��ߣ�ֻҪ���µ����;͵��޸�ԭ�����࣬Υ���˿���ԭ��
	 * @param flag
	 * @return
	 */
	public Shape getShape(int flag) {
		switch (flag) {
		case 0 :
			return new Circle();
		case 1 :
			return new Square();
		case 2 :
			return new Rectangle();
		default :
			return null;
		}
	}
}
