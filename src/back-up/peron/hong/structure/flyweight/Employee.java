package peron.hong.structure.flyweight;

public class Employee {

	public static void main(String[] args) {
		PrinterFactory fac = new PrinterFactory();
		Printer deliPrinter1 = fac.getPrinterByKey("peron.hong.structure.flyweight.DeliPrinter");
		Printer deliPrinter2 = fac.getPrinterByKey("peron.hong.structure.flyweight.DeliPrinter");
		deliPrinter1.print(new Document("Doc === hong.doc"));
		deliPrinter2.print(new Document("ͼƬ === hong.jpg"));
		
	}

}
/**
 * result:
��ӳ�����õ����� �������Լ��ٴδ�������
����һ��������ӡ�� �ܸ��� ��ӭʹ��
�����ڴ�ӡ���ǣ�Doc === hong.doc
����һ��������ӡ�� �ܸ��� ��ӭʹ��
�����ڴ�ӡ���ǣ�ͼƬ === hong.jpg
 *///:~
