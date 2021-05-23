package peron.hong.action.templateMethod;

public class Manufacturer {

	public static void main(String[] args) {
		ProductTemplate template = new ChinaMaker();
		template.makeProduct();
		
		template = new RussiaMaker();
		template.makeProduct();
	}

}
/**
 * result:
中国式    黄河洗一下
去皮儿
烹饪
制作罐头
包装入袋
俄罗斯式    ?мыть?
удаление кожи?
?кулинария?
производить консервы?
?упаковка?
 *///:~
