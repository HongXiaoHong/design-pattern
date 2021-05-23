package cn.gd.cz.hong.structure.proxy;

public class Customer {

    public static void main(String[] args) {
        IntermediaryAgent agent = new IntermediaryAgent();
        System.out.println("准备买房，找了个中介准备去看房。");
        agent.sell();
    }

}
