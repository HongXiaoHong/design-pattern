package peron.hong.action.mediator;

public class Qq {
// ֻ�ڸ�package�ڷ���
	String account;
	QqGroup qqGroup;
	public Qq(String account) {
		this.account = account;
	}
	public void send (String msg) {
		qqGroup.send(account, msg);
	}
	public void receive(String account, String msg) {
		System.out.println("�˺ţ�"+this.account +"�յ��˺�"+ account +"��Ϣ");
		System.out.println("��Ϣ��"+ msg);
	}
	public void setQqGroup(QqGroup qqGroup) {
		this.qqGroup = qqGroup;
	}
}
