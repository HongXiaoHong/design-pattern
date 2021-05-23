package peron.hong.action.strategy;
/**
 * 测试 浮点数取前两位小数
 * @author 洪晓鸿     
 * @date   2019年7月29日 上午9:54:42   
 * @version V1.0
 */
public class TestMain {

	public static void main(String[] args) {
		System.out.println(Math.round(1.55132 ));
		System.out.println(Math.round(1.55132 * 100));
		System.out.println(Math.round(1.55132 * 100)/100);
		System.out.println(Math.round(1.55132 * 100)*1.0/100);
	}

}/**
2
155
1
1.55
*/
