package peron.hong.action.responsibility;
/**
 * 外国人
 * @author 洪晓鸿     
 * @date   2019年7月13日 下午11:24:33   
 * @version V1.0
 */
public class Foreigners {

	public static void main(String[] args) {
		Department en = new EnvironmentalProtection("环境保护部");
		Department foreign = new ForeignAffairs("外交部");
		en.setDep(foreign);
		
		System.out.println("外国人开始寻找有关部门");
		en.execute("国防部");
	}
}/**
result:
外国人开始寻找有关部门
您好 环境保护部为您服务 您要找的是：国防部
请到相关部门进行办理 
您好 外交部为您服务 您要找的是：国防部
请到相关部门进行办理 
无人处理  。。。 好尴尬呀
*///:~
