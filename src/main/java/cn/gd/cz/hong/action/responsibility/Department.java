package cn.gd.cz.hong.action.responsibility;

/**
 * ��ز���
 * �����������ز��Ű참
 * �Ǻ�
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��13�� ����11:14:13
 */
public class Department {

    private Department dep;
    private String name;

    public Department(String name) {
        super();
        this.name = name;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public void execute(String depName) {
        System.out.println("���� " + name + "Ϊ������ ��Ҫ�ҵ��ǣ�" + depName);
        if (name.equals(depName)) {
            System.out.println(depName + "�������   ���Ժ�");
            System.out.println("�Ѿ���ɰ���  ");
            return;
        }
        System.out.println("�뵽��ز��Ž��а��� ");
        if (dep != null) {
            dep.execute(depName);
        } else {
            System.out.println("���˴���  ������ ������ѽ");
        }
    }
}
