package peron.hong.structure.flyweight;

public class DeliPrinter implements Printer {

	@Override
	public void print(Document doc) {
		System.out.println("����һ��������ӡ�� �ܸ��� ��ӭʹ��");
		System.out.println("�����ڴ�ӡ���ǣ�"+doc.getName());
	}

}
