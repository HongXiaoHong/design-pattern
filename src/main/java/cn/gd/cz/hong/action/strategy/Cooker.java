package cn.gd.cz.hong.action.strategy;

/**
 * һ����ʦ׼������һ���Ź���صĲ�ʽ
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��13�� ����1:42:53
 */
public class Cooker {

    public static void main(String[] args) {
        Cooking cooking = new Steamed();

        CookSpareribs cookSpareibs = new CookSpareribs();
        cookSpareibs.setCooking(cooking);
        cookSpareibs.cookSpareribs();

        cooking = new BraiseInSoySauce();
        cookSpareibs.setCooking(cooking);
        cookSpareibs.cookSpareribs();

        cooking = new Soup();
        cookSpareibs.setCooking(cooking);
        cookSpareibs.cookSpareribs();
    }

}/**
 * result:
 * ׼���õ�ζƷ ʳ��
 * Start ��ʼ����
 * ����   �嵭�ر� �������ΰͼ���
 * End һ����ζ���Źǲ�ʽ���ʳ�¯
 * ׼���õ�ζƷ ʳ��
 * Start ��ʼ����
 * ����  ��ը����������ֵ���  �ҷ�����
 * End һ����ζ���Źǲ�ʽ���ʳ�¯
 * ׼���õ�ζƷ ʳ��
 * Start ��ʼ����
 * ��������   ���Լ��붬�� ���� �ݹ�������ζƷ
 * End һ����ζ���Źǲ�ʽ���ʳ�¯
 *///:~