package cn.gd.cz.hong.action.strategy;

/**
 * 制作排骨相关菜式
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月13日 下午1:37:21
 */
public class CookSpareribs {

    private Cooking cooking;

    public Cooking getCooking() {
        return cooking;
    }

    public void setCooking(Cooking cooking) {
        this.cooking = cooking;
    }

    public void cookSpareribs() {
        System.out.println("准备好调味品 食材");
        System.out.println("Start 开始做菜");
        cooking.cook();
        System.out.println("End 一道美味的排骨菜式新鲜出炉");
    }
}
