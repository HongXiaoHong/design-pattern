package cn.gd.cz.hong.action.command;

/**
 * 服务生
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月13日 下午5:14:16
 */
public class Server implements Serve {

    private Cook cook;

    public Server() {
        super();
        cook = new Cook();
    }

    @Override
    public void orderDishes(String dishName) {
        System.out.println("得到命令 准备去叫厨师做菜去");
        cook.cook(dishName);
        System.out.println("上菜");
    }

}
