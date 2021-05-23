package cn.gd.cz.hong.action.strategy;

/**
 * 清蒸  streamed
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月13日 下午1:34:27
 */
public class Steamed implements Cooking {

    @Override
    public void cook() {
        System.out.println("清蒸   清淡必备 加少许盐巴即可");
    }

}
