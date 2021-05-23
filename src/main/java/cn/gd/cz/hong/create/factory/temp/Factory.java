package cn.gd.cz.hong.create.factory.temp;


/**
 * 工厂模式
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年3月13日 下午10:46:14
 */
public class Factory {

	/**
	 * 工厂类的方法，通过传递一个参数造出一个对象
	 * 如果需要增加一个产品，例如等腰梯形
	 * 则需要实现Shape接口，然后在该方法中添加新产品的创建
	 * 好处是不用自己创建就可以使用对象
	 * 坏处是耦合度过高，只要有新的类型就得修改原来的类，违背了开闭原则
	 *
	 * @param flag
	 * @return
	 */
	public Shape getShape(int flag) {
		switch (flag) {
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Rectangle();
			default:
				return null;
		}
	}
}
