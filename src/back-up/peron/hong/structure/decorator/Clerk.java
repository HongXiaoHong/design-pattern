package peron.hong.structure.decorator;
/**
 * 店员 销售汉堡包
 * @author 洪晓鸿     
 * @date   2019年7月9日 上午10:48:39   
 * @version V1.0
 */
public class Clerk {

	public static void main(String[] args) {
		Base base = new Base();
		VegetablesDecorator veg = new VegetablesDecorator(base);
		veg.show();
		
		PepperDecorator pep = new PepperDecorator(veg);
		pep.show();
	}

}
