package cn.gd.cz.hong.action.templateMethod;

public class RussiaMaker extends ProductTemplate {

    @Override
    protected void wash() {
        System.out.println("俄罗斯式     мыть ");
    }

    @Override
    protected void peel() {
        System.out.println("удаление кожи ");
    }

    @Override
    protected void cook() {
        System.out.println(" кулинария ");
    }

    @Override
    protected void makeCans() {
        System.out.println("производить консервы ");
    }

    @Override
    protected void pack() {
        System.out.println(" упаковка ");
    }

}
