package cn.gd.cz.hong.action.interpreter;

/**
 * �ͻ�
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����10:01:02
 */
public class Customer {
    /*�ķ�����
      <expression> ::= <city>��<person>
      <city> ::= ����|����
      <person> ::= ����|�и�|С��|�м���
    */
    public static void main(String[] args) {
        Context context = new Context();
        context.freeRide("���ݵ�����");
        context.freeRide("���ݵ�������");
        context.freeRide("���ݵĸ�Ů");
        context.freeRide("���ݵĶ�ͯ");
        context.freeRide("ɽ���Ķ�ͯ");
    }

}/**
 * result:
 * �ַ������ݵ����˷��Ϲ��������Ʊ����
 * �ַ������ݵ������˲����Ϲ�������³�
 * �ַ������ݵĸ�Ů�����Ϲ�������³�
 * �ַ������ݵĶ�ͯ�����Ϲ�������³�
 * �ַ���ɽ���Ķ�ͯ�����Ϲ�������³�
 *///:~
