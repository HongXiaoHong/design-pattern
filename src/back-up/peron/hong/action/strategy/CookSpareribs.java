package peron.hong.action.strategy;
/**
 * �����Ź���ز�ʽ
 * @author ������     
 * @date   2019��7��13�� ����1:37:21   
 * @version V1.0
 */
public class CookSpareribs {

	private Cooking cooking;

	public Cooking getCooking() {
		return cooking;
	}

	public void setCooking(Cooking cooking) {
		this.cooking = cooking;
	}
	public void cookSpareribs() {
		System.out.println("׼���õ�ζƷ ʳ��");
		System.out.println("Start ��ʼ����");
		cooking.cook();
		System.out.println("End һ����ζ���Źǲ�ʽ���ʳ�¯");
	}
}
