package cn.gd.cz.hong.action.interpreter;

/**
 * ���߼����ʽ
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����10:06:12
 */
public class AndExpressicm implements Expression {

    private Expression city;
    private Expression person;

    public AndExpressicm(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] arr = info.split("��");
        boolean result = city.interpret(arr[0]) && person.interpret(arr[1]);
        if (result) {
            System.out.println("�ַ���" + info + "���Ϲ���" + "������Ʊ����");
        } else {
            System.out.println("�ַ���" + info + "�����Ϲ��" + "�����³�");
        }
        return result;
    }

}
