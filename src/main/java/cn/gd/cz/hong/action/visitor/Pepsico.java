package cn.gd.cz.hong.action.visitor;

/**
 * 百事可乐公司
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午7:21:43
 */
public class Pepsico extends Company {

    @Override
    public void visit(LemonSquash lemonSquash) {
        System.out.println("柠檬水 : 七喜");
        System.out.println("原材料是：" + lemonSquash.material);
    }

    @Override
    public void visit(Cola cola) {
        System.out.println("可乐 : 百事可乐");
        System.out.println("原材料是：" + cola.material);
    }

}
