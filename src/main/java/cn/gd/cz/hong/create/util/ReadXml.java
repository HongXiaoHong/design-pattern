package cn.gd.cz.hong.create.util;

import java.io.InputStream;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class ReadXml {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getObject(String fileName) {
        try {
            // peron/hong/create/factory/util/config.xml
            // 我试过把config文件放到根目录下 但是类加载器是从bin开始的
            // 加上../ 后我发现并没有找到那个文件 
            // 退而求其次吧 我将其放置到了src目录下
            InputStream in = ReadXml.class.getClassLoader().getResourceAsStream("config/" + fileName);
            //创建文档对象
            Document doc;
            doc = parse(in);
            //获取包含类名的文本节点
            //Element root = doc.getRootElement();
//遍历子节点
//            List<Element> elements = root.elements();
//            for (Element e : elements) {
//            	System.out.println(e.getName());
//            }
// System.get() 可以获取系统属性 我们可以在这里设置 然后读取
//            Properties properties = System.getProperties();
//            Set<Object> keySet = properties.keySet();
//            for (Object key: keySet) {
//            	System.out.println(key+","+properties.get(key));
//            }
            // 使用xpath获取结点 / 斜杠表示从根节点写起 读起
            Node selectedNode = doc.selectSingleNode("/config/className");
            //Element selectedNode = root.element("className");

            String value = selectedNode.getStringValue();
            //System.out.println("新类名："+cName);
            //通过类名生成实例对象并将其返回
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

    // 测试函数
    public static void main(String[] args) {
        Object obj = getObject("config.xml");
        System.out.println("类型:" + obj.getClass());
    }
}
