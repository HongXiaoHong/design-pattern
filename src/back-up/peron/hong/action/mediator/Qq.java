package peron.hong.action.mediator;

public class Qq {
// 只在该package内访问
	String account;
	QqGroup qqGroup;
	public Qq(String account) {
		this.account = account;
	}
	public void send (String msg) {
		qqGroup.send(account, msg);
	}
	public void receive(String account, String msg) {
		System.out.println("账号："+this.account +"收到账号"+ account +"信息");
		System.out.println("消息："+ msg);
	}
	public void setQqGroup(QqGroup qqGroup) {
		this.qqGroup = qqGroup;
	}
}
