package cn.gd.cz.hong.create.builder;

public class BuilderOne extends HouseBuilder {

    public BuilderOne(House house) {
        super(house);
    }

    @Override
    public void buildWall() {
        super.getHouse().setWall("Ë®Ç½");
    }

    @Override
    public void buildDoor() {
        super.getHouse().setDoor("Ë®ÃÅ");
    }

    @Override
    public void buildLight() {
        super.getHouse().setLight("²ÊºçµÆ");
    }

}
