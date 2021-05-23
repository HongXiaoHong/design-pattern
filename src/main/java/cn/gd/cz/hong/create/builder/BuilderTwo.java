package cn.gd.cz.hong.create.builder;

public class BuilderTwo extends HouseBuilder {

    public BuilderTwo(House house) {
        super(house);
    }

    @Override
    public void buildWall() {
        super.getHouse().setWall("巧克力墙壁");
    }

    @Override
    public void buildDoor() {
        super.getHouse().setDoor("巧克力门");
    }

    @Override
    public void buildLight() {
        super.getHouse().setLight("巧克力灯");
    }

}
