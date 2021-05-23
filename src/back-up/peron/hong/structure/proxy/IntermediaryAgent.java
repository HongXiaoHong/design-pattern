package peron.hong.structure.proxy;
/**
 * 中介方
 * 从房地产商拿到房源后
 * 使用销售技巧将房子卖给顾客
 * 最后从中赚取一定的中介费
 * @author 洪晓鸿     
 * @date   2019年6月28日 下午2:41:03   
 * @version V1.0
 */
public class IntermediaryAgent implements Seller {

	private LandAgent landAgent;
	/**
	 * 销售前
	 */
	public void preSell() {
		System.out.println("中介1-从房地产商拿到房源");
		System.out.println("中介2-向顾客展示房子");
	}
	/**
	 * 销售后
	 */
	public void postSell() {
		System.out.println("中介3-销售订单完成，卖出房子");
		System.out.println("中介4-帮助用户办理各种手续");
	}
	@Override
	public void sell() {
		setLandAgent(new LandAgent());
		preSell();
		landAgent.sell();
		postSell();
	}
	public LandAgent getLandAgent() {
		return landAgent;
	}
	public void setLandAgent(LandAgent landAgent) {
		this.landAgent = landAgent;
	}

}
