package cn.gd.cz.hong.create.prototype;

//:
public class Machine {

    public static void main(String[] args) {
        Product product = new Product();
        product.setLength(5);
        product.setWidth(4);
        product.setHeight(6);
        // metal ����  material ����
        product.setMaterial("metal");
        try {
            Product copy = (Product) product.clone();
            String result = String.format("copy֮��õ��Ķ��������ֵΪ������--%s�����--%s���߶�--%s������--%s��", copy.getLength(), copy.getWidth(), copy.getHeight(), copy.getMaterial());
            System.out.println(result);
            System.out.println("����֮���Ƿ���ȣ�" + (product == copy ? "���" : "�����"));
        } catch (CloneNotSupportedException e) {
            System.out.println("��¡�����쳣");
            e.printStackTrace();
        }

    }

}
/* result-->
 *������һ����Ʒ
 *copy֮��õ��Ķ��������ֵΪ������--5�����--4���߶�--6������--metal��
 *����֮���Ƿ���ȣ������
 * ������� ��StringҲ���Եõ���¡ ԭ��StringҲ����ǳ��¡�� һ����ѽ
 * copy�����ٵ��ù�����
 * ����֮��Ķ���������Ķ����ԭ���Ķ�����ͬһ��
 *///:~