package cn.gd.cz.hong.structure.proxy;

/**
 * 房地产商 专业卖房
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年6月28日 下午2:39:01
 */
public class LandAgent implements Seller {

    @Override
    public void sell() {
        System.out.println("房地产商---我是房地产商，房源在我这，买房吗？老板！！！");
    }

}
