package cn.gd.cz.hong.create.factory;

public class AsusCompany implements Company {

    @Override
    public Computer produce() {
        return new Asus();
    }

}
