package peron.hong.create.singleton;
/**
 * ʹ��ö�����ʹ���һ������
 * @author ������     
 * @date   2019��5��6�� ����4:28:22   
 * @version V1.0
 */
public enum SimgletonEnum {

	/**
	 * ��Ҫʹ���Զ���Ĺ�����������г�ʼ��
	 * ��   , ������ͬ��ö��
	 * ��   ; ����ö�������� ö�����͵����Ժͷ���
	 */
	INSTANCE(1),;
	/**
	 * һ�µĲ�������ͨ��һ��
	 */
	private int key;
	
	SimgletonEnum(int key) {
		// �����Լ������η� ���ʿ������η�Ҳ������
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
}
