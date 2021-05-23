package peron.hong.structure.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestMain {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
//		for (int i = 0; i < list.size(); i++) {
//		    list.remove(i);
//		}
		/**
		 * 出現這樣的結果是因爲
		 * 在刪除的過程中因爲
		 * 數組發生變化 但是索引沒有相應改變 導致刪除不到對應的元素
		 * 
		 * result : [b, d]
		 */

//		for (String s : list) {
//			if (s.equals("a"))
//				list.remove(s);
//		}
		/**
		 * 出现下面异常的原因是因为
		 * 
		 * jdk为了防止使用foreach语法遍历集合的时候进行删除
		 * foreach语法其实就是使用iterator进行遍历
		 * 可为什么要防止呢
		 * 因为在遍历的时候集合本身的集合发生变化
		 * 但是遍历的时候索引并没有做出相应的改变
		 * 如果这个时候再删除会出现不一样的结果
		 * 所以要杜绝 但是使用Iterator对象就不一样了
		 * 它本身有对索引进行维护
		 * 所以删除的过程中也对索引进行了更新
		 * 删除可以成功
		 * result: Exception in thread "main" java.util.ConcurrentModificationException
		 * at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909) at
		 * java.util.ArrayList$Itr.next(ArrayList.java:859) at
		 * peron.hong.structure.proxy.TestMain.main(TestMain.java:18)
		 */

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			iter.next();
			iter.remove();
		}
		/**
		 * 如果不先调用next方法的话 也是会出现异常的
		 * Exception in thread "main" java.lang.IllegalStateException
	at java.util.ArrayList$Itr.remove(ArrayList.java:872)
	at peron.hong.structure.proxy.TestMain.main(TestMain.java:44)
		 * result: []
		 */
		System.out.println(list);
	}

}
