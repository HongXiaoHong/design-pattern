package peron.hong.structure.proxy.dynamic;

import java.lang.reflect.Proxy;

import peron.hong.structure.proxy.LandAgent;
import peron.hong.structure.proxy.Seller;
/*
 * 模拟用户跟中介买房
 */
public class Customer {

	public static void main(String[] args) {
		// 这个是地产经销商 也就是房源的拥有者
		LandAgent landSeller = new LandAgent();
		Handler handler = new Handler(landSeller);
		Seller proxySeller = (Seller)Proxy.newProxyInstance(LandAgent.class.getClassLoader(), new Class[] {Seller.class}, handler);
		proxySeller.sell();
	}

}/*
result：
嗯可以使用判断对执行的方法进行判断，是否执行
PRE Process
房地产商---我是房地产商，房源在我这，买房吗？老板！！！
POST Process
---------------------------------------
网上摘抄资料
动态代理的成功案例
Square公司出品的Android Restful 网络请求库Retrofit
Spring AOP （默认使用动态代理，如果没有实现接口则使用CGLIB修改字节码）
---------------------------------------
可参考如下的网址
https://www.jianshu.com/p/6e962d1e7ddd
*///:~
