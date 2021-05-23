package peron.hong.action.templateMethod;

public abstract class ProductTemplate {

	/**
	 * ������Ʒ�ķ���
	 */
	public void makeProduct() {
		wash();
		peel();
		cook();
		makeCans();
		pack();
	}
	/**
	 * ��ˮ��ϴ�ɾ�
	 */
	protected abstract void wash();
	/**
	 * ȥƤ
	 */
	protected abstract void peel();
	/**
	 * ���
	 */
	protected abstract void cook();
	/**
	 * װ���ͷ
	 */
	protected abstract void makeCans();
	/**
	 * ��װ
	 */
	protected abstract void pack();
	
}
