package peron.hong.structure.bridge;

public class Customer {

	public static void main(String[] args) {
		
		// �����Ѿ�������һ�������ڷ��ڹ�̨��
		Color color = new Red();
		Bag bag = new Bag(color, "���");
		// һλ ����������ѡ�� ׼���͸�����Ů����
		bag.getName();
	}
}
