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
*���ǻ�˶���� ��Ϸ�� Play
*���ǻ�˶���� ��Ϸ�� Play
* 
* �������
* �ټ���xml������ֱ������
* ��������ӿ� �������þ���ʵ��
*///:~