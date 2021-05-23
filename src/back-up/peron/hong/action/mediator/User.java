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
账号：ping收到账号hong信息
消息： ping i like you 
账号：hong收到账号ping信息
消息： hong you are good but i don't like you
*///:~