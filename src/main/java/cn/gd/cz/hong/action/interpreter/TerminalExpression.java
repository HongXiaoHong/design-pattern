package cn.gd.cz.hong.action.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午10:06:35
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
