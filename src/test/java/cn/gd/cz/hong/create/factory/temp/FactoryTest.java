package cn.gd.cz.hong.create.factory.temp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test()
    public void test() {
        // 通过工厂的方法获取图形
        Shape circle = new Factory().getShape(0);
        // 调用图形的画的方法
        circle.draw();
    }
}