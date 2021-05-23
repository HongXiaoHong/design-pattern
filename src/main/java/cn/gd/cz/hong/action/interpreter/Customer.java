package cn.gd.cz.hong.action.interpreter;

/**
 * 客户
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午10:01:02
 */
public class Customer {
    /*文法规则
      <expression> ::= <city>的<person>
      <city> ::= 潮州|广州
      <person> ::= 老人|孕妇|小孩|残疾人
    */
    public static void main(String[] args) {
        Context context = new Context();
        context.freeRide("潮州的老人");
        context.freeRide("潮州的年轻人");
        context.freeRide("广州的妇女");
        context.freeRide("广州的儿童");
        context.freeRide("山东的儿童");
    }

}/**
 * result:
 * 字符串潮州的老人符合规则可以免票乘坐
 * 字符串潮州的年轻人不符合规矩请您下车
 * 字符串广州的妇女不符合规矩请您下车
 * 字符串广州的儿童不符合规矩请您下车
 * 字符串山东的儿童不符合规矩请您下车
 *///:~
