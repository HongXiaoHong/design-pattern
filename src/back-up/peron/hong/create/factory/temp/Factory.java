package peron.hong.create.factory.temp;

import org.junit.Test;

/**
 * 工厂模式
 * @author 洪晓鸿     
 * @date   2019年3月13日 下午10:46:14   
 * @version V1.0
 */
public class Factory {

	@Test()
	public void test () {
		// 通过工厂的方法获取图形
		Shape circle = getShape(0);
		// 调用图形的画的方法
		circle.draw();
	}
	/**
	 * 工厂类的方法，通过传递一个参数造出一个对象
	 * 如果需要增加一个产品，例如等腰梯形
	 *   则需要实现Shape接口，然后在该方法中添加新产品的创建
	 *   好处是不用自己创建就可以使用对象
	 *   坏处是耦合度过高，只要有新的类型就得修改原来的类，违背了开闭原则
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
