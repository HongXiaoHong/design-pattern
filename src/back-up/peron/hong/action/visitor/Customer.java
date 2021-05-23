package peron.hong.action.visitor;
/**
 * 顾客
 * @author 洪晓鸿     
 * @date   2019年7月14日 下午7:30:26   
 * @version V1.0
 */
public class Customer {

	public static void main(String[] args) {
		ObjectStrcture strct = new ObjectStrcture();
		strct.add(new Cola());
		strct.add(new LemonSquash());
		// 设置是可口可乐公司制造
		strct.setVisitor(new Cocacola());
		strct.accept();
		// 设置是百事可乐公司制造
		strct.setVisitor(new Pepsico());
		strct.accept();
	}

}
/**
result:
可乐 : 可口可乐
原材料是：水、果葡糖浆，白砂糖、焦糖色、二氧化碳、磷酸、咖啡因、食用香料。
柠檬水 : 雪碧
原材料是：水，果葡萄浆，白砂糖，食品添加剂（二氧化碳，柠檬酸，柠檬酸钠，苯甲酸钠），食用香精。
可乐 : 百事可乐
原材料是：水、果葡糖浆，白砂糖、焦糖色、二氧化碳、磷酸、咖啡因、食用香料。
柠檬水 : 七喜
原材料是：水，果葡萄浆，白砂糖，食品添加剂（二氧化碳，柠檬酸，柠檬酸钠，苯甲酸钠），食用香精。
*/