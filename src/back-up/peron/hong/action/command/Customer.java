package peron.hong.action.command;
/**
 * 顾客
 * @author 洪晓鸿     
 * @date   2019年7月13日 下午5:31:56   
 * @version V1.0
 */
public class Customer {

	public static void main(String[] args) {
		Serve serve = new Server();
		serve.orderDishes("蒸羊羔");
		serve.orderDishes("豆角炒腊肉");
	}

}/**
result:
得到命令 准备去叫厨师做菜去
我准备做蒸羊羔菜
菜做好了 上菜 服务生
上菜
得到命令 准备去叫厨师做菜去
准备材料 ： 豆角，腊肉，蒜蓉适量
《步骤》
1、豆角摘好，稍飞一下水，腊肉切成小片备用；
2、热油锅下蒜蓉爆香，再下腊肉炒到透明铲起备用，再下豆角加点水炒熟，最后下腊肉一起炒合味，下点盐和鸡精调好味即可。
菜做好了 上菜 服务生
上菜
*///:~
