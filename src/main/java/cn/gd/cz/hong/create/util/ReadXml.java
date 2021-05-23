package cn.gd.cz.hong.create.util;

import java.io.InputStream;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class ReadXml {
    //�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
    public static Object getObject(String fileName) {
        try {
            // peron/hong/create/factory/util/config.xml
            // ���Թ���config�ļ��ŵ���Ŀ¼�� ������������Ǵ�bin��ʼ��
            // ����../ ���ҷ��ֲ�û���ҵ��Ǹ��ļ� 
            // �˶�����ΰ� �ҽ�����õ���srcĿ¼��
            InputStream in = ReadXml.class.getClassLoader().getResourceAsStream("config/" + fileName);
            //�����ĵ�����
            Document doc;
            doc = parse(in);
            //��ȡ�����������ı��ڵ�
            //Element root = doc.getRootElement();
//�����ӽڵ�
//            List<Element> elements = root.elements();
//            for (Element e : elements) {
//            	System.out.println(e.getName());
//            }
// System.get() ���Ի�ȡϵͳ���� ���ǿ������������� Ȼ���ȡ
//            Properties properties = System.getProperties();
//            Set<Object> keySet = properties.keySet();
//            for (Object key: keySet) {
//            	System.out.println(key+","+properties.get(key));
//            }
            // ʹ��xpath��ȡ��� / б�ܱ�ʾ�Ӹ��ڵ�д�� ����
            Node selectedNode = doc.selectSingleNode("/config/className");
            //Element selectedNode = root.element("className");

            String value = selectedNode.getStringValue();
            //System.out.println("��������"+cName);
            //ͨ����������ʵ�����󲢽��䷵��
            Class<?> c = Class.forName(value);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected static Document parse(String xmlFile) throws Exception {
        SAXReader reader = new SAXReader();
        return reader.read(xmlFile);
    }

    protected static Document parse(InputStream xmlFileInputStream) throws Exception {
        SAXReader reader = new SAXReader();
        return reader.read(xmlFileInputStream);
    }

    // ���Ժ���
    public static void main(String[] args) {
        Object obj = getObject("config.xml");
        System.out.println("����:" + obj.getClass());
    }
}
