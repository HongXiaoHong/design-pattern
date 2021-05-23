package peron.hong.action.memo;

import java.util.LinkedList;

/**
 * 容器 存放备忘录的地方
 * 
 * @author 洪晓鸿
 * @date 2019年7月14日 下午9:05:06
 * @version V1.0
 */
public class Container {

	private LinkedList<Memo> memos = new LinkedList<Memo>();

	public void addMemo(Memo memo) {
		memos.add(memo);
	}

	public Memo removeMemo() {
		// 首先弹出栈最尾的元素
		memos.pollLast();
		// 获取最后的元素
		return memos.peekLast();
	}

}
