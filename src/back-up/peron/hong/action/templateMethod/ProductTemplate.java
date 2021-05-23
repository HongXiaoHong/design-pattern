package peron.hong.action.templateMethod;

public abstract class ProductTemplate {

	/**
	 * 制作产品的方法
	 */
	public void makeProduct() {
		wash();
		peel();
		cook();
		makeCans();
		pack();
	}
	/**
	 * 将水果洗干净
	 */
	protected abstract void wash();
	/**
	 * 去皮
	 */
	protected abstract void peel();
	/**
	 * 烹饪
	 */
	protected abstract void cook();
	/**
	 * 装入罐头
	 */
	protected abstract void makeCans();
	/**
	 * 包装
	 */
	protected abstract void pack();
	
}
