package cn.gd.cz.hong.create.factory.temp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test()
    public void test() {
        // ͨ�������ķ�����ȡͼ��
        Shape circle = new Factory().getShape(0);
        // ����ͼ�εĻ��ķ���
        circle.draw();
    }
}