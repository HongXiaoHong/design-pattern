package peron.hong.action.command;
/**
 * ������
 * @author ������     
 * @date   2019��7��13�� ����5:14:16   
 * @version V1.0
 */
public class Server implements Serve {

	private Cook cook;
	
	public Server() {
		super();
		cook = new Cook();
	}

	@Override
	public void orderDishes(String dishName) {
		System.out.println("�õ����� ׼��ȥ�г�ʦ����ȥ");
		cook.cook(dishName);
		System.out.println("�ϲ�");
	}

}
