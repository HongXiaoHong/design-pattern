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
�й�ʽ    �ƺ�ϴһ��
ȥƤ��
���
������ͷ
��װ���
����˹ʽ    ?�ާ���?
��էѧݧ֧ߧڧ� �ܧ�ا�?
?�ܧ�ݧڧߧѧ�ڧ�?
����ڧ٧ӧ�էڧ�� �ܧ�ߧ�֧�ӧ�?
?���ѧܧ�ӧܧ�?
 *///:~
