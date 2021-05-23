package peron.hong.action.state;
/**
 * 状态的抽象类
 * @author 洪晓鸿     
 * @date   2019年7月14日 上午11:14:56   
 * @version V1.0
 */
public abstract class AbstractState {

	protected ScoreContext scoreContext;
	protected int score;
	protected String stateName;
	
	public AbstractState () {
		super();
	}
	public AbstractState (AbstractState state) {
		this.score = state.score;
		this.scoreContext = state.scoreContext;
	}
	
	public abstract void checkState();
	
	public void addScore (int score) {
		this.score += score;
		checkState();
	}
	@Override
	public String toString() {
		return "State [score=" + score + ", stateName=" + stateName + "]";
	}
	
}
