package peron.hong.action.iterator;

import java.util.Iterator;
/**
 * 美食家
 * @author 洪晓鸿     
 * @date   2019年7月14日 下午5:23:16   
 * @version V1.0
 */
public class Foodie {

	public static void main(String[] args) {
		ChocolateList chocolateList = new ChocolateList(10);
		chocolateList.addChocolate(new Chocolate("正方形"));
		chocolateList.addChocolate(new Chocolate("长方形"));
		chocolateList.addChocolate(new Chocolate("圆形"));
		chocolateList.addChocolate(new Chocolate("椭圆形"));
		chocolateList.addChocolate(new Chocolate("菱形"));
		Iterator<Chocolate> it = chocolateList.iterator();
		while (it.hasNext()) {
			Chocolate next = it.next();
			System.out.format("取出巧克力%s, 开吃\n", next.name);
		}
	}

}
/**
result:
取出巧克力正方形, 开吃
取出巧克力长方形, 开吃
取出巧克力圆形, 开吃
取出巧克力椭圆形, 开吃
取出巧克力菱形, 开吃
*///:~