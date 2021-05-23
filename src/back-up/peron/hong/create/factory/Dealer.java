package peron.hong.create.factory;

import peron.hong.create.util.ReadXml;

//:
public class Dealer {

	public static void main(String[] args) {
		Company company = new AsusCompany();
		Computer computer = company.produce();
		computer.play();
		
		Company com = (Company) ReadXml.getObject("config/config.xml");
		Computer product = com.produce();
		product.play();
	}

}
/* result:
*我是华硕电脑 游戏本 Play
*我是华硕电脑 游戏本 Play
* 
* 结果分析
* 再加上xml解析简直是完美
* 编码面向接口 配置配置具体实现
*///:~