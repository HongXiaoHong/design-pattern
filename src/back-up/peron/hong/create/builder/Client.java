package peron.hong.create.builder;

public class Client {

	public static void main(String[] args) {
		// 这里有一个空房子
		House house = new House();
		// 雇佣一个建筑工人
		HouseBuilder builder = new BuilderOne(house);
		// 建筑工人建房子
		ProjectManager manager = new ProjectManager(builder);
		// 房子建好归还给客户
		house = manager.decorate();
		// 输出结果
		System.out.println("result--House:"+house);
		
	}

}
/* 结果 ：
* result--House:House [wall=水墙, door=水门, light=彩虹灯]
*///:~