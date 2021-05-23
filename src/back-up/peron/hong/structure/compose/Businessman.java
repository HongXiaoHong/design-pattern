package peron.hong.structure.compose;

public class Businessman {

	public static void main(String[] args) {
		Company com = new Company("总公司");
		com.add(new Department("技术部"));
		com.add(new Department("销售部"));
		com.add(new Department("财务部"));
		com.add(new Department("人事部"));
		com.show();
	}

}
/**
 * result:
My name is 技术部
My name is 销售部
My name is 财务部
My name is 人事部

 */
