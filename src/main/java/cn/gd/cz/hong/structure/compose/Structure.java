package cn.gd.cz.hong.structure.compose;

/**
 * 用于表示公司的结构中的各个部门的基类
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月10日 下午10:43:36
 */
public class Structure {

    // 其实我是想利用标志位进行转型 这样我就可以操作更多的方法
    private boolean flag; // it means what is leaf or not
    private String name;  // it means that Struture's name

    public Structure(boolean flag, String name) {
        this.flag = flag;
        this.name = name;
    }

    public boolean isLeaf() {
        // true means leaf false is not
        return flag;
    }

    public void show() {
        System.out.println(String.format("My name is %s", name));
    }
}
