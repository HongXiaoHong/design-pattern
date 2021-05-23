package cn.gd.cz.hong.action.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 汇率
 */
public class Rate {
    private List<Company> companies = new LinkedList<Company>();

    public void add(Company company) {
        companies.add(company);
    }

    public void remove(Company company) {
        throw new RuntimeException("暂时没有实现");
    }

    public void change(int num) {
        for (Company company : companies) {
            company.response(num);
        }
    }

}