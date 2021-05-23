package peron.hong.structure.bridge;

public class Customer {

	public static void main(String[] args) {
		
		// 厂家已经制作了一个包包摆放在柜台处
		Color color = new Red();
		Bag bag = new Bag(color, "挎包");
		// 一位 先生精心挑选后 准备送给他的女朋友
		bag.getName();
	}
}
