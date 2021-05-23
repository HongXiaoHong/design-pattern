package peron.hong.structure.appearance;
/**
 * 测试类 同时也是医院中的病人角色
 * @author 洪晓鸿     
 * @date   2019年7月9日 下午2:12:17   
 * @version V1.0
 *///:)
public class Patient {

	public static void main(String[] args) {
		/*
		 * 通过外观模式 不用跟不同的部门 打交道
		 * 只需要跟一个综合部门进行交互就可以了
		 */
		Facade facade = new Facade();
		facade.regiter();
		
		facade.interrodate();
		
		facade.takeMedicine();
	}

}
/*
 * result :
Register-挂号
Interrogation-问诊
Medicine-取药
 *///:~
