package cn.gd.cz.hong.action.memo;

/**
 * 备忘录
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午9:01:30
 */
public class Memo {

    private String state;

    public Memo(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
