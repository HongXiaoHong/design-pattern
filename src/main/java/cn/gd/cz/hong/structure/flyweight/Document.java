package cn.gd.cz.hong.structure.flyweight;

/**
 * @author 洪晓鸿
 * @version V1.0
 * @note 需要被打印的文件
 * @date 2019年7月9日 下午11:33:57
 */
public class Document {

    private String name;

    public Document(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
