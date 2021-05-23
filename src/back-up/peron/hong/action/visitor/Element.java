package peron.hong.action.visitor;
/**
 * 元素
 * 数据结构接口
 * 其实我觉得这里使用抽象类会更好一点
 * @author 洪晓鸿     
 * @date   2019年7月14日 下午7:11:49   
 * @version V1.0
 */
public interface Element {

	void accecpt(Company visitor);
}
