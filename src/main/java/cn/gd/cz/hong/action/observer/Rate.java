package cn.gd.cz.hong.action.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * ����
 */
public class Rate {
    private List<Company> companies = new LinkedList<Company>();

    public void add(Company company) {
        companies.add(company);
    }

    public void remove(Company company) {
        throw new RuntimeException("��ʱû��ʵ��");
    }

    public void change(int num) {
        for (Company company : companies) {
            company.response(num);
        }
    }

}