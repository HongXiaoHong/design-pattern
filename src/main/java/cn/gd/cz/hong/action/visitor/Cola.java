package cn.gd.cz.hong.action.visitor;

/**
 * 可乐元素
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午7:15:30
 */
public class Cola implements Element {

    public String material = "水、果葡糖浆，白砂糖、焦糖色、二氧化碳、磷酸、咖啡因、食用香料。";

    @Override
    public void accecpt(Company visitor) {
        visitor.visit(this);
    }

}
