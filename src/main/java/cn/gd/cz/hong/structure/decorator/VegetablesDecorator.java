package cn.gd.cz.hong.structure.decorator;

/**
 * 加蔬菜
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月9日 上午10:45:52
 */
public class VegetablesDecorator extends Humberger {

    public VegetablesDecorator(Humberger humberger) {
        super.name = "蔬菜" + humberger.name;
    }
}
