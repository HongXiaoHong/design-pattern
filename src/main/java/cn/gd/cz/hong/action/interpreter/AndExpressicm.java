package cn.gd.cz.hong.action.interpreter;

/**
 * 且逻辑表达式
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午10:06:12
 */
public class AndExpressicm implements Expression {

    private Expression city;
    private Expression person;

    public AndExpressicm(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] arr = info.split("的");
        boolean result = city.interpret(arr[0]) && person.interpret(arr[1]);
        if (result) {
            System.out.println("字符串" + info + "符合规则" + "可以免票乘坐");
        } else {
            System.out.println("字符串" + info + "不符合规矩" + "请您下车");
        }
        return result;
    }

}
