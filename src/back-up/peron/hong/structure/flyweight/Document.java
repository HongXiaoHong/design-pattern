package peron.hong.structure.flyweight;
/**
 * @note 需要被打印的文件
 * @author 洪晓鸿     
 * @date   2019年7月9日 下午11:33:57   
 * @version V1.0
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
