package cn.gd.cz.hong.action.strategy;

/**
 * 一个厨师准备制作一道排骨相关的菜式
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月13日 下午1:42:53
 */
public class Cooker {

    public static void main(String[] args) {
        Cooking cooking = new Steamed();

        CookSpareribs cookSpareibs = new CookSpareribs();
        cookSpareibs.setCooking(cooking);
        cookSpareibs.cookSpareribs();

        cooking = new BraiseInSoySauce();
        cookSpareibs.setCooking(cooking);
        cookSpareibs.cookSpareribs();

        cooking = new Soup();
        cookSpareibs.setCooking(cooking);
        cookSpareibs.cookSpareribs();
    }

}/**
 * result:
 * 准备好调味品 食材
 * Start 开始做菜
 * 清蒸   清淡必备 加少许盐巴即可
 * End 一道美味的排骨菜式新鲜出炉
 * 准备好调味品 食材
 * Start 开始做菜
 * 红烧  油炸后加入加入各种调料  芬芳四溢
 * End 一道美味的排骨菜式新鲜出炉
 * 准备好调味品 食材
 * Start 开始做菜
 * 拿来煮汤   可以加入冬瓜 或者 草菇其他调味品
 * End 一道美味的排骨菜式新鲜出炉
 *///:~