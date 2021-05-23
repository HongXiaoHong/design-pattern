package cn.gd.cz.hong.action.memo;

import java.util.Date;

/**
 * ��Ա��
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����9:08:23
 */
public class Clerk {
    /**
     * ��������õ���ʱ�����״̬
     * ������ײ�Ļ����С
     * �Ͼ�������ֵ��ٶȻ��Ǻ�����
     *
     * @param args
     */
    public static void main(String[] args) {
        EditPanel panel = new EditPanel();
        Container container = new Container();
        System.out.println("�༭��һ�� ǰ����ϲ��  --������ ����ϲ����");
        String state = String.valueOf(new Date().getTime());
        container.addMemo(panel.createMemo(state));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("�༭��һ�� ǰ����ϲ����  --������ ����ϲ���� ��������");
        state = String.valueOf(new Date().getTime());
        container.addMemo(panel.createMemo(state));
        System.out.println("������˼ ����� ��� ��ϲ���� �������� ��ʵ������� ��ϲ����  ���ݹ���");
        System.out.println("׼������");
        System.out.println("���ڵ�״̬�ǣ�" + panel.getState());
        Memo memo = container.removeMemo();
        panel.restoreState(memo);
        System.out.println("�����Ժ��״̬�ǣ�" + panel.getState());
    }
}
