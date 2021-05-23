package cn.gd.cz.hong.action.observer;

/**
 * 进口公司
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午1:07:24
 */
public class ImportCompany extends Company {

    @Override
    public void response(int number) {
        if (number > 0) {
            System.out.println("人民币汇率升值" + number + "个基点，降低了进口产品成本，提升了进口公司利润率。");
        } else if (number < 0) {
            System.out.println("人民币汇率贬值" + (-number) + "个基点，提升了进口产品成本，降低了进口公司利润率。");
        }
    }

}
