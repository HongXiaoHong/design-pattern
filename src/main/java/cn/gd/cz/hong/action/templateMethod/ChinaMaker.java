package cn.gd.cz.hong.action.templateMethod;

public class ChinaMaker extends ProductTemplate {

    @Override
    protected void wash() {
        System.out.println("�й�ʽ    �ƺ�ϴһ��");
    }

    @Override
    protected void peel() {
        System.out.println("ȥƤ��");
    }

    @Override
    protected void cook() {
        System.out.println("���");
    }

    @Override
    protected void makeCans() {
        System.out.println("������ͷ");
    }

    @Override
    protected void pack() {
        System.out.println("��װ���");
    }

}
