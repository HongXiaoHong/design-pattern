package peron.hong.action.iterator;

import java.util.Iterator;

/**
 * 巧克力盒裝
 * 
 * @author 洪晓鸿
 * @date 2019年7月14日 下午5:07:29
 * @version V1.0
 */
public class ChocolateList {

	Chocolate[] chocolates;
	int length = 0;

	public ChocolateList(int size) {
		chocolates = new Chocolate[size];
	}

	public void addChocolate(Chocolate chocolate) {
		if (length < chocolates.length)
			chocolates[length++] = chocolate;
	}
	
	public Iterator<Chocolate> iterator() {
		return new chocolateIterator();
	}
	private class chocolateIterator implements Iterator<Chocolate> {
		
		private int now = 0;
		@Override
		public boolean hasNext() {
			return now<length;
		}

		@Override
		public Chocolate next() {
			return chocolates[now++];
		}

	}
	
}
