package peron.hong.structure.compose;

public class Businessman {

	public static void main(String[] args) {
		Company com = new Company("�ܹ�˾");
		com.add(new Department("������"));
		com.add(new Department("���۲�"));
		com.add(new Department("����"));
		com.add(new Department("���²�"));
		com.show();
	}

}
/**
 * result:
My name is ������
My name is ���۲�
My name is ����
My name is ���²�

 */
