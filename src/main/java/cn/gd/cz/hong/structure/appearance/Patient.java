package cn.gd.cz.hong.structure.appearance;

/**
 * ������ ͬʱҲ��ҽԺ�еĲ��˽�ɫ
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��9�� ����2:12:17
 *///:)
public class Patient {

    public static void main(String[] args) {
        /*
         * ͨ�����ģʽ ���ø���ͬ�Ĳ��� �򽻵�
         * ֻ��Ҫ��һ���ۺϲ��Ž��н����Ϳ�����
         */
        Facade facade = new Facade();
        facade.regiter();

        facade.interrodate();

        facade.takeMedicine();
    }

}
/*
 * result :
Register-�Һ�
Interrogation-����
Medicine-ȡҩ
 *///:~
