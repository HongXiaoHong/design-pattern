package peron.hong.create.builder;

public class Client {

	public static void main(String[] args) {
		// ������һ���շ���
		House house = new House();
		// ��Ӷһ����������
		HouseBuilder builder = new BuilderOne(house);
		// �������˽�����
		ProjectManager manager = new ProjectManager(builder);
		// ���ӽ��ù黹���ͻ�
		house = manager.decorate();
		// ������
		System.out.println("result--House:"+house);
		
	}

}
/* ��� ��
* result--House:House [wall=ˮǽ, door=ˮ��, light=�ʺ��]
*///:~