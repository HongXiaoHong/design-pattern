package peron.hong.structure.compose;

public class Department extends Structure {

	/*
	 * 如果没有指定使用父亲的哪个构造器
	 * 这里是不能编译通过的
	 * 因为我在基类中没有默认的构造器
	 * 也就是没有一个无参的构造器 
	 * 这里也就出现了编译的错误
	 */
	public Department(String name) {
		super(true, name);
	}
}
