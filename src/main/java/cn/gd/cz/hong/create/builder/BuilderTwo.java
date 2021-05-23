package cn.gd.cz.hong.create.builder;

public class BuilderTwo extends HouseBuilder {

    public BuilderTwo(House house) {
        super(house);
    }

    @Override
    public void buildWall() {
        super.getHouse().setWall("�ɿ���ǽ��");
    }

    @Override
    public void buildDoor() {
        super.getHouse().setDoor("�ɿ�����");
    }

    @Override
    public void buildLight() {
        super.getHouse().setLight("�ɿ�����");
    }

}
