package peron.hong.action.responsibility;
/**
 * �����
 * @author ������     
 * @date   2019��7��13�� ����11:24:33   
 * @version V1.0
 */
public class Foreigners {

	public static void main(String[] args) {
		Department en = new EnvironmentalProtection("����������");
		Department foreign = new ForeignAffairs("�⽻��");
		en.setDep(foreign);
		
		System.out.println("����˿�ʼѰ���йز���");
		en.execute("������");
	}
}/**
result:
����˿�ʼѰ���йز���
���� ����������Ϊ������ ��Ҫ�ҵ��ǣ�������
�뵽��ز��Ž��а��� 
���� �⽻��Ϊ������ ��Ҫ�ҵ��ǣ�������
�뵽��ز��Ž��а��� 
���˴���  ������ ������ѽ
*///:~
