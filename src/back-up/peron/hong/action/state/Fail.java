package peron.hong.action.state;

/**
 * ������
 * 
 * @author ������
 * @date 2019��7��14�� ����11:30:47
 * @version V1.0
 */
public class Fail extends AbstractState {

	{
		stateName = "������";
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
