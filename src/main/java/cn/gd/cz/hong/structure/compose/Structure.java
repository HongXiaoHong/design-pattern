package cn.gd.cz.hong.structure.compose;

/**
 * ���ڱ�ʾ��˾�Ľṹ�еĸ������ŵĻ���
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��10�� ����10:43:36
 */
public class Structure {

    // ��ʵ���������ñ�־λ����ת�� �����ҾͿ��Բ�������ķ���
    private boolean flag; // it means what is leaf or not
    private String name;  // it means that Struture's name

    public Structure(boolean flag, String name) {
        this.flag = flag;
        this.name = name;
    }

    public boolean isLeaf() {
        // true means leaf false is not
        return flag;
    }

    public void show() {
        System.out.println(String.format("My name is %s", name));
    }
}
