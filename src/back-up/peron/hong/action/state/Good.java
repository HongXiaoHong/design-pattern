package peron.hong.action.state;

/**
 * �����B
 * 
 * @author ������
 * @date 2019��7��14�� ����11:25:21
 * @version V1.0
 */
public class Good extends AbstractState {

	{
		stateName = "����";
	}
	public Good(AbstractState state) {
		super(state);
	}

	@Override
	public void checkState() {
		if (score >= 80) {
			if (score >= 90)
				scoreContext.setState(new Excellent(this));
		} else {
			if (score >= 60) {
				scoreContext.setState(new Pass(this));
			} else {
				if (score < 60) {
					scoreContext.setState(new Fail(this));
				}
			}
		}
	}

}
