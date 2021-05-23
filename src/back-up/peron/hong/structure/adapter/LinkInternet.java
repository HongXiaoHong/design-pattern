package peron.hong.structure.adapter;
/**
 * 
 * @author 洪晓鸿     
 * @date   2019年7月3日 下午5:11:59   
 * @version V1.0
 *///:)
public class LinkInternet {

	public static void main(String[] args) {
		System.out.println("我要上网了 可惜这电脑只能连WiFi");
		System.out.println("WiFi太慢了 我要爆炸了 我要连接有线 ");
		System.out.println("可惜的是这电脑轻薄到没有网线接口  看来我使出网线usb转换器了");
		WireConverter coverter = new WireConverterImpl();
		coverter.surfTheInternet();
		System.out.println("太爽了 这网速可以呀 完美");
	}

}
/**
result :
我要上网了 可惜这电脑只能连WiFi
WiFi太慢了 我要爆炸了 我要连接有线 
可惜的是这电脑轻薄到没有网线接口  看来我使出网线usb转换器了
网线连接进来以后 开始传输数据！
将网线转化为usb进行连接
连接到电脑的usb后进行传输
将usb传过来的数据重新包装后通过网线传输
太爽了 这网速可以呀 完美
*///:~