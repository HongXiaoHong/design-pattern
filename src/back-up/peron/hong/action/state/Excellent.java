package peron.hong.action.state;

/**
 * 优秀狀態
 * 
 * @author 洪晓鸿
 * @date 2019年7月14日 上午11:25:21
 * @version V1.0
 */
public class Excellent extends AbstractState {

	{
		stateName = "优秀";
	}
	public Excellent(AbstractState state) {
		super(state);
	}

	@Override
	public void checkState() {
		if (score<90) {
			if (score >= 80) {
				scoreContext.setState(new Good(this));
			} else {
				if (score >= 60) {
					scoreContext.setState(new Pass(this));
				} else {
					scoreContext.setState(new Fail(this));
				}
			}
		}
	}

}
