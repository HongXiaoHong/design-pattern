package cn.gd.cz.hong.action.state;

/**
 * 及格狀態
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 上午11:25:21
 */
public class Good extends AbstractState {

    {
        stateName = "良好";
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
