package peron.hong.action.mediator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QqGroup {

	private List<Qq> qqs = new LinkedList<Qq>();
	public void joinIn(Qq qq) {
		qqs.add(qq);
		qq.setQqGroup(this);
	}
	public void send(String account, String msg) {
		Iterator<Qq> iterator = qqs.iterator();
		while (iterator.hasNext()) {
			Qq qq = iterator.next();
			if (!qq.account.equals(account)) {
				qq.receive(account, msg);
			}
		}	
	}
}
