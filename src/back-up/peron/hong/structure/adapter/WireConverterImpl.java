package peron.hong.structure.adapter;
/**
 * 网线转换器
 * @author 洪晓鸿     
 * @date   2019年7月3日 下午5:06:57   
 * @version V1.0
 */
public class WireConverterImpl implements WireConverter {

	private Usb usb;
	/**
	 * 通过 网线的数据 在转化器的帮助下
	 * 网线的数据转换成usb进行传输
	 * usb中的数据转换为网线中的数据进行传输
	 */
	@Override
	public void surfTheInternet() {
		System.out.println("网线连接进来以后 开始传输数据！");
		System.out.println("将网线转化为usb进行连接");
		usb = new UsbImpl();
		usb.transfer();
		System.out.println("将usb传过来的数据重新包装后通过网线传输");
	}

}
