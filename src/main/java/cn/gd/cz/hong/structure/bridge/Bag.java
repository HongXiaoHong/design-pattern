package cn.gd.cz.hong.structure.bridge;

/**
 * ����ǰ���
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��8�� ����11:41:58
 */
public class Bag {

    private Color color;
    private String name;

    public Bag() {
        super();
    }

    public Bag(Color color, String name) {
        super();
        this.color = color;
        this.name = name;
    }

    public void getName() {
        color.getColor();
        System.out.println("���������ǣ�" + name);
    }
}
