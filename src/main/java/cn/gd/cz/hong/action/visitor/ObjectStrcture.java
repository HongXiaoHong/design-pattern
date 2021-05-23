package cn.gd.cz.hong.action.visitor;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 存放元素的数据结构类
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午7:30:36
 */
public class ObjectStrcture {

    public List<Element> elements = new LinkedList<Element>();
    private Company visitor;

    public void setVisitor(Company visitor) {
        this.visitor = visitor;
    }

    public void accept() {
        Iterator<Element> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Element next = iterator.next();
            next.accecpt(visitor);
        }
    }

    public void add(Element ele) {
        elements.add(ele);
    }

    public void remove(Element ele) {
        elements.remove(ele);
    }
}
