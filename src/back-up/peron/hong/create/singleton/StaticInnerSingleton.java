package peron.hong.create.singleton;
/**
 * 通过静态内部类实现单例
 * @author 洪晓鸿     
 * @date   2019年12月6日 下午10:10:23   
 * @version V1.0
 */
public class StaticInnerSingleton {

	/**
	 * 私有化构造器
	 */
	private StaticInnerSingleton() {
		System.out.println("单例模式初始化");
	}
	
	/**
	 * 获取单例对象
	 * @return
	 */
	public static StaticInnerSingleton getSingleton() {
		return Inner.singleton;
	}
	
	/**
	 * 通过静态内部类加载 
	 * @author 洪晓鸿     
	 * @date   2019年12月6日 下午10:17:00   
	 * @version V1.0
	 */
	private static class Inner {
		private static final StaticInnerSingleton singleton = new StaticInnerSingleton();
	}
	
	/**
	 * 测试一下
	 * @param args
	 */
	public static void main(String[] args) {
		StaticInnerSingleton s0 = getSingleton();
		StaticInnerSingleton s1 = getSingleton();
		if (s0==s1) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
	}

}
