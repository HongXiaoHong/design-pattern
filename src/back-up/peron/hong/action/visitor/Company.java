package peron.hong.action.visitor;
/**
 * 公司 也就是访问者
 * @author 洪晓鸿     
 * @date   2019年7月14日 下午7:31:11   
 * @version V1.0
 */
public abstract class Company {

	public abstract void visit(LemonSquash lemonSquash);
	public abstract void visit(Cola cola);
}
