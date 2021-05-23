package cn.gd.cz.hong.action.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * �ս�����ʽ
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����10:06:35
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        for (String str : data) {
            set.add(str);
        }
    }

    @Override
    public boolean interpret(String info) {
        for (String e : set) {
            if (e.equals(info)) {
                return true;
            }
        }
        return false;
    }

}
