package peron.hong.structure.decorator;
/**
 * 加辣椒
 * @author 洪晓鸿     
 * @date   2019年7月9日 上午10:45:43   
 * @version V1.0
 */
public class PepperDecorator extends Humberger {
	
	public PepperDecorator(Humberger humberger) {
		super.name = "辣椒" + humberger.name;
	}
}
