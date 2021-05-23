package cn.gd.cz.hong.action.state;

/**
 * 及格狀態
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 上午11:25:21
 */
public class Pass extends AbstractState {

    {
        stateName = "及格";
    }

    public Pass(AbstractState state) {
        super(state);
    }

    @Override
    public void checkState() {
        if (score >= 60) {
            if (score >= 90) {
                scoreContext.setState(new Excellent(this));
            } else {
                if (score >= 80)
                    scoreContext.setState(new Good(this));
            }
        } else {
            scoreContext.setState(new Fail(this));
        }
    }

}
