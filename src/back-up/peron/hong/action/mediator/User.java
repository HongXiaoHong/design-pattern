package peron.hong.action.mediator;

public class User {

	public static void main(String[] args) {
		Qq hong = new Qq("hong");
		Qq ping = new Qq("ping");
		QqGroup qqGroup = new QqGroup();
		qqGroup.joinIn(hong);
		qqGroup.joinIn(ping);
		hong.send(" ping i like you ");
		ping.send(" hong you are good but i don't like you");
	}

}
/**
result:
�˺ţ�ping�յ��˺�hong��Ϣ
��Ϣ�� ping i like you 
�˺ţ�hong�յ��˺�ping��Ϣ
��Ϣ�� hong you are good but i don't like you
*///:~