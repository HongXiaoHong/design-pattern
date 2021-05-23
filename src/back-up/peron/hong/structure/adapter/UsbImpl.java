package peron.hong.structure.adapter;

public class UsbImpl implements Usb {

	@Override
	public void transfer() {
		System.out.println("连接到电脑的usb后进行传输");
	}

}
