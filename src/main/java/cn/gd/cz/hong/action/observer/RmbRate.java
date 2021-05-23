package cn.gd.cz.hong.action.observer;

/**
 * 人民币汇率
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午1:07:07
 */
public class RmbRate extends Rate {

    public static void main(String[] args) {
        System.out.println("人民汇率变化");
        Company importCompany = new ImportCompany();
        Company exportCompany = new ExportCompany();
        Rate rate = new RmbRate();
        rate.add(importCompany);
        rate.add(exportCompany);
        rate.change(10);
        rate.change(-5);
    }
}
/**
 * result:
 * 人民汇率变化
 * 人民币汇率升值10个基点，降低了进口产品成本，提升了进口公司利润率。
 * 人民币汇率升值10个基点，降低了出口产品收入，降低了出口公司的销售利润率。
 * 人民币汇率贬值5个基点，提升了进口产品成本，降低了进口公司利润率。
 * 人民币汇率贬值5个基点，提升了出口产品收入，提升了出口公司的销售利润率。
 */