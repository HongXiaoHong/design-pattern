package peron.hong.structure.flyweight;

public class Employee {

	public static void main(String[] args) {
		PrinterFactory fac = new PrinterFactory();
		Printer deliPrinter1 = fac.getPrinterByKey("peron.hong.structure.flyweight.DeliPrinter");
		Printer deliPrinter2 = fac.getPrinterByKey("peron.hong.structure.flyweight.DeliPrinter");
		deliPrinter1.print(new Document("Doc === hong.doc"));
		deliPrinter2.print(new Document("图片 === hong.jpg"));
		
	}

}
/**
 * result:
从映射中拿到对象 而不是自己再次创建对象
我是一个得力打印机 很给力 欢迎使用
您现在打印的是：Doc === hong.doc
我是一个得力打印机 很给力 欢迎使用
您现在打印的是：图片 === hong.jpg
 *///:~
