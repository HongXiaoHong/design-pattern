package peron.hong.structure.proxy;
/**
 * �н鷽
 * �ӷ��ز����õ���Դ��
 * ʹ�����ۼ��ɽ����������˿�
 * ������׬ȡһ�����н��
 * @author ������     
 * @date   2019��6��28�� ����2:41:03   
 * @version V1.0
 */
public class IntermediaryAgent implements Seller {

	private LandAgent landAgent;
	/**
	 * ����ǰ
	 */
	public void preSell() {
		System.out.println("�н�1-�ӷ��ز����õ���Դ");
		System.out.println("�н�2-��˿�չʾ����");
	}
	/**
	 * ���ۺ�
	 */
	public void postSell() {
		System.out.println("�н�3-���۶�����ɣ���������");
		System.out.println("�н�4-�����û������������");
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
