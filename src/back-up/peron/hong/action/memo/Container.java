package peron.hong.action.memo;

import java.util.LinkedList;

/**
 * ���� ��ű���¼�ĵط�
 * 
 * @author ������
 * @date 2019��7��14�� ����9:05:06
 * @version V1.0
 */
public class Container {

	private LinkedList<Memo> memos = new LinkedList<Memo>();

	public void addMemo(Memo memo) {
		memos.add(memo);
	}

	public Memo removeMemo() {
		// ���ȵ���ջ��β��Ԫ��
		memos.pollLast();
		// ��ȡ����Ԫ��
		return memos.peekLast();
	}

}
