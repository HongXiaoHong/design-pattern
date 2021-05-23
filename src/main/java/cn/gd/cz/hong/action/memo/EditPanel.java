package cn.gd.cz.hong.action.memo;

/**
 * 编辑面板
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午9:02:20
 */
public class EditPanel {

    private String state;

    public Memo createMemo(String state) {
        this.state = state;
        return new Memo(state);
    }

    public void restoreState(Memo memo) {
        this.state = memo.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
