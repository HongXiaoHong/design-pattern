package cn.gd.cz.hong.action.templateMethod;

public class ChinaMaker extends ProductTemplate {

    @Override
    protected void wash() {
        System.out.println("中国式    黄河洗一下");
    }

    @Override
    protected void peel() {
        System.out.println("去皮儿");
    }

    @Override
    protected void cook() {
        System.out.println("烹饪");
    }

    @Override
    protected void makeCans() {
        System.out.println("制作罐头");
    }

    @Override
    protected void pack() {
        System.out.println("包装入袋");
    }

}
