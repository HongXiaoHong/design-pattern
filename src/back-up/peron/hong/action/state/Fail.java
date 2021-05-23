package peron.hong.action.state;

/**
 * 不及格
 * 
 * @author 洪晓鸿
 * @date 2019年7月14日 上午11:30:47
 * @version V1.0
 */
public class Fail extends AbstractState {

	{
		stateName = "不及格";
	}
	public Fail(AbstractState state) {
		super(state);
	}

	public Fail(ScoreContext scoreContext) {
		this.scoreContext = scoreContext;
	}

	@Override
	public void checkState() {
		if (score >= 60) {
			if (score >= 90) {
				scoreContext.setState(new Excellent(this));
			} else {
				if (score >= 80) {
					scoreContext.setState(new Good(this));
				} else {
					scoreContext.setState(new Pass(this));
				}
			}
		}
	}

}
