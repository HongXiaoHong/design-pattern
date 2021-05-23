package peron.hong.action.memo;
/**
 * �༭���
 * @author ������     
 * @date   2019��7��14�� ����9:02:20   
 * @version V1.0
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
