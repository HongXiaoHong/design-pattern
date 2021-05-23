package peron.hong.action.visitor;
/**
 * 柠檬汽水
 * @author 洪晓鸿     
 * @date   2019年7月14日 下午7:14:18   
 * @version V1.0
 */
public class LemonSquash implements Element {

	public String material = "水，果葡萄浆，白砂糖，食品添加剂（二氧化碳，柠檬酸，柠檬酸钠，苯甲酸钠），食用香精。";
	@Override
	public void accecpt(Company visitor) {
		visitor.visit(this);
	}

}
