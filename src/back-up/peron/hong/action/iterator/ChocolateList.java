package peron.hong.action.iterator;

import java.util.Iterator;

/**
 * �ɿ������b
 * 
 * @author ������
 * @date 2019��7��14�� ����5:07:29
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
