package cn.gd.cz.hong.create.builder;

public abstract class HouseBuilder {

    private House house;

    public HouseBuilder() {
        super();
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public HouseBuilder(House house) {
        super();
        this.house = house;
    }

    public abstract void buildWall();

    public abstract void buildDoor();

    public abstract void buildLight();
}
