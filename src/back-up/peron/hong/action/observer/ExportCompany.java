package peron.hong.action.observer;
/**
 * 出口公司
 * @author 洪晓鸿     
 * @date   2019年7月14日 下午1:07:17   
 * @version V1.0
 */
public class ExportCompany extends Company {

	@Override
	public void response(int number) {
		if (number > 0) {
			System.out.println("人民币汇率升值" + number + "个基点，降低了出口产品收入，降低了出口公司的销售利润率。");
		} else if (number < 0) {
			System.out.println("人民币汇率贬值" + (-number) + "个基点，提升了出口产品收入，提升了出口公司的销售利润率。");
		}
	}

}
