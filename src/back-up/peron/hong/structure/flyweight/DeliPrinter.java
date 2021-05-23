package peron.hong.structure.flyweight;

public class DeliPrinter implements Printer {

	@Override
	public void print(Document doc) {
		System.out.println("我是一个得力打印机 很给力 欢迎使用");
		System.out.println("您现在打印的是："+doc.getName());
	}

}
