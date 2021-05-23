package cn.gd.cz.hong.create.builder;

public class BuilderOne extends HouseBuilder {

    public BuilderOne(House house) {
        super(house);
    }

    @Override
    public void buildWall() {
        super.getHouse().setWall("ˮǽ");
    }

    @Override
    public void buildDoor() {
        super.getHouse().setDoor("ˮ��");
    }

    @Override
    public void buildLight() {
        super.getHouse().setLight("�ʺ��");
    }

}
