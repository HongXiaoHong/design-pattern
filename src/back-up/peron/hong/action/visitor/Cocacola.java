package peron.hong.action.visitor;
/**
 * 可口可乐公司
 * @author 洪晓鸿     
 * @date   2019年7月14日 下午7:21:43   
 * @version V1.0
 */
public class Cocacola extends Company {

	@Override
	public void visit(LemonSquash lemonSquash) {
		System.out.println("柠檬水 : 雪碧");
		System.out.println("原材料是："+ lemonSquash.material);
	}

	@Override
	public void visit(Cola cola) {
		System.out.println("可乐 : 可口可乐");
		System.out.println("原材料是："+ cola.material);
	}

}
