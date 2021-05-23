package cn.gd.cz.hong.action.strategy;

/**
 * 做汤  Soup
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月13日 下午1:34:27
 */
public class Soup implements Cooking {

    @Override
    public void cook() {
        System.out.println("拿来煮汤   可以加入冬瓜 或者 草菇其他调味品");
    }

}
